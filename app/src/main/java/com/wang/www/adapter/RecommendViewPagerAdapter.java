package com.wang.www.adapter;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.wang.www.fragment.RecommendViewPagerFragment;
import com.wang.www.model.RecommendEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/28 11:28 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendViewPagerAdapter extends FragmentPagerAdapter {
    private List<ArrayList<RecommendEntity.ObjBean.SanCanBean>> sanCanEntity;
    private List<ArrayList<RecommendEntity.ObjBean.SanCanTitlesBean>> sanCanTitlesEntities;
    private String TAG = "RecommendViewPager";

    public RecommendViewPagerAdapter(FragmentManager fm, List<ArrayList<RecommendEntity.ObjBean.SanCanBean>> sanCanEntitys, List<ArrayList<RecommendEntity.ObjBean.SanCanTitlesBean>> sanCanTitlesEntities, Context context) {
        super(fm);
        this.sanCanEntity = sanCanEntitys;
        this.sanCanTitlesEntities = sanCanTitlesEntities;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = RecommendViewPagerFragment.getInstance(sanCanEntity.get(position), sanCanTitlesEntities.get(position));
        return fragment;
    }

    @Override
    public int getCount() {
        return sanCanEntity.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }
}
