package com.wang.www.adapter;

import android.content.Context;

import com.wang.www.R;
import com.wang.www.base.AbsBaseAdapter;
import com.wang.www.model.RecommendEntity;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/11/1 15:52 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendShopAdapter extends AbsBaseAdapter<RecommendEntity.ObjBean.ShopsBean> {

    public RecommendShopAdapter(Context context, int resid) {
        super(context, resid);
    }

    @Override
    public void bindDatas(ViewHolder viewHolder, RecommendEntity.ObjBean.ShopsBean data) {
        viewHolder.bindTextView(R.id.listview_recommend_shop_tv, data.getTitle());
    }

    @Override
    public int getCount() {
        return super.getCount();
        
    }
}
