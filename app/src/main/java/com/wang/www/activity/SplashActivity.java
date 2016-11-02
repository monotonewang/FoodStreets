package com.wang.www.activity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;

import com.wang.www.R;
import com.wang.www.base.BaseActivity;
import com.wang.www.util.Constants;
import com.wang.www.util.ShareUtil;


/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/26 16:40 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */
public class SplashActivity extends BaseActivity {
    private Handler handler=new Handler();
    @Override
    protected int getViewResId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init(View view) {
        super.init(view);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(ShareUtil.getWelocomeBoolean(Constants.KEYNAME.WELCOME_ACTIVITY)){
                    Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(SplashActivity.this,WelcomeActivity.class);
                    startActivity(intent);
                    ShareUtil.putWelcomeBoolean(Constants.KEYNAME.WELCOME_ACTIVITY, true);
                }
                finish();
            }
        },1000);

    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
