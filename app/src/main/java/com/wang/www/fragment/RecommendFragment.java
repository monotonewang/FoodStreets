package com.wang.www.fragment;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.bumptech.glide.Glide;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.viewpagerindicator.CirclePageIndicator;
import com.wang.www.R;
import com.wang.www.adapter.RecommendShopAdapter;
import com.wang.www.adapter.RecommendTop3Adapter;
import com.wang.www.adapter.RecommendViewPagerAdapter;
import com.wang.www.base.BaseFragment;
import com.wang.www.custem.CustomListView;
import com.wang.www.custem.RecommendFenleiView;
import com.wang.www.custem.RecommendView;
import com.wang.www.model.RecommendEntity;
import com.wang.www.util.Constants;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016/2/25.
 */
public class RecommendFragment extends BaseFragment {
    private String TAG = "RecommendFragment";
    //    private List<MainEntity.ObjEntity.SanCanEntity> sanCanEntitie;
    //    @Bind(R.id.fragment_recommend_ptrView)
//    public PullToRefreshView pullToRefreshView;
    private Handler handler = new Handler();
    private String name;
    private AnimationDrawable animation;
    private PullToRefreshListView recommendListView;
    private ViewPager viewPager;


    @Override
    protected int getViewResId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void init(View view) {
        super.init(view);
        recommendListView = (PullToRefreshListView) view.findViewById(R.id.recommend_ptr);
//        SimpleDraweeView recommendSdv = (SimpleDraweeView) view.findViewById(R.id.recommend_sdv);
//        FrescoUtil.imageViewBind("http://img.sootuu.com/vector/200801/097/310.jpg", recommendSdv);
//        ImageView imageView = (ImageView) view.findViewById(R.id.recommend_iv);
//        Glide.with(this).load("http://img1.imgtn.bdimg.com/it/u=1293775107,6809434&fm=21&gp=0.jpg").into(imageView);
//        viewPager = (ViewPager) view.findViewById(R.id.recommend_vp);

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
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("PullTORefreshView" + i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);
        recommendListView.setAdapter(arrayAdapter);

        if (getJsonFromAsstes() != null) {
            RecommendEntity recommendEntity = getJsonFromAsstes();
            showViews(recommendEntity);
        } else {
            AndroidNetworking.post(Constants.URL.recommendUrl)
                    .build()
                    .getAsString(new StringRequestListener() {

                        @Override
                        public void onResponse(String response) {
                            RecommendEntity recommendEntity = JSONObject.parseObject(response, RecommendEntity.class);
                            showViews(recommendEntity);
                        }

                        @Override
                        public void onError(ANError anError) {

                        }
                    });
        }
//        recommendFragmentVPView.setUrl(Constants.URL.RecommendUrl);
    }

    private void showViews(RecommendEntity recommendEntity) {
        if (Integer.parseInt(recommendEntity.getCode()) == 1) {
            ListView listView = recommendListView.getRefreshableView();
            //topViewPager
            RecommendView recommendView = setTopViewPager(recommendEntity);

            //fenlei
            RecommendFenleiView recommendFenleiView = setFenleiView(recommendEntity);

            //func
            LinearLayout recommendFuncView = setFuncView(recommendEntity);

            //top3
            ViewPager top3VPView = setTop3View(recommendEntity);

            //shops
            CustomListView lvShop = setShopView(recommendEntity);


            listView.addHeaderView(recommendView);
            listView.addHeaderView(recommendFenleiView);
            listView.addHeaderView(recommendFuncView);
            listView.addHeaderView(top3VPView);
            listView.addHeaderView(lvShop);

        }
    }

