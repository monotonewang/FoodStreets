package com.wang.www.custem;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.wang.www.R;
import com.wang.www.model.MainEntity;
import com.wang.www.util.JsonUtil;
import com.wang.www.util.OkHttpUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendFragmentVPView extends LinearLayout implements OkHttpUtil.OnDownDataListener, ViewPager.OnPageChangeListener {

    private String TAG = "RecommendFragmentVPView";
    private ViewPager viewPager;
    private List<ArrayList<MainEntity.ObjEntity.SanCanEntity>> sanCanEntities;//这是ViewPager传递的数据
    private List<ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities;
    private FragmentManager fragmentManager;
    @Bind(R.id.fragment_recommend_nav)
    public NavView navView;

    public RecommendFragmentVPView(Context context, FragmentManager fragmentManager) {
        super(context);
        this.fragmentManager = fragmentManager;
        init();
    }

    public void init() {
//        ButterKnife.bind(this);
        LayoutInflater.from(getContext()).inflate(R.layout.custem_vp_fragment_recommed, this, true);
        viewPager = (ViewPager) findViewById(R.id.fragment_recommend_vp);
        ButterKnife.bind(this, this);
        viewPager.addOnPageChangeListener(this);
    }

    public void setUrl(String url) {
        OkHttpUtil.downJSON(url, this);
    }

    @Override
    public void onResponse(String url, String json) {
        if (json != null) {
            MainEntity recommendFoodByJson = JsonUtil.getRecommendFoodByJson(json);

//            Log.e(TAG, "onResponse: " + recommendFoodByJson);
            List<MainEntity.ObjEntity.SanCanEntity> san_can = recommendFoodByJson.getObj().getSan_can();
            List<MainEntity.ObjEntity.SanCanTitlesEntity> san_can_titles = recommendFoodByJson.getObj().getSan_can_titles();
//            Log.e(TAG, "onResponse: "+san_can);
            //设置组合控件的圆圈
            navView.setCount(san_can.size() / 3);
            sanCanEntities = new ArrayList<>();
            int i = -3;
            for (int k = 0; k < san_can.size() / 3; k++) {
                ArrayList<MainEntity.ObjEntity.SanCanEntity> dataList = new ArrayList<>();
                i = i + 3;
                for (int j = i; j < i + 3; j++) {
                    dataList.add(san_can.get(j));
                }
                sanCanEntities.add(dataList);
            }

            sanCanTitlesEntities = new ArrayList<>();
            int y = -1;
//            Log.e(TAG, "onResponse:size= " + san_can_titles.size());
            for (int k = 0; k < san_can_titles.size(); k++) {
                ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity> datas = new ArrayList<>();
                y = y + 1;
                for (int t = y; t < y + 1; t++) {
                    datas.add(san_can_titles.get(t));
                }
                sanCanTitlesEntities.add(datas);
            }
/*
            Log.e(TAG, "onResponse: sanCanEntities"+sanCanEntities );
            Log.e(TAG, "onResponse: sanCanTitlesEntities"+sanCanTitlesEntities );*/

//            RecommendFragmentVpAdapter recommendFragmentVpAdapter=new RecommendFragmentVpAdapter(fragmentManager,sanCanEntities,sanCanTitlesEntities);

//            viewPager.setAdapter(recommendFragmentVpAdapter);

        }
    }

    @Override
    public void onFailure(String url, String error) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (navView.getCount() > 0) {
//            navView.setNavAddress(position);
            navView.setNavAddressScroll(position, positionOffset);
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
