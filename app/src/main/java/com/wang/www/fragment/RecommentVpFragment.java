package com.wang.www.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.model.MainEntity;
import com.wang.www.util.Constants;
import com.wang.www.util.FrescoUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by user on 2016/2/26.
 */
public class RecommentVpFragment extends BaseFragment {

    @Bind({R.id.fragment_vp_recommend_head_sdv,R.id.fragment_vp_recommend_mid_sdv,R.id.fragment_vp_recommend_foot_sdv})
    public List<SimpleDraweeView> simpleDraweeView;
    @Bind({R.id.fragment_vp_recommend_head_tv1,R.id.fragment_vp_recommend_mid_tv1,R.id.fragment_vp_recommend_foot_tv1})
    public List<TextView> textViews1;
    @Bind({R.id.fragment_vp_recommend_head_tv2,R.id.fragment_vp_recommend_mid_tv2,R.id.fragment_vp_recommend_foot_tv2,R.id.fragment_vp_recommend_tv_title,R.id.fragment_vp_recommend_tv_sub_title})
    public List<TextView> textViews2;
    private String TAG="RecommentVpFragment";

//    public static Fragment getInstance(ArrayList<MainEntity.ObjEntity.SanCanEntity> datas, ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity> dataTitle){
//        RecommentVpFragment recommentVpFragment=new RecommentVpFragment();
//        Bundle bundle=new Bundle();
//        bundle.putSerializable(Constants.KEYNAME.RECOMMEND_FRAGMENT_VP,datas);
//        bundle.putSerializable(Constants.KEYNAME.RECOMMEND_FRAGMENT_VP_TITLE,dataTitle);
//        recommentVpFragment.setArguments(bundle);
////        return recommentVpFragment;
//    }
    @Override
    protected int getViewResId() {
        return R.layout.fragment_vp_recomend;

    }

    @Override
    protected void init(View view) {
        super.init(view);
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
        Bundle bundle = getArguments();
        ArrayList<MainEntity.ObjEntity.SanCanEntity> datas = (ArrayList<MainEntity.ObjEntity.SanCanEntity>) bundle.get(Constants.KEYNAME.RECOMMEND_FRAGMENT_VP);
        ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity> dataTitle= (ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity>) getArguments().getSerializable(Constants.KEYNAME.RECOMMEND_FRAGMENT_VP_TITLE);
//        Log.e(TAG, "loadDatas: size=" + datas.size() + "/n" + "data===" + datas);

            FrescoUtil.imageViewBind(datas.get(0).getTitlepic(), simpleDraweeView.get(0));
            FrescoUtil.imageViewBind(datas.get(1).getTitlepic(), simpleDraweeView.get(1));
            FrescoUtil.imageViewBind(datas.get(2).getTitlepic(), simpleDraweeView.get(2));
            textViews1.get(0).setText(datas.get(0).getTitle());
            textViews1.get(1).setText(datas.get(1).getTitle());
            textViews1.get(2).setText(datas.get(2).getTitle());
            textViews2.get(0).setText(datas.get(0).getDescr());
            textViews2.get(1).setText(datas.get(1).getDescr());
            textViews2.get(2).setText(datas.get(2).getDescr());
            textViews2.get(3).setText(dataTitle.get(0).getTitle());
            textViews2.get(4).setText(dataTitle.get(0).getSub_title());
    }
}
