package com.example.user.foodstreet;

import android.app.Application;

import com.example.user.foodstreet.util.FrescoUtil;
import com.example.user.foodstreet.util.OkHttpUtil;
import com.example.user.foodstreet.util.ShareUtil;

/**
 * Created by user on 2016/2/25.
 */
public class AppContext extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ShareUtil.initShared(this);
        OkHttpUtil.initOkHttp();
        FrescoUtil.initFresco(this);
    }
}
