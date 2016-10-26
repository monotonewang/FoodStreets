package com.wang.www;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wang.www.base.BaseActivity;
import com.wang.www.fragment.MainFragment;

import java.util.List;

import butterknife.Bind;
import butterknife.OnCheckedChanged;

/**
 * 这是主页面的Activity
 */
public class MainActivity extends BaseActivity {
  /*  @Bind(R.id.sdv)
    public SimpleDraweeView simpleDraweeView;*/
    @Bind(R.id.fragment_recommend_radiogp)
    public RadioGroup radioGroup;
    @Bind({R.id.fragment_recommend_radiobtn_recommend,R.id.fragment_recommend_radiobtn_faxian,R.id.fragment_recommend_radiobtn_shop,R.id.fragment_recommend_radiobtn_eattalkd,R.id.fragment_recommend_radiobtn_mine})
    public List<RadioButton> radioButtonList;
    private String TAG="MainActivity";

    @Override
    protected int getViewResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        super.init();
        radioButtonList.get(0).setChecked(true);
    }

    @Override
    protected void loadDatas() {
        super.loadDatas();
        //利用Fresco加载图片
//        FrescoUtil.imageViewBind("http://pic.nipic.com/2007-11-09/2007119122519868_2.jpg", simpleDraweeView);
    }
    @OnCheckedChanged({R.id.fragment_recommend_radiobtn_recommend,R.id.fragment_recommend_radiobtn_faxian,R.id.fragment_recommend_radiobtn_shop,R.id.fragment_recommend_radiobtn_eattalkd,R.id.fragment_recommend_radiobtn_mine})
    public void onClick(RadioButton radioButton){
        switch (radioButton.getId()){
            case R.id.fragment_recommend_radiobtn_recommend:
//                Log.e(TAG, "onClick: "+"==rec" );
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fl,new MainFragment()).commit();
                break;
            /*case R.id.fragment_recommend_radiobtn_faxian:
                Log.e(TAG, "onClick: "+"==dis" );
                    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fl,new DiscoverFragment()).commit();
                break;*/
        }
    }
}
