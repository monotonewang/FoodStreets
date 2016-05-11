package com.example.user.foodstreet.adapter;

import android.content.Context;

import com.example.user.foodstreet.R;
import com.example.user.foodstreet.base.AbsBaseAdapter;
import com.example.user.foodstreet.model.RecommendFoodModel;

/**
 * Created by user on 2016/2/27.
 */
public class RecommendFragmentLvztAdapter extends AbsBaseAdapter<RecommendFoodModel.ObjEntity.ZtEntity> {


    private String TAG="rflvAdapter";

    public RecommendFragmentLvztAdapter(Context context) {
        super(context, R.layout.fragment_zt_lv_recommed);

    }

    @Override
    public void bindDatas(ViewHolder viewHolder, RecommendFoodModel.ObjEntity.ZtEntity data) {
//        Log.e(TAG, "init: " + data);
        viewHolder.bindSimpleDraweeView(R.id.fragment_zt_lv_recommend_sdv,data.getPhoto());
        viewHolder.bindTextView(R.id.fragment_zt_lv_recommend_tv,data.getTitle());
    }

}
