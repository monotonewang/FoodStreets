package com.wang.www.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.model.RecommendEntity;

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
        bundle.putSerializable("xx", sanCanBeen);
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
        TextView tv = (TextView) view.findViewById(R.id.viewpager_recommend_tv);
        Bundle bundle = getArguments();
        RecommendEntity.ObjBean.SanCanBean xx = (RecommendEntity.ObjBean.SanCanBean) bundle.getSerializable("xx");
        tv.setText(xx.getTitle());
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
    }
}
