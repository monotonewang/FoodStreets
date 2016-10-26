package com.wang.www;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;

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
    private String TAG="WelcomeActivity";
    private int widthPixels;

    @Override
    protected int getViewResId() {
        return R.layout.activity_welcomemore;
    }

    @Override
    protected void init() {
        super.init();
        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        widthPixels = metrics.widthPixels;
        bitmapList=new ArrayList<>();
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_1));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_2));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_3));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.introduct_4));
        bitmapList.add(BitmapFactory.decodeResource(getResources(), R.drawable.pic_welcome));
        WelcomeAdapter welcomeMoreVPAdapter=new WelcomeAdapter(this,bitmapList);
        viewPager.setAdapter(welcomeMoreVPAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e(TAG, "onPageScrolled: " + "position=" + position + "positionoffset=" + positionOffset + "positionOffsetPixels=" + positionOffsetPixels);
                  //ViewPager进行跳转
                  if(position==3&&positionOffsetPixels>widthPixels/2){
                    Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
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
