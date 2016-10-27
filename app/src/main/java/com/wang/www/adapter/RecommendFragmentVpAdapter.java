package com.wang.www.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.wang.www.model.MainEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendFragmentVpAdapter extends PagerAdapter {

    private List<ArrayList<MainEntity.ObjEntity.SanCanEntity>> sanCanEntities;
    private List<ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities;


    @Override
    public int getCount() {
        return sanCanEntities.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
