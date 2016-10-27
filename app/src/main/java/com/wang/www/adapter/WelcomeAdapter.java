package com.wang.www.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/25.
 */
public class WelcomeAdapter extends PagerAdapter {
    private List<Bitmap> bitmapList;
    private List<ImageView> ivList;
    private Handler handler;

    public WelcomeAdapter(Context context, List<Bitmap> bitmapList, Handler handler) {
        this.handler = handler;
        this.bitmapList = bitmapList;
        ivList = new ArrayList<>();
        for (int i = 0; i < bitmapList.size(); i++) {
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmapList.get(i));
            ivList.add(imageView);
        }
    }

    @Override
    public int getCount() {
        return bitmapList.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(ivList.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        container.addView(ivList.get(position));
        ivList.get(position).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 3) {
                    handler.sendEmptyMessage(1);
                }
            }
        });
        return ivList.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
