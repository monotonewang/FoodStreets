package com.wang.www.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;

import com.wang.www.R;
import com.wang.www.adapter.WelcomeAdapter;
import com.wang.www.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by user on 2016/2/25.
 */
public class WelcomeActivity extends BaseActivity {
    @Bind(R.id.activity_welcomemore_vp)
    public ViewPager viewPager;
    private List<Bitmap> bitmapList;
    private String TAG = "WelcomeActivity";
    private int widthPixels;
    private Handler handler;

    @Override
    protected int getViewResId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void init() {
        super.init();
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        widthPixels = metrics.widthPixels;
        bitmapList = new ArrayList<>();
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_1));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_2));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_3));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_4));
        WelcomeAdapter welcomeMoreVPAdapter = new WelcomeAdapter(this, bitmapList, handler);
        viewPager.setAdapter(welcomeMoreVPAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
