package com.wang.www.fragment;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.model.IPEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by user on 2016/2/25.
 */
public class FoundFragment extends BaseFragment {
    private String TAG = "FoundFragment";

    @Bind(R.id.found)
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
