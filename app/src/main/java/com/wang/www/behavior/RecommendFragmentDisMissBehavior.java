package com.wang.www.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

import com.wang.www.R;


/**
 * Created by user on 2016/2/29.
 */
public class RecommendFragmentDisMissBehavior extends CoordinatorLayout.Behavior {
    public RecommendFragmentDisMissBehavior(Context contex,AttributeSet attributeSet){
        super(contex,attributeSet);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency.getId()== R.id.fab;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        return true;
    }
}
