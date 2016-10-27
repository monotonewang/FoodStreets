package com.wang.www.custem;

import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.wang.www.R;
import com.wang.www.model.MainEntity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendFragmentTop3VPView extends FrameLayout implements ViewPager.OnPageChangeListener {

    @Bind(R.id.custem_vp_top3_fragment_recommend_vp)
    public ViewPager viewPager;
    @Bind(R.id.custem_vp_top3_fragment_recommend_navview)
    public Nav_View nav_view;
    private MainEntity recommendFoodByJson;
    private FragmentManager fragmentManager;
    public RecommendFragmentTop3VPView(Context context, MainEntity recommendFoodByJson, FragmentManager fragmentManager) {
        super(context);
        this.recommendFoodByJson=recommendFoodByJson;
        this.fragmentManager=fragmentManager;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.custem_vp_top3_fragment_recommend,this,true);
        ButterKnife.bind(this);
        viewPager.addOnPageChangeListener(this);
        nav_view.setCount(recommendFoodByJson.getObj().agetTop3().size());
        MainEntity.ObjEntity top3 = recommendFoodByJson.getObj();
//        RecommendFragmentTop3VPAdapter recommendFragmentTop3VPAdapter=new RecommendFragmentTop3VPAdapter(getContext(),top3,fragmentManager);
//        viewPager.setAdapter(recommendFragmentTop3VPAdapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if(nav_view.getCount()>0){
            nav_view.setNavAddressScroll(position,positionOffset);
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
