package com.example.user.foodstreet.util;

/**
 * Created by user on 2016/2/25.
 */
public interface Constants  {
    /**
     * 请求数据连接
     */
    interface URL{
       String RecommendUrl="http://api.meishi.cc/v5/index4.php?format=json";
    }

    /**
     * 常量名
     */
    interface KEYNAME{
        String WELCOME_TAG="welcome_tag";//欢迎页的欢迎keyName
        String RECOMMEND_FRAGMENT_VP="recommend_fragment_vp";//欢迎页的首页Fragment的ViewPager
        String RECOMMEND_FRAGMENT_VP_TITLE="recommend_fragment_vp_title";//欢迎页的首页Fragment的ViewPager
        String RECOMMEND_FRAGMENT_VP_TOP3="recommend_fragment_vp_top3";//欢迎页的Top3Fragment的ViewPager
    }
}
