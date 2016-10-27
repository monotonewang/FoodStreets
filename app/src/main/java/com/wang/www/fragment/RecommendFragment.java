package com.wang.www.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.wang.www.R;
import com.wang.www.base.BaseFragment;
import com.wang.www.custem.RecommendFragmentVPView;
import com.wang.www.model.MainEntity;
import com.wang.www.util.Constants;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/25.
 */
public class RecommendFragment extends BaseFragment {
    private String TAG="RecommendFragment";
//    private List<MainEntity.ObjEntity.SanCanEntity> sanCanEntitie;
    private List<ArrayList<MainEntity.ObjEntity.SanCanEntity>> sanCanEntities;//这是ViewPager传递的数据
    private List<ArrayList<MainEntity.ObjEntity.SanCanTitlesEntity>> sanCanTitlesEntities;
//    @Bind(R.id.fragment_recommend_ptrView)
//    public PullToRefreshView pullToRefreshView;
    private RecommendFragmentVPView recommendFragmentVPView;
    private Handler handler=new Handler();
    private String name;
    private AnimationDrawable animation;

    @Override
    protected int getViewResId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void init(View view) {
        super.init(view);
//        pullToRefreshView.setHeadView(R.layout.custem_ptr_headview);
//        pullToRefreshView.getListView().setOnItemClickListener(this);
//        pullToRefreshView.setOnPullToRefreshListener(new PullToRefreshView.OnPullToRefreshListener() {
//
//            @Override
//            public void onPullMovie(int movey, View headView) {
//                TextView textView= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
//                //下拉刷新
//                textView.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_on_pull_movie));
////                Log.e(TAG, "onPullMovie: movey="+movey);
//                if(movey>200){
//                    TextView textView1= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
//                    //松开刷新数据
//                    textView1.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_on_refresh));
//                }
//            }
//
//            @Override
//            public void onRefresh(View headView) {
//                TextView textView= (TextView) headView.findViewById(R.id.custem_ptr_headView_tv1);
//                //正在加载
//                textView.setText(getActivity().getResources().getString(R.string.fragment_recommend_head_search_refresh_refresh_complete));
//                //设置下拉刷新的。
//                ImageView iv = (ImageView) headView.findViewById(R.id.iv_wait);
//                Drawable drawable=getResources().getDrawable(R.drawable.wait_anim);
//                iv.setBackground(drawable);
//                animation = (AnimationDrawable) iv.getBackground();
//                animation.start();
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        pullToRefreshView.refreshComplete();
//                    }
//                }, 5000);
//            }
//
//            @Override
//            public void onRefreshCompelet(View headView) {
//
////                handler.postDelayed(new Runnable() {
////                    @Override
////                    public void run() {
////                        pullToRefreshView.refreshComplete();
////                    }
////                }, 2000);
//                animation.stop();
//            }
//        });
        //给下拉刷新设置适配器
        //这个是首页的早餐 ，中餐和晚餐的ViewPager
//        recommendFragmentVPView = new RecommendFragmentVPView(getActivity(),getActivity().getSupportFragmentManager());
//        pullToRefreshView.getListView().addHeaderView(recommendFragmentVPView);
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
//        OkHttpUtil.downJSON(Constants.URL.RecommendUrl, this);
        AndroidNetworking.post(Constants.URL.recommendUrl)
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e(TAG, "onResponse: "+response);
                        
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
//        recommendFragmentVPView.setUrl(Constants.URL.RecommendUrl);
    }



}
