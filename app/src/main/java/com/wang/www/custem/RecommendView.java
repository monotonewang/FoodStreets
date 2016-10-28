package com.wang.www.custem;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.viewpagerindicator.CirclePageIndicator;
import com.wang.www.R;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/28 11:26 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendView extends RelativeLayout {
    private Context context;
    private ViewPager viewPager;
    private CirclePageIndicator circlePageIndicator;

    public RecommendView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public RecommendView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    private void init() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.custom_recommend, this, true);
        viewPager = (ViewPager) relativeLayout.findViewById(R.id.custom_recommend_vp);
        circlePageIndicator = (CirclePageIndicator) relativeLayout.findViewById(R.id.custom_recommend_cpi);
    }

    public ViewPager getViewPager() {
        return viewPager;
    }

    public CirclePageIndicator getCirclePageIndicator() {
        return circlePageIndicator;
    }

}
