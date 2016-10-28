package com.wang.www.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.viewpagerindicator.CirclePageIndicator;
import com.wang.www.R;
import com.wang.www.adapter.RecommendViewPagerAdapter;
import com.wang.www.base.BaseFragment;
import com.wang.www.custem.RecommendFragmentVPView;
import com.wang.www.custem.RecommendView;
import com.wang.www.model.MainEntity;
import com.wang.www.model.RecommendEntity;
import com.wang.www.util.Constants;
import com.wang.www.util.FrescoUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/25.
 */
public class RecommendFragment extends BaseFragment {
    private String TAG = "RecommendFragment";
    //    private List<MainEntity.ObjEntity.SanCanEntity> sanCanEntitie;
    private List<ArrayList<MainEntity.ObjEntity.SanCanEntity>> sanCanEntities;//这是ViewPager传递的数据
    private List<ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities;
    //    @Bind(R.id.fragment_recommend_ptrView)
//    public PullToRefreshView pullToRefreshView;
    private RecommendFragmentVPView recommendFragmentVPView;
    private Handler handler = new Handler();
    private String name;
    private AnimationDrawable animation;
    private RecommendView recommendView;
    private PullToRefreshListView recommendListView;
    private ViewPager viewPager;

    @Override
    protected int getViewResId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void init(View view) {
        super.init(view);
        recommendListView = (PullToRefreshListView) view.findViewById(R.id.recommend_ptr);
        SimpleDraweeView recommendSdv = (SimpleDraweeView) view.findViewById(R.id.recommend_sdv);
        FrescoUtil.imageViewBind("http://img.sootuu.com/vector/200801/097/310.jpg", recommendSdv);
        ImageView imageView = (ImageView) view.findViewById(R.id.recommend_iv);
        Glide.with(this).load("http://img1.imgtn.bdimg.com/it/u=1293775107,6809434&fm=21&gp=0.jpg").into(imageView);
        viewPager = (ViewPager) view.findViewById(R.id.recommend_vp);

//        pullToRefreshView.setHeadView(R.layout.custem_ptr_headview);
//        pullToRefreshView.getListView().setOnItemClickListener(this);
//        pullToRefreshView.setOnPullToRefreshListener(new PullToRefreshView.OnPullToRefreshListener() {
//
//            @Override
//            public void onPullMovie(int movey, View headView) {
//                TextView textView= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
//                //下拉刷新
//                textView.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_on_pull_movie));
////                Log.e(TAG, "onPullMovie: movey="+movey);
//                if(movey>200){
//                    TextView textView1= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
//                    //松开刷新数据
//                    textView1.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_on_refresh));
//                }
//            }
//
//            @Override
//            public void onRefresh(View headView) {
//                TextView textView= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
//                //正在加载
//                textView.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_refresh_complete));
//                //设置下拉刷新的。
//                ImageView iv = (ImageView) headView.findViewById(R.id.iv_wait);
//                Drawable drawable=getResources().getDrawable(R.drawable.wait_anim);
//                iv.setBackground(drawable);
//                animation = (AnimationDrawable) iv.getBackground();
//                animation.start();
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        pullToRefreshView.refreshComplete();
//                    }
//                }, 5000);
//            }
//
//            @Override
//            public void onRefreshCompelet(View headView) {
//
////                handler.postDelayed(new Runnable() {
////                    @Override
////                    public void run() {
////                        pullToRefreshView.refreshComplete();
////                    }
////                }, 2000);
//                animation.stop();
//            }
//        });
        //给下拉刷新设置适配器
        //这个是首页的早餐 ，中餐和晚餐的ViewPager
//        recommendFragmentVPView = new RecommendFragmentVPView(getActivity(),getActivity().getSupportFragmentManager());
//        pullToRefreshView.getListView().addHeaderView(recommendFragmentVPView);
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
//        OkHttpUtil.downJSON(Constants.URL.RecommendUrl, this);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("你好下拉刷新" + i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);
        recommendListView.setAdapter(arrayAdapter);

        AndroidNetworking.post(Constants.URL.recommendUrl)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        RecommendEntity recommendEntity = JSONObject.parseObject(response, RecommendEntity.class);
//                        Log.e(TAG,recommendEntity.toString());
                        if (Integer.parseInt(recommendEntity.getCode()) == 1) {
                            List<RecommendEntity.ObjBean.SanCanBean> san_can = recommendEntity.getObj().getSan_can();
                            ArrayList<RecommendEntity.ObjBean.SanCanBean> sancanEntity = (ArrayList<RecommendEntity.ObjBean.SanCanBean>) san_can;

                            RecommendViewPagerAdapter recommendViewPagerAdapter = new RecommendViewPagerAdapter(getFragmentManager(), sancanEntity, getActivity());
                            Log.e(TAG, "onResponse: " + sancanEntity);
//                            viewPager.setAdapter(recommendViewPagerAdapter);
                            ListView listView = recommendListView.getRefreshableView();
//                            addHeaderTextView(listView);
                            recommendView = new RecommendView(getActivity());
                            ViewPager viewPager = recommendView.getViewPager();
                            viewPager.setAdapter(recommendViewPagerAdapter);

                            CirclePageIndicator circlePageIndicator = recommendView.getCirclePageIndicator();
                            circlePageIndicator.setViewPager(viewPager);

                            listView.addHeaderView(recommendView);

                        }

                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
//        recommendFragmentVPView.setUrl(Constants.URL.RecommendUrl);
    }

    /**
     * add TextView
     *
     * @param listView
     */
    private void addHeaderTextView(ListView listView) {
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(getActivity());
        textView.setText("add");
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(16);
        textView.setLayoutParams(layoutParams);
        listView.addHeaderView(textView);
    }


}
