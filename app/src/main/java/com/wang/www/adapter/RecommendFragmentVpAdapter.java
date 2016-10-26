package com.wang.www.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wang.www.fragment.RecommentVpFragment;
import com.wang.www.model.RecommendFoodModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendFragmentVpAdapter extends FragmentPagerAdapter {

    private List<ArrayList<RecommendFoodModel.ObjEntity.SanCanEntity>> sanCanEntities;
    private List<ArrayList<RecommendFoodModel.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities;

    public RecommendFragmentVpAdapter(FragmentManager fm, List<ArrayList<RecommendFoodModel.ObjEntity.SanCanEntity>> sanCanEntities, List<ArrayList<RecommendFoodModel.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities) {
        super(fm);
        this.sanCanEntities=sanCanEntities;
        this.sanCanTitlesEntities=sanCanTitlesEntities;
    }

    @Override
    public Fragment getItem(int position) {
        return RecommentVpFragment.getInstance(sanCanEntities.get(position),sanCanTitlesEntities.get(position));
    }

    @Override
    public int getCount() {
        return sanCanEntities.size();
    }
}
