package com.example.user.foodstreet.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.user.foodstreet.R;
import com.example.user.foodstreet.base.BaseFragment;
import com.example.user.foodstreet.model.RecommendFoodModel;
import com.example.user.foodstreet.util.Constants;
import com.example.user.foodstreet.util.FrescoUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.Bind;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendTop3VPFragment extends BaseFragment {
    @Bind(R.id.fragment_top3_vp_recommend_sdv)
    public SimpleDraweeView simpleDraweeView;
    public static Fragment getInstance(RecommendFoodModel.ObjEntity.Top3Entity top3){
        RecommendTop3VPFragment recommendTop3VPFragment=new RecommendTop3VPFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable(Constants.KEYNAME.RECOMMEND_FRAGMENT_VP_TOP3, top3);
        recommendTop3VPFragment.setArguments(bundle);
        return recommendTop3VPFragment;
    }
    @Override
    protected int getViewResId() {
        return R.layout.fragment_top3_vp_recommend;
    }

    @Override
    protected void init(View view) {
        super.init(view);

    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
        Bundle bundle = getArguments();
        RecommendFoodModel.ObjEntity.Top3Entity top3 = (RecommendFoodModel.ObjEntity.Top3Entity) bundle.getSerializable(Constants.KEYNAME.RECOMMEND_FRAGMENT_VP_TOP3);
        FrescoUtil.imageViewBind(top3.getPhoto(),simpleDraweeView);
    }
}
