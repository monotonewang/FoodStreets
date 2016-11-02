package com.wang.www.activity;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wang.www.R;
import com.wang.www.base.BaseActivity;
import com.wang.www.fragment.EatFragment;
import com.wang.www.fragment.FoundFragment;
import com.wang.www.fragment.MeFragment;
import com.wang.www.fragment.RecommendFragment;
import com.wang.www.fragment.ShopFragment;

import java.util.List;

import butterknife.Bind;

/**
 * MainActivity
 */
public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    /*  @Bind(R.id.sdv)
      public SimpleDraweeView simpleDraweeView;*/
    @Bind(R.id.main_rgp)
    public RadioGroup radioGroup;
    @Bind({R.id.main_recommend, R.id.main_found, R.id.main_shop, R.id.main_eat, R.id.main_me})
    public List<RadioButton> rbList;
    private String TAG = "MainActivity";
    private FragmentTransaction fragmentTransaction;
    private RecommendFragment recommendFragment;
    private FoundFragment foundFragment;
    private FragmentManager fragmentManager;
    private ShopFragment shopFragment;
    private MeFragment meFragment;
    private EatFragment eatFragment;

    @Override
    protected int getViewResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(View view) {
        super.init(view);
        radioGroup.setOnCheckedChangeListener(this);

        fragmentManager = getFragmentManager();
        recommendFragment = new RecommendFragment();
        foundFragment = new FoundFragment();
        shopFragment = new ShopFragment();
        eatFragment = new EatFragment();
        meFragment = new MeFragment();

        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(0);
        radioButton.setChecked(true);

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_fl, recommendFragment);
        fragmentTransaction.add(R.id.main_fl, foundFragment);
        fragmentTransaction.add(R.id.main_fl, shopFragment);
        fragmentTransaction.add(R.id.main_fl, eatFragment);
        fragmentTransaction.add(R.id.main_fl, meFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
//        use Fresco load image
//        FrescoUtil.imageViewBind("http://pic.nipic.com/2007-11-09/2007119122519868_2.jpg", simpleDraweeView);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.main_recommend:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.hide(foundFragment).hide(shopFragment).hide(eatFragment).hide(meFragment).show(recommendFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_found:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.hide(recommendFragment).hide(shopFragment).hide(eatFragment).hide(meFragment).show(foundFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_shop:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.hide(foundFragment).hide(recommendFragment).hide(eatFragment).hide(meFragment).show(shopFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_eat:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.hide(foundFragment).hide(shopFragment).hide(recommendFragment).hide(meFragment).show(eatFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_me:
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.hide(foundFragment).hide(shopFragment).hide(eatFragment).hide(recommendFragment).show(meFragment);
                fragmentTransaction.commit();
                break;

        }
    }

}
