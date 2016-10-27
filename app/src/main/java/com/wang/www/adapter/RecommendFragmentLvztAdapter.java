package com.wang.www.adapter;

import android.content.Context;

import com.wang.www.R;
import com.wang.www.base.AbsBaseAdapter;
import com.wang.www.model.MainEntity;

/**
 * Created by user on 2016/2/27.
 */
public class RecommendFragmentLvztAdapter extends AbsBaseAdapter<MainEntity.ObjEntity.ZtEntity> {


    private String TAG="rflvAdapter";

    public RecommendFragmentLvztAdapter(Context context) {
        super(context, R.layout.fragment_zt_lv_recommed);

    }

    @Override
    public void bindDatas(ViewHolder viewHolder, MainEntity.ObjEntity.ZtEntity data) {
//        Log.e(TAG, "init: " + data);
        viewHolder.bindSimpleDraweeView(R.id.fragment_zt_lv_recommend_sdv,data.getPhoto());
        viewHolder.bindTextView(R.id.fragment_zt_lv_recommend_tv,data.getTitle());
    }

}
