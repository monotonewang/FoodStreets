package com.wang.www.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.wang.www.model.RecommendEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/31 16:31 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendTop3Adapter extends PagerAdapter {

    private List<ImageView> viewList;
    private String TAG = "RecommendTop3Adapter";
    private List<RecommendEntity.ObjBean.Top3Bean> top3Been;

    public RecommendTop3Adapter(List<RecommendEntity.ObjBean.Top3Bean> top3, Context context) {
        viewList = new ArrayList<>();
        this.top3Been = top3;
        for (int i = 0; i < top3.size(); i++) {
//            View view = LayoutInflater.from(context).inflate(R.layout.fragment_vp_top3_child, new LinearLayout(context));
//            View view = LayoutInflater.from(context).inflate(R.layout.fragment_vp_top3_child, null,true);
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
            imageView.setLayoutParams(layoutParams);
//            ImageView imageView = (ImageView) view.findViewById(R.id.fragment_iv_top3_child);
            Glide.with(context).load(top3.get(i).getPhoto()).into(imageView);
            viewList.add(imageView);


        }
    }

    @Override
    public int getCount() {
//        return top3Been.size();
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        container.addView(viewList.get(position));
//        return viewList.get(position);

        int index=position%viewList.size();

        if(viewList.size()>0){
            View view=viewList.get(index);
            if(container.equals(view.getParent())){
                container.removeView(view);
            }
            container.addView(view);
            return view;
        }
        return null;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView(viewList.get(position));
        int index=position%viewList.size();
        container.removeView(viewList.get(index));
    }
}
