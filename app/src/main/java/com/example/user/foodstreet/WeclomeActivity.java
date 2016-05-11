package com.example.user.foodstreet;

import android.content.Intent;
import android.os.Handler;

import com.example.user.foodstreet.base.BaseActivity;
import com.example.user.foodstreet.util.Constants;
import com.example.user.foodstreet.util.ShareUtil;

/**
 * Created by user on 2016/2/25.
 */
public class WeclomeActivity extends BaseActivity {
    private Handler handler=new Handler();
    @Override
    protected int getViewResId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void init() {
        super.init();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(ShareUtil.getWelocomeBoolean(Constants.KEYNAME.WELCOME_TAG)){
                    Intent intent=new Intent(WeclomeActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(WeclomeActivity.this,WelcomeMoreActivity.class);
                    startActivity(intent);
                    ShareUtil.putWelcomeBoolean(Constants.KEYNAME.WELCOME_TAG, true);
                }
                finish();
            }
        },1000);

    }

    @Override
    protected void loadDatas() {
        super.loadDatas();

    }
}
