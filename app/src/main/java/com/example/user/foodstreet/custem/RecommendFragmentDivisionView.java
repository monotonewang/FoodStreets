package com.example.user.foodstreet.custem;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.user.foodstreet.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by user on 2016/2/27.
 */
public class RecommendFragmentDivisionView extends LinearLayout {
    @Nullable
    @Bind(R.id.custem_disvision_recommend_iv)
    public ImageView imageViewToday;
    @Nullable
    @Bind({R.id.custem_disvision_recommend_tv,R.id.custem_disvision_recommend_tv2})
    public List<TextView> textViewToday;
    public RecommendFragmentDivisionView(Context context) {
        super(context);
        init();
    }

    public RecommendFragmentDivisionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.custem_division_recommend,this,true);
        ButterKnife.bind(this);
    }
}
