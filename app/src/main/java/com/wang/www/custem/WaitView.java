package com.wang.www.custem;

/**
 * Created by user on 2016/2/27.
 */

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.wang.www.R;


/**
 * Created by user on 2016/2/8.
 */
public class WaitView  extends FrameLayout {

    private ImageView iv;
    private AnimationDrawable animationDrawable;

    public WaitView(Context context) {
        super(context);
        init();
    }
    public WaitView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.custem_wait, this, true);
        iv= (ImageView) findViewById(R.id.iv_wait);
        animationDrawable= (AnimationDrawable) iv.getBackground();
    }

    public void startWait(){
        this.setVisibility(VISIBLE);
        animationDrawable.start();
    }
    public void stopWait(){
        this.setVisibility(GONE);
        animationDrawable.stop();
    }
}
