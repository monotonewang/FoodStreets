package com.wang.www.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.model.RecommendEntity;
import com.wang.www.util.Constants;

import java.util.ArrayList;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/28 14:14 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendViewPagerFragment extends BaseFragment {

    public static Fragment getInstance(ArrayList<RecommendEntity.ObjBean.SanCanBean> sanCanBeen) {
        RecommendViewPagerFragment recommendViewPagerFragment = new RecommendViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEYNAME.RECOMMEND_VIEWPAGER, sanCanBeen);
        recommendViewPagerFragment.setArguments(bundle);
        return recommendViewPagerFragment;
    }

    @Override
    protected int getViewResId() {
        return R.layout.viewpager_recommend;
    }

    @Override
    protected void init(View view) {
        super.init(view);
        ImageView ivFirst = (ImageView) view.findViewById(R.id.viewPager_recommend_iv_first);
        ImageView ivSecond = (ImageView) view.findViewById(R.id.viewPager_recommend_iv_second);
        ImageView ivThird = (ImageView) view.findViewById(R.id.viewPager_recommend_iv_third);
        TextView tvFirst = (TextView) view.findViewById(R.id.viewPager_recommend_tv_first);
        TextView tvSecond = (TextView) view.findViewById(R.id.viewPager_recommend_tv_second);
        TextView tvThird = (TextView) view.findViewById(R.id.viewPager_recommend_tv_third);
        TextView tvFouth = (TextView) view.findViewById(R.id.viewPager_recommend_tv_fouth);
        TextView tvFifth = (TextView) view.findViewById(R.id.viewPager_recommend_tv_five);
        TextView tvSix = (TextView) view.findViewById(R.id.viewPager_recommend_tv_six);

//        TextView tv = (TextView) view.findViewById(R.id.viewpager_recommend_tv);
        Bundle bundle = getArguments();
        ArrayList<RecommendEntity.ObjBean.SanCanBean> sanCanList = (ArrayList<RecommendEntity.ObjBean.SanCanBean>) bundle.getSerializable(Constants.KEYNAME.RECOMMEND_VIEWPAGER);
        Glide.with(this).load(sanCanList.get(0).getTitlepic()).into(ivFirst);
        Glide.with(this).load(sanCanList.get(1).getTitlepic()).into(ivSecond);
        Glide.with(this).load(sanCanList.get(2).getTitlepic()).into(ivThird);
        tvFirst.setText(sanCanList.get(0).getTitle());
        tvSecond.setText(sanCanList.get(0).getDescr());
        tvThird.setText(sanCanList.get(1).getTitle());
        tvFouth.setText(sanCanList.get(1).getDescr());
        tvFifth.setText(sanCanList.get(2).getTitle());
        tvSix.setText(sanCanList.get(2).getDescr());

    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
    }
}
