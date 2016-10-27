package com.wang.www.fragment;

import android.util.Log;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.model.IPEntity;

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
                        String county=ipEntity.getData().getCountry()+"--"+ipEntity.getData().getIp()+"--"+ipEntity.getData().getCountry_id();
                        textView.setText(county);
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }
}
