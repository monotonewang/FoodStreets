package com.example.user.foodstreet.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.foodstreet.fragment.RecommendTop3VPFragment;
import com.example.user.foodstreet.model.RecommendFoodModel;

/**
 * Created by user on 2016/2/26.
 */
public class RecommendFragmentTop3VPAdapter extends FragmentPagerAdapter {

    private final String TAG="Recommendtop3VPAdapter";
    private RecommendFoodModel.ObjEntity top3;
//    private List<SimpleDraweeView> simpleDraweeViews;
    private Context context;

    public RecommendFragmentTop3VPAdapter(Context context, RecommendFoodModel.ObjEntity top3, FragmentManager fm) {
        super(fm);
        this.context=context;
        this.top3=top3;
    }

    @Override
    public Fragment getItem(int position) {
        return RecommendTop3VPFragment.getInstance(top3.agetTop3().get(position));
    }


    @Override
    public int getCount() {
        return top3.agetTop3().size();
    }


      /*  public RecommendFragmentTop3VPAdapter(Context context, List<RecommendFoodModel.ObjEntity.Top3Entity> top3) {
        this.context=context;
        this.top3=top3;
        simpleDraweeViews =new ArrayList<>();
        for (int i=0;i<top3.size();i++){
            SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
            simpleDraweeView.setMaxHeight(100);
            simpleDraweeView.setMaxWidth(100);
            Log.e(TAG,simpleDraweeView.getId()+"");
//            simpleDraweeView.setv
            Log.e(TAG, "RecommendFragmentTop3VPAdapter: "+top3.get(i).getPhoto());
            FrescoUtil.imageViewBind(top3.get(i).getPhoto(), simpleDraweeView);
            simpleDraweeViews.add(simpleDraweeView);
        }
    }*/

}
