package com.wang.www.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.wang.www.R;
import com.wang.www.adapter.RecommedFragmentLVAdapter;
import com.wang.www.base.BaseFragment;
import com.wang.www.custem.PullToRefreshView;
import com.wang.www.custem.RecommemdFragmentLVztView;
import com.wang.www.custem.RecommendFragmentDivisionView;
import com.wang.www.custem.RecommendFragmentFenLeiView;
import com.wang.www.custem.RecommendFragmentTop3VPView;
import com.wang.www.custem.RecommendFragmentVPView;
import com.wang.www.model.RecommendFoodModel;
import com.wang.www.util.Constants;
import com.wang.www.util.JsonUtil;
import com.wang.www.util.OkHttpUtil;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by user on 2016/2/25.
 */
public class MainFragment extends BaseFragment implements OkHttpUtil.OnDownDataListener, AdapterView.OnItemClickListener {
    private String TAG="MainFragment";
//    private List<RecommendFoodModel.ObjEntity.SanCanEntity> sanCanEntitie;
    private List<ArrayList<RecommendFoodModel.ObjEntity.SanCanEntity>> sanCanEntities;//这是ViewPager传递的数据
    private List<ArrayList<RecommendFoodModel.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities;
    @Bind(R.id.fragment_recommend_ptrView)
    public PullToRefreshView pullToRefreshView;
    private RecommendFragmentVPView recommendFragmentVPView;
    private Handler handler=new Handler();
    private String name;
    private AnimationDrawable animation;

    @Override
    protected int getViewResId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void init(View view) {
        super.init(view);
        pullToRefreshView.setHeadView(R.layout.custem_ptr_headview);
        pullToRefreshView.getListView().setOnItemClickListener(this);
        pullToRefreshView.setOnPullToRefreshListener(new PullToRefreshView.OnPullToRefreshListener() {

            @Override
            public void onPullMovie(int movey, View headView) {
                TextView textView= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
                //下拉刷新
                textView.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_on_pull_movie));
//                Log.e(TAG, "onPullMovie: movey="+movey);
                if(movey>200){
                    TextView textView1= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
                    //松开刷新数据
                    textView1.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_on_refresh));
                }
            }

            @Override
            public void onRefresh(View headView) {
                TextView textView= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
                //正在加载
                textView.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_refresh_complete));
                //设置下拉刷新的。
                ImageView iv = (ImageView) headView.findViewById(R.id.iv_wait);
                Drawable drawable=getResources().getDrawable(R.drawable.wait_anim);
                iv.setBackground(drawable);
                animation = (AnimationDrawable) iv.getBackground();
                animation.start();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        pullToRefreshView.refreshComplete();
                    }
                }, 5000);
            }

            @Override
            public void onRefreshCompelet(View headView) {

//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        pullToRefreshView.refreshComplete();
//                    }
//                }, 2000);
                animation.stop();
            }
        });
        //给下拉刷新设置适配器
        //这个是首页的早餐 ，中餐和晚餐的ViewPager
        recommendFragmentVPView = new RecommendFragmentVPView(getActivity(),getActivity().getSupportFragmentManager());
        pullToRefreshView.getListView().addHeaderView(recommendFragmentVPView);
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
//        OkHttpUtil.downJSON(Constants.URL.RecommendUrl, this);
        AndroidNetworking.post(Constants.URL.MainUrl)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e(TAG, "onResponse: "+response);
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
        recommendFragmentVPView.setUrl(Constants.URL.RecommendUrl);
    }

    @Override
    public void onResponse(String url, String json) {
        if(json!=null) {
            RecommendFoodModel recommendFoodByJson = JsonUtil.getRecommendFoodByJson(json);
            List<RecommendFoodModel.ObjEntity.ShopsEntity> shops = recommendFoodByJson.getObj().getShops();
            //首页
            RecommedFragmentLVAdapter recommedFragmentLVAdapter=new RecommedFragmentLVAdapter(getActivity(),shops);
//            给ListView设置Adapter
            pullToRefreshView.setAdatper(recommedFragmentLVAdapter);
//            pullToRefreshView.getListView().setAdapter(recommedFragmentLVAdapter);
            //这是分类的组合控件
            RecommendFragmentFenLeiView recommendFragmentFenLeiView=new RecommendFragmentFenLeiView(getActivity(),recommendFoodByJson);
            pullToRefreshView.getListView().addHeaderView(recommendFragmentFenLeiView);
            //最新商品的组合控件
            RecommendFragmentDivisionView recommendFragmentDivisionView=new RecommendFragmentDivisionView(getActivity());
            recommendFragmentDivisionView.textViewToday.get(1).setVisibility(View.GONE);
            pullToRefreshView.getListView().addHeaderView(recommendFragmentDivisionView);
            //这是top3的ViewPager
            RecommendFragmentTop3VPView recommendFragmentTop3VPView=new RecommendFragmentTop3VPView(getActivity(),recommendFoodByJson,getActivity().getSupportFragmentManager());
            pullToRefreshView.getListView().addHeaderView(recommendFragmentTop3VPView);
            //这是今日推荐组合控件
            RecommendFragmentDivisionView recommendFragmentDivisionViewToday=new RecommendFragmentDivisionView(getActivity());
            recommendFragmentDivisionViewToday.imageViewToday.setImageResource(R.drawable.tj_zhuanti);
            recommendFragmentDivisionViewToday.textViewToday.get(0).setText("今日推荐");
            recommendFragmentDivisionViewToday.textViewToday.get(1).setVisibility(View.GONE);
            pullToRefreshView.getListView().addFooterView(recommendFragmentDivisionViewToday);
            //这里是zt的ListView
            RecommemdFragmentLVztView recommemdFragmentLVztView=new RecommemdFragmentLVztView(getActivity(),recommendFoodByJson);
            pullToRefreshView.getListView().addFooterView(recommemdFragmentLVztView);
            //这里是{猜我喜欢}的---
            RecommendFragmentDivisionView recommendFragmentDivisionView1=new RecommendFragmentDivisionView(getActivity());
            recommendFragmentDivisionView1.imageViewToday.setImageResource(R.drawable.tj_guess_youlike);
            recommendFragmentDivisionView1.textViewToday.get(0).setText("猜你喜欢");
            recommendFragmentDivisionView1.textViewToday.get(1).setText(recommendFoodByJson.getObj().getCustomized().getTime());


            pullToRefreshView.getListView().addFooterView(recommendFragmentDivisionView1);

        }
    }

    @Override
    public void onFailure(String url, String error) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