    private RecommendEntity getJsonFromAsstes() {
        AssetManager assets = getActivity().getAssets();
        ByteArrayOutputStream out;
        byte[] buffer = null;
        try {
            InputStream inputStream = assets.open("json/recommendFragment.json");
            out = new ByteArrayOutputStream();
            int len;
            byte[] bs = new byte[1024];
            while ((len = inputStream.read(bs)) != -1) {
                out.write(bs, 0, len);
            }
            buffer = out.toByteArray();
            inputStream.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buffer != null) {
            try {
                String json = new String(buffer, "utf-8");
                return JSONObject.parseObject(json, RecommendEntity.class);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @NonNull
    private CustomListView setShopView(RecommendEntity recommendEntity) {
        CustomListView lvShop = new CustomListView(getActivity());
        RecommendShopAdapter recommendShopAdapter = new RecommendShopAdapter(getActivity(), R.layout.listview_recommend_shop);
        List<RecommendEntity.ObjBean.ShopsBean> shopsBeanList = recommendEntity.getObj().getShops();
        recommendShopAdapter.setDatas(shopsBeanList);
        lvShop.setAdapter(recommendShopAdapter);
        return lvShop;
    }

    @NonNull
    private ViewPager setTop3View(RecommendEntity recommendEntity) {
        ViewPager top3VPView = new ViewPager(getActivity());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 500);
        top3VPView.setLayoutParams(layoutParams);
        RecommendTop3Adapter recommendTop3Adapter = new RecommendTop3Adapter(recommendEntity.getObj().getTop3(), getActivity());
        top3VPView.setAdapter(recommendTop3Adapter);
        return top3VPView;
    }

    @NonNull
    private LinearLayout setFuncView(RecommendEntity recommendEntity) {
        LinearLayout recommendFuncView = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.custom_func, new LinearLayout(getActivity()));

        TextView textView = (TextView) recommendFuncView.findViewById(R.id.custom_func_shop);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/xxx.ttf");
        textView.setTypeface(typeface);

        ImageView imageView1 = (ImageView) recommendFuncView.findViewById(R.id.iv_func1);
        ImageView imageView2 = (ImageView) recommendFuncView.findViewById(R.id.iv_func2);
        Glide.with(getActivity()).load(recommendEntity.getObj().getFunc1().getImage()).into(imageView1);
        Glide.with(getActivity()).load(recommendEntity.getObj().getFunc2().getImage()).into(imageView2);
        return recommendFuncView;
    }

    @NonNull
    private RecommendFenleiView setFenleiView(RecommendEntity recommendEntity) {
        List<RecommendEntity.ObjBean.FenleiBean> fenlei = recommendEntity.getObj().getFenlei();
        RecommendFenleiView recommendFenleiView = new RecommendFenleiView(getActivity());
        WindowManager windowManager = getActivity().getWindowManager();
        recommendFenleiView.setTotal(fenlei, windowManager);
        return recommendFenleiView;
    }

    @NonNull
    private RecommendView setTopViewPager(RecommendEntity recommendEntity) {
        //viewPager image
        List<RecommendEntity.ObjBean.SanCanBean> san_can = recommendEntity.getObj().getSan_can();
        ArrayList<RecommendEntity.ObjBean.SanCanBean> sancanEntity = (ArrayList<RecommendEntity.ObjBean.SanCanBean>) san_can;
        List<ArrayList<RecommendEntity.ObjBean.SanCanBean>> sanCanEntities = new ArrayList<>();
        int i = -3;
        for (int k = 0; k < sancanEntity.size() / 3; k++) {
            ArrayList<RecommendEntity.ObjBean.SanCanBean> dataList = new ArrayList<>();
            i = i + 3;
            for (int j = i; j < i + 3; j++) {
                dataList.add(sancanEntity.get(j));
            }
            sanCanEntities.add(dataList);
        }

        //title
        List<RecommendEntity.ObjBean.SanCanTitlesBean> san_can_titles = recommendEntity.getObj().getSan_can_titles();
        ArrayList<RecommendEntity.ObjBean.SanCanTitlesBean> sanCanTitlesEntity = (ArrayList<RecommendEntity.ObjBean.SanCanTitlesBean>) san_can_titles;
        List<ArrayList<RecommendEntity.ObjBean.SanCanTitlesBean>> sanCanTitleEntities = new ArrayList<>();
        int y = -1;
        for (int k = 0; k < san_can_titles.size(); k++) {
            ArrayList<RecommendEntity.ObjBean.SanCanTitlesBean> datas = new ArrayList<>();
            y = y + 1;
            for (int t = y; t < y + 1; t++) {
                datas.add(sanCanTitlesEntity.get(t));
            }
            sanCanTitleEntities.add(datas);
        }

        RecommendViewPagerAdapter recommendViewPagerAdapter = new RecommendViewPagerAdapter(getFragmentManager(), sanCanEntities, sanCanTitleEntities, getActivity());
//                            viewPager.setAdapter(recommendViewPagerAdapter);

//                            addHeaderTextView(listView);
        RecommendView recommendView = new RecommendView(getActivity());
        ViewPager viewPager = recommendView.getViewPager();
        viewPager.setAdapter(recommendViewPagerAdapter);
        //set circle
        CirclePageIndicator circlePageIndicator = recommendView.getCirclePageIndicator();
        circlePageIndicator.setViewPager(viewPager);
        return recommendView;

    }

    /**
     * add TextView
     *
     * @param listView
     */
    private void addHeaderTextView(ListView listView) {
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(getActivity());
        textView.setText("add");
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(16);
        textView.setLayoutParams(layoutParams);
        listView.addHeaderView(textView);
    }


}
