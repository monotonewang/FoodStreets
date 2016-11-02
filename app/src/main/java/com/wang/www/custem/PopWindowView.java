package com.wang.www.custem;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/11/2 18:03 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class PopWindowView {


    //attach location
    public static final int ATTACH_LOCATION_WINDOW = 1;
    public static final int ATTACH_LOCATION_VIEW = 2;

    private PopupWindow mPopupWindow;
    private static PopWindowView INSTANCE;

    private PopWindowView() {
    }

    private PopWindowView(Context context) {
        this.mPopupWindow = new PopupWindow(context);
    }

    public static PopWindowView getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PopWindowView(context);
        }
        return INSTANCE;
    }

    /**
     * 调用工具类需要初始化一些信息
     *
     * @param height
     * @param width
     * @return
     */
    public PopWindowView init(int height, int width) {
        mPopupWindow.setHeight(height);
        mPopupWindow.setWidth(width);
//		mPopupWindow.setHeight(LayoutParams.WRAP_CONTENT);
//      mPopupWindow.setWidth(LayoutParams.MATCH_PARENT);
        mPopupWindow.setFocusable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        return this;
    }

    public PopWindowView showPopWindow(View contentView, int location, View attachContainer, int x, int y) {
        mPopupWindow.setContentView(contentView);
        switch (location) {
            case ATTACH_LOCATION_WINDOW:
                //we don't use doctorView!
                //issue:http://stackoverflow.com/questions/8782250/popupwindow-badtokenexception-unable-to-add-window-token-null-is-not-valid
                mPopupWindow.showAtLocation(attachContainer == null ? mPopupWindow.getContentView() : attachContainer, x == 0 ? Gravity.BOTTOM : Gravity.NO_GRAVITY, x, y);
                break;
            default:
                mPopupWindow.showAsDropDown(attachContainer, 0, 0);
                break;
        }
        return INSTANCE;
    }

    /**
     * hide pop window
     */
    public void hidePopWindow() {
        if (mPopupWindow != null) {
            mPopupWindow.dismiss();
        }
    }

    /**
     * dismiss pop window
     */
    public void dismissPopWindow() {
        if (mPopupWindow != null) {
            mPopupWindow.dismiss();
            mPopupWindow = null;
            INSTANCE = null;
        }
    }

    public PopupWindow getPopWindow() {
        return mPopupWindow;
    }

}


