package com.example.user.foodstreet.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/25.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewResId());
        ButterKnife.bind(this);
        init();
        loadDatas();
    }

    protected void init() {

    }
    protected void loadDatas() {
    }
    protected  abstract int getViewResId();
}
