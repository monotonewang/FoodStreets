package com.wang.www.util;

/**
 * Created by user on 2016/2/25.
 */
public interface Constants  {
    /**
     * 请求数据连接
     */
    interface URL{
       String RecommendUrl="http://api.meishi.cc/v5/index4.php?format=json";
       String recommendUrl="http://api.meishi.cc/v5/index5.php?format=json";
    }

    /**
     * 常量名
     */
    interface KEYNAME{
        String WELCOME_ACTIVITY="welcome_activity";//欢迎页的欢迎keyName
        String RECOMMEND_FRAGMENT_VP="recommend_fragment_vp";//欢迎页的首页Fragment的ViewPager
        String RECOMMEND_FRAGMENT_VP_TITLE="recommend_fragment_vp_title";//欢迎页的首页Fragment的ViewPager
        String RECOMMEND_FRAGMENT_VP_TOP3="recommend_fragment_vp_top3";//欢迎页的Top3Fragment的ViewPager
        String RECOMMEND_SAN_CAN="recommend_san_can";//欢迎页的Top3Fragment的ViewPager
        String RECOMMEND_SAN_CAN_TITLE="recommend_san_can_title";//欢迎页的Top3Fragment的ViewPager
    }
    interface TAG{
        String RECOMMEND_FRARMENT="recommend_frarment";
        String FOUND_FRAMENT="found_frament";
        String SHOP_FRAMENT="shop_frament";
        String EAT_FRAMENT="eat_frament";
        String ME_FRAMENT="me_frament";
    }
}
