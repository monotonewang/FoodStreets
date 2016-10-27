package com.wang.www;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wang.www.base.BaseActivity;
import com.wang.www.fragment.EatFragment;
import com.wang.www.fragment.FoundFragment;
import com.wang.www.fragment.MeFragment;
import com.wang.www.fragment.RecommendFragment;
import com.wang.www.fragment.ShopFragment;
import com.wang.www.util.Constants;

import java.util.List;

import butterknife.Bind;
import butterknife.OnCheckedChanged;

/**
 * MainActivity
 */
public class MainActivity extends BaseActivity {
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
    private ShopFragment shopFragment;
    private EatFragment eatFragment;
    private MeFragment meFragment;
    private FragmentManager supportFragmentManager;

    @Override
    protected int getViewResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        super.init();

    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
        supportFragmentManager = getFragmentManager();
        recommendFragment = new RecommendFragment();
        foundFragment = new FoundFragment();
        shopFragment = new ShopFragment();
        eatFragment = new EatFragment();
        meFragment = new MeFragment();

        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(0);
        radioButton.setChecked(true);

        fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_fl, recommendFragment, Constants.TAG.RECOMMEND_FRARMENT);
        fragmentTransaction.add(R.id.main_fl, foundFragment, Constants.TAG.FOUND_FRAMENT);
        fragmentTransaction.add(R.id.main_fl, shopFragment, Constants.TAG.SHOP_FRAMENT);
        fragmentTransaction.add(R.id.main_fl, eatFragment, Constants.TAG.EAT_FRAMENT);
        fragmentTransaction.add(R.id.main_fl, meFragment, Constants.TAG.ME_FRAMENT);
        fragmentTransaction.commit();
//        use Fresco load image
//        FrescoUtil.imageViewBind("http://pic.nipic.com/2007-11-09/2007119122519868_2.jpg", simpleDraweeView);
    }

    @OnCheckedChanged({R.id.main_recommend, R.id.main_found, R.id.main_shop, R.id.main_eat, R.id.main_me})
    public void onClick(RadioButton radioButton) {
        switch (radioButton.getId()) {
            case R.id.main_recommend:
                fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.hide(foundFragment);
                fragmentTransaction.hide(shopFragment);
                fragmentTransaction.hide(eatFragment);
                fragmentTransaction.hide(meFragment);
                fragmentTransaction.show(recommendFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_found:
                fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.hide(recommendFragment);
                fragmentTransaction.hide(shopFragment);
                fragmentTransaction.hide(eatFragment);
                fragmentTransaction.hide(meFragment);
                fragmentTransaction.show(foundFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_shop:
                fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.hide(recommendFragment);
                fragmentTransaction.hide(foundFragment);
                fragmentTransaction.hide(eatFragment);
                fragmentTransaction.hide(meFragment);
                fragmentTransaction.show(shopFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_eat:
                fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.hide(recommendFragment);
                fragmentTransaction.hide(foundFragment);
                fragmentTransaction.hide(shopFragment);
                fragmentTransaction.hide(meFragment);
                fragmentTransaction.show(eatFragment);
                fragmentTransaction.commit();
                break;
            case R.id.main_me:
                fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.hide(recommendFragment);
                fragmentTransaction.hide(foundFragment);
                fragmentTransaction.hide(shopFragment);
                fragmentTransaction.hide(eatFragment);
                fragmentTransaction.show(meFragment);
                fragmentTransaction.commit();
                break;
        }
    }
}
