package com.wang.www.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


public class RecommedFragmentScroolBehavior extends CoordinatorLayout.Behavior {
    private static final String TAG = "rfsb";

    public RecommedFragmentScroolBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        Log.e(TAG, "onStartNestedScroll: ");
        return true;
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        Log.e(TAG, "onNestedScroll: " + "dyConsumed=" + dyConsumed + "2=" + dyUnconsumed);
        if (dyConsumed > 0) {
            child.setVisibility(View.GONE);
        } else if (dyUnconsumed < 0) {
            child.setVisibility(View.VISIBLE);
        }
    }
}
