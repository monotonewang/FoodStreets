package com.wang.www.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/25.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewResId());
        view = LayoutInflater.from(this).inflate(getViewResId(),null);
        ButterKnife.bind(this);
        init(view);
        loadDatas();
    }

    protected void init(View view) {

    }
    protected void loadDatas() {
    }
    protected  abstract int getViewResId();
}
