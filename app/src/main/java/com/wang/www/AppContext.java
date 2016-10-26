package com.wang.www;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.wang.www.util.FrescoUtil;
import com.wang.www.util.OkHttpUtil;
import com.wang.www.util.ShareUtil;

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
        AndroidNetworking.initialize(this);
    }
}
