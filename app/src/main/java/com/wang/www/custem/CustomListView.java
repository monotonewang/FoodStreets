package com.wang.www.custem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/11/1 17:22 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class CustomListView extends ListView {
    public CustomListView(Context context) {
        super(context);
    }

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int spec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, spec);
    }
}
