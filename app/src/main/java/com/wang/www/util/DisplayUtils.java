package com.wang.www.util;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/31 14:50 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class DisplayUtils {
    /**
     * getScreenWidth();
     *
     * @return
     */
    public static int getScreenWidth(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
