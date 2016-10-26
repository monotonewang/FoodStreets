package com.wang.www.custem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.wang.www.R;
import com.wang.www.adapter.RecommendFragmentLvztAdapter;
import com.wang.www.model.RecommendFoodModel;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/27.
 */
public class RecommemdFragmentLVztView extends LinearLayout {
    @Bind(R.id.custem_lv_zt_fragment_recommend_lv)
    public ListView listView;
    private RecommendFoodModel recommendFoodByJson;
    private String TAG="rflvztView";

    public RecommemdFragmentLVztView(Context context,  RecommendFoodModel recommendFoodByJson) {
        super(context);
        this.recommendFoodByJson=recommendFoodByJson;
        init();
    }


    public RecommemdFragmentLVztView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.custem_lv_zt_fragment_recommend, this, true);
        ButterKnife.bind(this);

        RecommendFragmentLvztAdapter recommendFragmentLvztAdapter=new RecommendFragmentLvztAdapter(getContext());
        listView.setAdapter(recommendFragmentLvztAdapter);
//        Log.e(TAG, "init: size=" + recommendFoodByJson.getObj().getZt().size());
        recommendFragmentLvztAdapter.setDatas(recommendFoodByJson.getObj().getZt());
        loadDatas();
    }

    private void loadDatas() {

    }

}
