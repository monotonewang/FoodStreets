package com.wang.www.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.birth.WheelMain;
import com.wang.www.model.IPEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.Bind;

import static com.wang.www.R.id.found;

/**
 * Created by user on 2016/2/25.
 */
public class FoundFragment extends BaseFragment {
    private String TAG = "FoundFragment";

    @Bind(found)
    TextView textView;

    @Override
    protected int getViewResId() {
        return R.layout.fragment_found;

    }

    @Override
    protected void init(View view) {
        super.init(view);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.shop_vp);
        String datas[] = {"text", "sss", "sssss", "testsss"};
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getActivity(), datas);
        viewPager.setAdapter(myPagerAdapter);
        TextView foundTv = (TextView) view.findViewById(found);

        foundTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), TimePickActivity.class);
//                startActivity(intent);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Calendar calendar = Calendar.getInstance();
                String txtTime = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
                        + calendar.get(Calendar.DAY_OF_MONTH) + "";
                View mBirthView = LayoutInflater.from(getActivity()).inflate(R.layout.pop_timepicker, null);
                ImageView ivConfim = (ImageView) mBirthView.findViewById(R.id.ivConfirm);
                ivConfim.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                ScreenInfo screenInfo = new ScreenInfo(getActivity());
                WheelMain mWheelMain = new WheelMain(mBirthView);
            }
        });
    }

    public class ScreenInfo {
        private Activity activity;
        private int width;
        private int height;
        private float density;
        private int densityDpi;

        public Activity getActivity() {
            return activity;
        }

        public void setActivity(Activity activity) {
            this.activity = activity;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public float getDensity() {
            return density;
        }

        public void setDensity(float density) {
            this.density = density;
        }

        public int getDensityDpi() {
            return densityDpi;
        }

        public void setDensityDpi(int densityDpi) {
            this.densityDpi = densityDpi;
        }

        public ScreenInfo(Activity activity) {
            this.activity = activity;
            ini();
        }

        private void ini() {
            DisplayMetrics metric = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(metric);
            width = metric.widthPixels;
            height = metric.heightPixels;
            density = metric.density;
            densityDpi = metric.densityDpi;
        }


    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
        AndroidNetworking.get("http://ip.taobao.com/service/getIpInfo.php")
                .addQueryParameter("ip", "12.12.5.15")
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Log.e(TAG, "onResponseString: " + response);
                        IPEntity ipEntity = JSONObject.parseObject(response, IPEntity.class);
                        Log.e(TAG, ipEntity.toString());
                        String county = ipEntity.getData().getCountry() + "--" + ipEntity.getData().getIp() + "--" + ipEntity.getData().getCountry_id();
                        textView.setText(county);
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });


    }

    private class MyPagerAdapter extends PagerAdapter {
        private List<TextView> textViews;
        private Context context;
        private String[] datas;

        public MyPagerAdapter(Context context, String[] datas) {
            textViews = new ArrayList<>();
            this.context = context;
            this.datas = datas;
            for (int i = 0; i < datas.length; i++) {
                TextView textView = new TextView(context);
                textView.setText(datas[i]);
                textView.setGravity(Gravity.CENTER);
                textView.setTextSize(18);
                textView.setTextColor(Color.BLUE);
                textViews.add(textView);
            }
        }

        @Override
        public int getCount() {
            return datas.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(textViews.get(position));
            return textViews.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(textViews.get(position));
        }
    }
}
