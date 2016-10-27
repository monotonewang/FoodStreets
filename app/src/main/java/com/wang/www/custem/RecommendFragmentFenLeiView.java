package com.wang.www.custem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wang.www.R;
import com.wang.www.model.MainEntity;
import com.wang.www.util.FrescoUtil;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendFragmentFenLeiView extends LinearLayout {

    private MainEntity recommendFoodModel;
    @Bind({R.id.custem_fenlei_fragment_recommend_image_caipu,R.id.custem_fenlei_fragment_recommend_image_video,R.id.custem_fenlei_fragment_recommend_image_breakfest,R.id.custem_fenlei_fragment_recommend_image_near,R.id.custem_fenlei_fragment_recommend_imageview_ranklist,R.id.custem_fenlei_fragment_recommend_imageview_smartgroupfood})
    public List<SimpleDraweeView> simpleDraweeViews;
    @Bind({R.id.custem_fenlei_fragment_recommend_textview_caipu,R.id.custem_fenlei_fragment_recommend_textview_video,R.id.custem_fenlei_fragment_recommend_textview_breakfest,R.id.custem_fenlei_fragment_recommend_textview_near})
    public List<TextView> textViews;
    private String TAG="RecommendFragmentFenLeiView";

    private SimpleDraweeView simpleDraweeView;
    public RecommendFragmentFenLeiView(Context context,MainEntity recommendFoodModel) {
        super(context);

        this.recommendFoodModel=recommendFoodModel;
        init();
    }
 /*   public void setUrl(MainEntity recommendFoodModel){

    }*/
    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.custem_fenlei_fragment_recommend, this, true);
        simpleDraweeView= (SimpleDraweeView)findViewById(R.id.custem_fenlei_fragment_recommend_image_video);
        List<MainEntity.ObjEntity.FenleiEntity> fenlei = recommendFoodModel.getObj().getFenlei();
        ButterKnife.bind(this);
        for (int i=0;i<fenlei.size();i++){
            textViews.get(i).setText(fenlei.get(i).getTitle());
            FrescoUtil.imageViewBind(fenlei.get(i).getImage(), simpleDraweeViews.get(i));
        }
        MainEntity.ObjEntity.Func1Entity func1 = recommendFoodModel.getObj().getFunc1();
        MainEntity.ObjEntity.Func2Entity func2 = recommendFoodModel.getObj().getFunc2();

        FrescoUtil.imageViewBind(func1.getImage(),simpleDraweeViews.get(4));
        FrescoUtil.imageViewBind(func2.getImage(),simpleDraweeViews.get(5));
        loadDatas();
    }

    private void loadDatas() {

    }

}
