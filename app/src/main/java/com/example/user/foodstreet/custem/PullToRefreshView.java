package com.example.user.foodstreet.custem;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 自定义下拉刷新控件
 */
public class PullToRefreshView extends LinearLayout implements View.OnTouchListener, AbsListView.OnScrollListener {


    private static final String TAG = "print";
    /**
     * 下拉刷新的头部
     */
    private View headView;
    private int headViewHeight;//头部控件的高度

    /**
     * 下拉刷新中的ListView，主要用于显示内容
     */
    private ListView lv;

    /**
     * 定义几个下拉刷新的状态
     */
    private static final int NONE = 0;//普通状态
    private static final int PULL = 1;//下拉状态
    private static final int PULL_REFRESH = 2;//下拉即将刷新状态
    private static final int REFRESH = 3;//正在刷新
    private int state = NONE;//当前控件的状态位，默认为普通状态

    /**
     * 标志位，标示ListView是否显示第一个Item
     */
    private boolean isPullTopItem = true;


    /**
     * 接口定义
     */
    private OnPullToRefreshListener onPullToRefreshListener;

    public PullToRefreshView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    /**
     * 初始化控件
     */
    private void init() {
        this.setOrientation(VERTICAL);//设置该LinearLayout的方向为纵向
    }

    public void setOnPullToRefreshListener(OnPullToRefreshListener onPullToRefreshListener) {
        this.onPullToRefreshListener = onPullToRefreshListener;
    }

    /**
     * 方法重载，用于接收一个布局文件的ID
     * @param resid
     */
    public void setHeadView(int resid){
        View view = LayoutInflater.from(getContext()).inflate(resid, null);
        setHeadView(view);
    }

    /**
     * 提供给外界调用，设置头部的布局控件，外界必须调用该方法
     */
    public void setHeadView(View headView){
        this.headView = headView;
        initView();
    }

    /**
     * 初始化布局页面
     */
    private void initView() {
        /**
         * 设置头部对象，并且加入线性布局
         */
        headView.measure(0, 0);
        headViewHeight = headView.getMeasuredHeight();
        headView.setPadding(0, -headViewHeight, 0, 0);
        this.addView(headView);


        /**
         * 设置ListView 并且加入线性布局中
         */
        lv = new ListView(getContext());
        lv.setOnTouchListener(this);
        lv.setOnScrollListener(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        this.addView(lv, layoutParams);
    }


    /**
     * 将ListView的常用的一些方法暴露给外部调用
     * @param adatper
     */
    public void setAdatper(ListAdapter adatper) {
        lv.setAdapter(adatper);
    }

    public void addHeadView(View headView){
        lv.addHeaderView(headView);
    }

    /**
     * 直接将ListView暴露给外部调用
     * @return
     */
    public ListView getListView(){
        return lv;
    }


    /**
     * ListView的滑动监听方法
     * onTouch监听会先于ListView内部的onTouchEvent方法被调用，
     * 如果onTouch监听返回false,那么ListView内部的onTouchEvent方法被正常调用，
     * 如果onTouch监听返回true，那么ListVide内部的onTouchEvent方法将不再调用
     * @param v
     * @param event
     * @return
     */
    private int by = -1;//定义一个初始位置的坐标
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                if(isPullTop()){
                    /**
                     * 计算手指滑动的偏移量
                     */
                    int y = (int) event.getRawY();
                    if(by == -1){
                        by = y;
                    }
                    int movey = y - by;
                    by = y;

                    if(movey <= 0 && headView.getPaddingTop() <= -headViewHeight && state == NONE){
                        //往上滑动，事件交给ListView处理
                        //头部为隐藏状态的时候才允许下拉
                        return false;
                    }

                    //开始处理头部的PaddingTop
                    headView.setPadding(0, headView.getPaddingTop() + movey/2, 0, 0);
                    if (headView.getPaddingTop() > -headViewHeight && state == NONE){
                        state = PULL;//将状态改为正在下拉状态
                    }
                    //-------------------在这里进行一些下拉的回调--------------
                    if(onPullToRefreshListener != null){
                        onPullToRefreshListener.onPullMovie(headView.getPaddingTop() + headViewHeight, headView);
                    }

                    if (headView.getPaddingTop() >= 0){
                        state = PULL_REFRESH;//将状态修改为松手刷新状态
                    } else {
                        state = PULL;
                    }

                    //将事件进行拦截，ListView将无法滑动
                    return true;
                }
                break;
            case MotionEvent.ACTION_UP:
                reset();
                break;
        }
        return false;
    }

    /**
     * 松手重置下拉刷新的方法
     */
    private Handler handler = new Handler();
    private int backHeight = -headViewHeight;//表示下拉控件需要返回的高度
    private void reset() {
        by = -1;//重置初始的位置记录
        if(state == NONE){
            return;
        }

        /**
         * 当状态为下拉状态或者正在刷新状态时，需要将头部完全隐藏
         */
        if(state == PULL || state == REFRESH){
            backHeight = -headViewHeight;
            state = NONE;
        } else if (state == PULL_REFRESH){
            backHeight = 0;//当状态为正在刷新状态时，将返回的高度置为0，刚好显示整个头部
            state = REFRESH;

            //----------正在刷新，回调刷新方法--------------
            if(onPullToRefreshListener != null){
                onPullToRefreshListener.onRefresh(headView);
            }
        }

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (headView.getPaddingTop() > backHeight) {//表示还没有回到指定的位置
                            headView.setPadding(0, headView.getPaddingTop() - 5, 0, 0);
                        } else {
                            headView.setPadding(0, backHeight, 0, 0);
                            timer.cancel();
                        }
                    }
                });
            }
        }, 0, 5);

    }

    /**
     * 判断ListView是否置顶
     * 返回true，表示可以下拉
     * 返回false，表示不能下拉
     * @return
     */
    private boolean isPullTop(){
        if(state == REFRESH){
            return false;
        }

        if(lv.getChildCount() > 0){
            View view = lv.getChildAt(0);
            if(isPullTopItem && view.getTop() == 0){
                //当第一个item显示出来，并且第一个item的top坐标等于0，表示ListView已经置顶，可以开始下拉
                return true;
            } else {
                return false;
            }

        } else {
            return true;
        }
    }

    /**
     * listview的滑动监听
     * @param view
     * @param scrollState
     */
    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if(firstVisibleItem == 0){
            isPullTopItem = true;
        } else {
            isPullTopItem = false;
        }
    }

    /**
     * 刷新完成调用该方法s
     */
    public void refreshComplete(){
        reset();
        state = NONE;
        /**
         * 刷新完成回调方法
         */
        if(onPullToRefreshListener != null){
            onPullToRefreshListener.onRefreshCompelet(headView);
        }
    }

    /**
     * 下拉刷新接口回调
     */
    public interface OnPullToRefreshListener{
        /**
         * 正在下拉的回调方法
         */
        void onPullMovie(int movey, View headView);

        /**
         * 正在刷新
         */
        void onRefresh(View headView);

        /**
         * 刷新完成的回调方法
         * @param headView
         */
        void onRefreshCompelet(View headView);
    }
}

