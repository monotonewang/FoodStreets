package com.wang.www.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.model.RecommendEntity;
import com.wang.www.util.Constants;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/28 14:14 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendViewPagerFragment extends BaseFragment {

    public static Fragment getInstance(RecommendEntity.ObjBean.SanCanBean sanCanBeen) {
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

//        TextView tv = (TextView) view.findViewById(R.id.viewpager_recommend_tv);
//        Bundle bundle = getArguments();
//        RecommendEntity.ObjBean.SanCanBean xx = (RecommendEntity.ObjBean.SanCanBean) bundle.getSerializable("xx");
//        tv.setText(xx.getTitle());
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
    }
}
