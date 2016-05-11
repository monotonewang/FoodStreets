package com.example.user.foodstreet.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/25.
 */
public class WelcomeMoreVPAdapter extends PagerAdapter {
    private Context context;
    private List<Bitmap> bitmapList;
    private List<ImageView> ivList;

    public WelcomeMoreVPAdapter(Context context, List<Bitmap> bitmapList) {
        this.context=context;
        this.bitmapList=bitmapList;
        ivList=new ArrayList<>();
        for (int i=0;i<bitmapList.size();i++){
            ImageView imageView=new ImageView(context);
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
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(ivList.get(position));
        return ivList.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
