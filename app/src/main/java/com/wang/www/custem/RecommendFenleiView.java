package com.wang.www.custem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wang.www.R;
import com.wang.www.model.RecommendEntity;
import com.wang.www.util.DisplayUtils;

import java.util.List;

/**
 * deso: FoodStreets dynamic add LinearLayout<br/>
 * time: 2016/10/31 13:38 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendFenleiView extends LinearLayout {
    private LinearLayout layout;
    private String TAG = "RecommendFenleiView";

    public RecommendFenleiView(Context context) {
        super(context);

        init();
    }

    public RecommendFenleiView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public RecommendFenleiView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.custom_fenlei, this, true);
        layout = (LinearLayout) view.findViewById(R.id.ll_fenlei);

    }

    public void setTotal(List<RecommendEntity.ObjBean.FenleiBean> fenleiBeen, WindowManager windowManager) {
        int size = fenleiBeen.size();
        if (size > 0) {
//            int padding = 0;
            for (int i = 0; i < size; i++) {
                View view = LayoutInflater.from(getContext()).inflate(R.layout.custom_fenlei_child, new LinearLayout(getContext()));

                int screenWidth = DisplayUtils.getScreenWidth(windowManager);
                int layWidth = screenWidth / size;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(layWidth, LayoutParams.WRAP_CONTENT);
//                if(i%2==0){
//                view.setPadding();
//                    view.setBackgroundColor(Color.BLUE);
//                }
                TextView textView = (TextView) view.findViewById(R.id.tv_fenlei);
                textView.setText(fenleiBeen.get(i).getTitle());
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_fenlei);
                Glide.with(getContext()).load(fenleiBeen.get(i).getImage()).into(imageView);
                view.setLayoutParams(layoutParams);

//                view.setPadding(padding, 0, padding, 0);
//                padding += 50;
                layout.addView(view);
            }
        }
    }
}
