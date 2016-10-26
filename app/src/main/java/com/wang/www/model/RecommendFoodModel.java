package com.wang.www.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 2016/2/25.
 */
public class RecommendFoodModel implements Serializable {
    @Override
    public String toString() {
        return "RecommendFoodModel{" +
                "code='" + code + '\'' +
                ", obj=" + obj +
                '}';
    }

    /**
     * code : 1
     * obj : {"san_can":[{"id":"501916","titlepic":"http://images.meishij.net/p/20160219/c30eaa3b07ab3f4eb238bfa7c1c5f3f6.jpg","title":"六招教你熬出美味的粥","descr":"掌握熬粥的秘诀，让粥美味又营养","click_type":"5","click_obj":"501916","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20120511/01fda7e3e152a3d1014d08f629552928_150x150.jpg","fav_num":"3749","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"501916\"}}"},{"id":"1664741","titlepic":"http://images.meishij.net/p/20160219/c2ddcee848b0fa7ca1462d9f59a765cd.jpg","title":"自制爆油咸鸭蛋","descr":"腌一枚香气四溢的流油咸鸭蛋","click_type":"5","click_obj":"1664741","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/69/207/2801819/a2801819_145577848916514.jpg","fav_num":"2224","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1664741\"}}"},{"id":"1664621","titlepic":"http://images.meishij.net/p/20160219/f8b0ca66f3d515aee1c534315cd32c6d.jpg","title":"喷香大豆包","descr":"红豆富含叶酸，孕妇可适当多食","click_type":"5","click_obj":"1664621","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/37/123/4218287/a4218287_145563932667015.jpg","fav_num":"1963","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1664621\"}}"},{"id":"1664777","titlepic":"http://images.meishij.net/p/20160219/f5ccc206a94a5d77d3f1313df6f33eea.jpg","title":"鱼香凤爪","descr":"鸡爪含有丰富的胶原蛋白，有滋润肌肤之效","click_type":"5","click_obj":"1664777","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/86/218/4367086/a4367086_145572455143636.jpg","fav_num":"1071","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1664777\"}}"},{"id":"1663142","titlepic":"http://images.meishij.net/p/20160219/352c2510240d4d22c8ca4c16930df5ad.jpg","title":"五果鸭","descr":"鸭肉性味甘、微寒，可滋阴补血、益气利水","click_type":"5","click_obj":"1663142","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/58/07/2939308/a2939308_145429952728449.jpg","fav_num":"1514","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1663142\"}}"},{"id":"201848","titlepic":"http://images.meishij.net/p/20160219/95bb2213b722acb002e6ccad73066cde.jpg","title":"桂花糯米藕","descr":"藕有养胃滋阴的功效，是很好的食补佳品","click_type":"5","click_obj":"201848","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20110819/f770386a18d0eb137ee484c9a6d7bb31_150x150.jpg","fav_num":"5435","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"201848\"}}"},{"id":"1627625","titlepic":"http://images.meishij.net/p/20160219/0544d8d4f3a9b969de01906cd8a2bb02.jpg","title":"经典马卡龙","descr":"马卡龙，法式下午茶不可或缺的美丽点心","click_type":"5","click_obj":"1627625","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/71/10/3877571/a3877571_142889136983629.jpg","fav_num":"2415","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1627625\"}}"},{"id":"1628491","titlepic":"http://images.meishij.net/p/20160219/29e944e68a15d17263f69ca4cc6ffac7.jpg","title":"舒芙蕾","descr":"入口即化的法式甜点，每一口都如云朵般轻柔","click_type":"5","click_obj":"1628491","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/154/50/3950154/a3950154_142925961102045.jpg","fav_num":"12989","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1628491\"}}"},{"id":"1628171","titlepic":"http://images.meishij.net/p/20160219/ebd7d645e46896c3bca0edf1265d1b86.jpg","title":"拿破仑","descr":"酥脆的酥皮+甜甜的奶油霜+细腻的蛋糕","click_type":"5","click_obj":"1628171","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/107/22/3005607/a3005607_142907779843954.jpg","fav_num":"14812","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1628171\"}}"},{"id":"590283","titlepic":"http://images.meishij.net/p/20160219/a2b6a56298b2103b2c39ddc63ba49430.jpg","title":"家常大烩菜","descr":"最普通的可能却是最美味的，赶快来试试","click_type":"5","click_obj":"590283","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130305/f2d5da048b18b60d2be843f933f12d7a_150x150.jpg","fav_num":"10584","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"590283\"}}"},{"id":"201215","titlepic":"http://images.meishij.net/p/20160219/b46963a10e297880f0dd61d90de897b0.jpg","title":"水烙馍","descr":"源自中原的传统面食，已有2千余年的历史","click_type":"5","click_obj":"201215","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20110815/e4d3449794e2a8f9d4cdc08d0c9d044f_150x150.jpg","fav_num":"12923","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"201215\"}}"},{"id":"1657858","titlepic":"https://dn-mdpic.qbox.me/pic/201602/17/vzsbanNMLUiQlzo_262871310.jpg","title":"","descr":"","click_type":4,"click_obj":"wmf;http://i.meishi.cc/g/transit.php?ename=1435&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/115/102/588115/a588115_145035872851012.jpg","fav_num":"5100","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1435&from=mobile_mobile\"}}"},{"id":"1633892","titlepic":"http://images.meishij.net/p/20160219/4d6655c9f6d45b2338b5c1684fafd0b7.jpg","title":"咖喱鱼丸","descr":"著名港式小吃轻松做，多泡一会味更浓","click_type":"5","click_obj":"1633892","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/246/42/3260746/a3260746_143288294018740.jpg","fav_num":"11726","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1633892\"}}"},{"id":"1663773","titlepic":"http://images.meishij.net/p/20160219/bd1bc340a830ef37012e0a1105fb19b4.jpg","title":"闽南特色炸五香","descr":"闽南特色小吃，外酥里嫩，越吃越香","click_type":"5","click_obj":"1663773","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/131/154/4351131/a4351131_145472637404450.jpg","fav_num":"1915","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1663773\"}}"},{"id":"207211","titlepic":"http://images.meishij.net/p/20160219/8c7b943bc38f12af2536bc56bff226c1.jpg","title":"素蛋饼","descr":"菜团子被蛋液包裹后，煎一煎味道真是好","click_type":"5","click_obj":"207211","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20111103/6b15548774a380057025a8ae31088e6c_150x150.jpg","fav_num":"21896","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"207211\"}}"}],"san_can_titles":[{"title":"早餐","sub_title":"越质朴，越美味","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_1.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"午餐","sub_title":"三款美容菜，吃出好气色","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_2.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"下午茶","sub_title":"与法式甜品的浪漫邂逅","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_3.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"晚餐","sub_title":"河南美食，百年的味道","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_4.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"夜宵","sub_title":"控制不住的食欲，深夜美食大考验","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_5.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""}],"fenlei":[{"title":"菜谱分类","image":"http://static.meishij.net/wap6/images/v6/quanbu.png","click_type":"24","click_obj":"全部菜谱","jump":"{\"type\":\"24\",\"class_name\":\"MSCategoryController\",\"property\":{}}"},{"title":"视频菜谱","image":"http://static.meishij.net/wap6/images/v6/shipincaipu.png","click_type":"1","click_obj":"20001","jump":"{\"type\":\"1\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u89c6\\u9891\\u83dc\\u8c31\",\"listID\":\"20001\",\"listType\":5,\"listFrom\":0}}"},{"title":"早餐","image":"http://static.meishij.net/wap6/images/v6/kuaishoucai.png","click_type":"102","click_obj":"早餐","jump":"{\"type\":\"102\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u65e9\\u9910\",\"listID\":\"zao\",\"listSt\":\"\\u65e9\\u9910\",\"listType\":3}}"},{"title":"附近","image":"http://static.meishij.net/wap6/images/v6/fujin.png","click_type":"25","click_obj":"附近","jump":"{\"type\":\"25\",\"class_name\":\"MSNearyByMapController\",\"property\":{}}"}],"func1":{"title":"最受欢迎","image":"http://static.meishij.net/wap6/images/v6/paihangbang.png"},"func2":{"title":"食材组菜","image":"http://static.meishij.net/wap6/images/v6/zhinengzucai.png"},"top3":[{"photo":"https://dn-mdpic.qbox.me/pic/201512/29/OINydXbRTeGZcts_1457668352.jpg","click_type":"4","click_obj":"幸福生活;http://m.meishij.net/huodong/zt.php?zt_id=44from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=44&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201511/19/WxFJICxFdIqDvnu_682560962.png","click_type":"4","click_obj":"秋梨膏;http://m.meishij.net/huodong/zt.php?zt_id=13&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=13&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201601/15/kWbKoTaWOYuAZwQ_2615140813.jpg","click_type":"4","click_obj":"饺子;http://m.meishij.net/huodong/zt.php?zt_id=41&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=41&from=mobile_mobile\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_banchengpin.jpg","click_type":"5","click_obj":"1636964","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1636964\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_fengmi.jpg","click_type":"5","click_obj":"1644858","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1644858\"}}"}],"top4":[{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg","click_type":"5","click_obj":"1639954","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1639954\"}}"}],"shops":[{"id":"780","title":"COOK100烤肉腌料6包","price":"17.8","guige":"6袋","image":"http://site.meishij.net/shop/uploadfile/20151207/20151207134515.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"780\",\"sourceContent\":\"index\"}}"},{"id":"1081","title":"俏侬牛油蛋挞皮16个装","price":"14.8","guige":"16个","image":"http://site.meishij.net/shop/uploadfile/20160225/20160225140458.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1081\",\"sourceContent\":\"index\"}}"},{"id":"716","title":"欧美特全自动分体保温养生壶","price":"99","guige":"1台","image":"http://site.meishij.net/shop/uploadfile/20151113/20151113120504.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"716\",\"sourceContent\":\"index\"}}"},{"id":"1188","title":"花香大麦茶(粉玫瑰配大麦) ","price":"39","guige":"1盒","image":"http://site.meishij.net/shop/uploadfile/20160205/20160205104550.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1188\",\"sourceContent\":\"index\"}}"}],"zt":[{"id":"7965698","title":"春季养肝正当时","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=83","photo":"http://images.meishij.net/p/20160219/8e368ab9c94f159ceb46926d670eedab.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=83\"}}"},{"id":"7794782","title":"掐一把嫩芽撩拨春天","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=82","photo":"http://images.meishij.net/p/20160219/b9d38161b6c4e3ca2eaead4db0fea907.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=82\"}}"},{"id":"6714014","title":"中式甜品的倾城之美","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong.php?hd=20151014_tiandian","photo":"http://images.meishij.net/p/20160219/4e598df01efa383cf5b95b89df4c306d.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong.php?hd=20151014_tiandian\"}}"}],"customized":{"title":"猜你喜欢","time":"23:06为您更新","total":4,"data":[]}}
     */

    private String code;
    /**
     * san_can : [{"id":"501916","titlepic":"http://images.meishij.net/p/20160219/c30eaa3b07ab3f4eb238bfa7c1c5f3f6.jpg","title":"六招教你熬出美味的粥","descr":"掌握熬粥的秘诀，让粥美味又营养","click_type":"5","click_obj":"501916","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20120511/01fda7e3e152a3d1014d08f629552928_150x150.jpg","fav_num":"3749","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"501916\"}}"},{"id":"1664741","titlepic":"http://images.meishij.net/p/20160219/c2ddcee848b0fa7ca1462d9f59a765cd.jpg","title":"自制爆油咸鸭蛋","descr":"腌一枚香气四溢的流油咸鸭蛋","click_type":"5","click_obj":"1664741","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/69/207/2801819/a2801819_145577848916514.jpg","fav_num":"2224","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1664741\"}}"},{"id":"1664621","titlepic":"http://images.meishij.net/p/20160219/f8b0ca66f3d515aee1c534315cd32c6d.jpg","title":"喷香大豆包","descr":"红豆富含叶酸，孕妇可适当多食","click_type":"5","click_obj":"1664621","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/37/123/4218287/a4218287_145563932667015.jpg","fav_num":"1963","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1664621\"}}"},{"id":"1664777","titlepic":"http://images.meishij.net/p/20160219/f5ccc206a94a5d77d3f1313df6f33eea.jpg","title":"鱼香凤爪","descr":"鸡爪含有丰富的胶原蛋白，有滋润肌肤之效","click_type":"5","click_obj":"1664777","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/86/218/4367086/a4367086_145572455143636.jpg","fav_num":"1071","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1664777\"}}"},{"id":"1663142","titlepic":"http://images.meishij.net/p/20160219/352c2510240d4d22c8ca4c16930df5ad.jpg","title":"五果鸭","descr":"鸭肉性味甘、微寒，可滋阴补血、益气利水","click_type":"5","click_obj":"1663142","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/58/07/2939308/a2939308_145429952728449.jpg","fav_num":"1514","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1663142\"}}"},{"id":"201848","titlepic":"http://images.meishij.net/p/20160219/95bb2213b722acb002e6ccad73066cde.jpg","title":"桂花糯米藕","descr":"藕有养胃滋阴的功效，是很好的食补佳品","click_type":"5","click_obj":"201848","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20110819/f770386a18d0eb137ee484c9a6d7bb31_150x150.jpg","fav_num":"5435","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"201848\"}}"},{"id":"1627625","titlepic":"http://images.meishij.net/p/20160219/0544d8d4f3a9b969de01906cd8a2bb02.jpg","title":"经典马卡龙","descr":"马卡龙，法式下午茶不可或缺的美丽点心","click_type":"5","click_obj":"1627625","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/71/10/3877571/a3877571_142889136983629.jpg","fav_num":"2415","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1627625\"}}"},{"id":"1628491","titlepic":"http://images.meishij.net/p/20160219/29e944e68a15d17263f69ca4cc6ffac7.jpg","title":"舒芙蕾","descr":"入口即化的法式甜点，每一口都如云朵般轻柔","click_type":"5","click_obj":"1628491","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/154/50/3950154/a3950154_142925961102045.jpg","fav_num":"12989","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1628491\"}}"},{"id":"1628171","titlepic":"http://images.meishij.net/p/20160219/ebd7d645e46896c3bca0edf1265d1b86.jpg","title":"拿破仑","descr":"酥脆的酥皮+甜甜的奶油霜+细腻的蛋糕","click_type":"5","click_obj":"1628171","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/107/22/3005607/a3005607_142907779843954.jpg","fav_num":"14812","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1628171\"}}"},{"id":"590283","titlepic":"http://images.meishij.net/p/20160219/a2b6a56298b2103b2c39ddc63ba49430.jpg","title":"家常大烩菜","descr":"最普通的可能却是最美味的，赶快来试试","click_type":"5","click_obj":"590283","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130305/f2d5da048b18b60d2be843f933f12d7a_150x150.jpg","fav_num":"10584","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"590283\"}}"},{"id":"201215","titlepic":"http://images.meishij.net/p/20160219/b46963a10e297880f0dd61d90de897b0.jpg","title":"水烙馍","descr":"源自中原的传统面食，已有2千余年的历史","click_type":"5","click_obj":"201215","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20110815/e4d3449794e2a8f9d4cdc08d0c9d044f_150x150.jpg","fav_num":"12923","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"201215\"}}"},{"id":"1657858","titlepic":"https://dn-mdpic.qbox.me/pic/201602/17/vzsbanNMLUiQlzo_262871310.jpg","title":"","descr":"","click_type":4,"click_obj":"wmf;http://i.meishi.cc/g/transit.php?ename=1435&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/115/102/588115/a588115_145035872851012.jpg","fav_num":"5100","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1435&from=mobile_mobile\"}}"},{"id":"1633892","titlepic":"http://images.meishij.net/p/20160219/4d6655c9f6d45b2338b5c1684fafd0b7.jpg","title":"咖喱鱼丸","descr":"著名港式小吃轻松做，多泡一会味更浓","click_type":"5","click_obj":"1633892","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/246/42/3260746/a3260746_143288294018740.jpg","fav_num":"11726","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1633892\"}}"},{"id":"1663773","titlepic":"http://images.meishij.net/p/20160219/bd1bc340a830ef37012e0a1105fb19b4.jpg","title":"闽南特色炸五香","descr":"闽南特色小吃，外酥里嫩，越吃越香","click_type":"5","click_obj":"1663773","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/131/154/4351131/a4351131_145472637404450.jpg","fav_num":"1915","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1663773\"}}"},{"id":"207211","titlepic":"http://images.meishij.net/p/20160219/8c7b943bc38f12af2536bc56bff226c1.jpg","title":"素蛋饼","descr":"菜团子被蛋液包裹后，煎一煎味道真是好","click_type":"5","click_obj":"207211","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20111103/6b15548774a380057025a8ae31088e6c_150x150.jpg","fav_num":"21896","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"207211\"}}"}]
     * san_can_titles : [{"title":"早餐","sub_title":"越质朴，越美味","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_1.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"午餐","sub_title":"三款美容菜，吃出好气色","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_2.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"下午茶","sub_title":"与法式甜品的浪漫邂逅","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_3.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"晚餐","sub_title":"河南美食，百年的味道","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_4.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"夜宵","sub_title":"控制不住的食欲，深夜美食大考验","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_5.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""}]
     * fenlei : [{"title":"菜谱分类","image":"http://static.meishij.net/wap6/images/v6/quanbu.png","click_type":"24","click_obj":"全部菜谱","jump":"{\"type\":\"24\",\"class_name\":\"MSCategoryController\",\"property\":{}}"},{"title":"视频菜谱","image":"http://static.meishij.net/wap6/images/v6/shipincaipu.png","click_type":"1","click_obj":"20001","jump":"{\"type\":\"1\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u89c6\\u9891\\u83dc\\u8c31\",\"listID\":\"20001\",\"listType\":5,\"listFrom\":0}}"},{"title":"早餐","image":"http://static.meishij.net/wap6/images/v6/kuaishoucai.png","click_type":"102","click_obj":"早餐","jump":"{\"type\":\"102\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u65e9\\u9910\",\"listID\":\"zao\",\"listSt\":\"\\u65e9\\u9910\",\"listType\":3}}"},{"title":"附近","image":"http://static.meishij.net/wap6/images/v6/fujin.png","click_type":"25","click_obj":"附近","jump":"{\"type\":\"25\",\"class_name\":\"MSNearyByMapController\",\"property\":{}}"}]
     * func1 : {"title":"最受欢迎","image":"http://static.meishij.net/wap6/images/v6/paihangbang.png"}
     * func2 : {"title":"食材组菜","image":"http://static.meishij.net/wap6/images/v6/zhinengzucai.png"}
     * top3 : [{"photo":"https://dn-mdpic.qbox.me/pic/201512/29/OINydXbRTeGZcts_1457668352.jpg","click_type":"4","click_obj":"幸福生活;http://m.meishij.net/huodong/zt.php?zt_id=44from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=44&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201511/19/WxFJICxFdIqDvnu_682560962.png","click_type":"4","click_obj":"秋梨膏;http://m.meishij.net/huodong/zt.php?zt_id=13&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=13&from=mobile_mobile\"}}"},{"photo":"https://dn-mdpic.qbox.me/pic/201601/15/kWbKoTaWOYuAZwQ_2615140813.jpg","click_type":"4","click_obj":"饺子;http://m.meishij.net/huodong/zt.php?zt_id=41&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=41&from=mobile_mobile\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_banchengpin.jpg","click_type":"5","click_obj":"1636964","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1636964\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_fengmi.jpg","click_type":"5","click_obj":"1644858","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1644858\"}}"}]
     * top4 : [{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg","click_type":"5","click_obj":"1639954","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1639954\"}}"}]
     * shops : [{"id":"780","title":"COOK100烤肉腌料6包","price":"17.8","guige":"6袋","image":"http://site.meishij.net/shop/uploadfile/20151207/20151207134515.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"780\",\"sourceContent\":\"index\"}}"},{"id":"1081","title":"俏侬牛油蛋挞皮16个装","price":"14.8","guige":"16个","image":"http://site.meishij.net/shop/uploadfile/20160225/20160225140458.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1081\",\"sourceContent\":\"index\"}}"},{"id":"716","title":"欧美特全自动分体保温养生壶","price":"99","guige":"1台","image":"http://site.meishij.net/shop/uploadfile/20151113/20151113120504.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"716\",\"sourceContent\":\"index\"}}"},{"id":"1188","title":"花香大麦茶(粉玫瑰配大麦) ","price":"39","guige":"1盒","image":"http://site.meishij.net/shop/uploadfile/20160205/20160205104550.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1188\",\"sourceContent\":\"index\"}}"}]
     * zt : [{"id":"7965698","title":"春季养肝正当时","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=83","photo":"http://images.meishij.net/p/20160219/8e368ab9c94f159ceb46926d670eedab.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=83\"}}"},{"id":"7794782","title":"掐一把嫩芽撩拨春天","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=82","photo":"http://images.meishij.net/p/20160219/b9d38161b6c4e3ca2eaead4db0fea907.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=82\"}}"},{"id":"6714014","title":"中式甜品的倾城之美","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong.php?hd=20151014_tiandian","photo":"http://images.meishij.net/p/20160219/4e598df01efa383cf5b95b89df4c306d.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong.php?hd=20151014_tiandian\"}}"}]
     * customized : {"title":"猜你喜欢","time":"23:06为您更新","total":4,"data":[]}
     */

    private ObjEntity obj;

    public void setCode(String code) {
        this.code = code;
    }

    public void setObj(ObjEntity obj) {
        this.obj = obj;
    }

    public String getCode() {
        return code;
    }

    public ObjEntity getObj() {
        return obj;
    }

    public static class ObjEntity implements Serializable{
        @Override
        public String toString() {
            return "ObjEntity{" +
                    "func1=" + func1 +
                    ", func2=" + func2 +
                    ", customized=" + customized +
                    ", san_can=" + san_can +
                    ", san_can_titles=" + san_can_titles +
                    ", fenlei=" + fenlei +
                    ", top3=" + top3 +
                    ", top4=" + top4 +
                    ", shops=" + shops +
                    ", zt=" + zt +
                    '}';
        }

        /**
         * title : 最受欢迎
         * image : http://static.meishij.net/wap6/images/v6/paihangbang.png
         */

        private Func1Entity func1;
        /**
         * title : 食材组菜
         * image : http://static.meishij.net/wap6/images/v6/zhinengzucai.png
         */

        private Func2Entity func2;
        /**
         * title : 猜你喜欢
         * time : 23:06为您更新
         * total : 4
         * data : []
         */

        private CustomizedEntity customized;
        /**
         * ViewPager
         * id : 501916
         * titlepic : http://images.meishij.net/p/20160219/c30eaa3b07ab3f4eb238bfa7c1c5f3f6.jpg
         * title : 六招教你熬出美味的粥
         * descr : 掌握熬粥的秘诀，让粥美味又营养
         * click_type : 5
         * click_obj : 501916
         * pv_trackingURL :
         * click_trackingURL :
         * sft : 0
         * is_recipe : 1
         * is_tj : 1
         * tj_img : http://images.meishij.net/p/20120511/01fda7e3e152a3d1014d08f629552928_150x150.jpg
         * fav_num : 3749
         * jump : {"type":"5","class_name":"MSRecipeDetailController","property":{"recipeId":"501916"}}
         */

        private List<SanCanEntity> san_can;
        /**
         * title : 早餐
         * sub_title : 越质朴，越美味
         * titlepic : http://i5.meishij.net/app/mobile/guyu_icon_1.png
         * click_type : 0
         * click_obj :
         * pv_trackingURL :
         * click_trackingURL :
         */

        private List<SanCanTitlesEntity> san_can_titles;
        /**
         * title : 菜谱分类
         * image : http://static.meishij.net/wap6/images/v6/quanbu.png
         * click_type : 24
         * click_obj : 全部菜谱
         * jump : {"type":"24","class_name":"MSCategoryController","property":{}}
         */

        private List<FenleiEntity> fenlei;
        /**
         * photo : https://dn-mdpic.qbox.me/pic/201512/29/OINydXbRTeGZcts_1457668352.jpg
         * click_type : 4
         * click_obj : 幸福生活;http://m.meishij.net/huodong/zt.php?zt_id=44from=mobile_mobile
         * pv_trackingURL :
         * click_trackingURL :
         * is_recipe : 0
         * sft : 0
         * jump : {"type":"4","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/m.meishij.net\/huodong\/zt.php?zt_id=44&from=mobile_mobile"}}
         */

        private List<Top3Entity> top3;
        /**
         * photo : http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg
         * click_type : 5
         * click_obj : 1639954
         * pv_trackingURL :
         * click_trackingURL :
         * is_recipe : 0
         * sft : 0
         * jump : {"type":"51","class_name":"MSArticleDetailController","property":{"recipeId":"1639954"}}
         */

        private List<Top4Entity> top4;
        /**
         * id : 780
         * title : COOK100烤肉腌料6包
         * price : 17.8
         * guige : 6袋
         * image : http://site.meishij.net/shop/uploadfile/20151207/20151207134515.jpg
         * jump : {"type":"10","class_name":"MSBuyGoodsDetailController","property":{"goodsID":"780","sourceContent":"index"}}
         */

        private List<ShopsEntity> shops;
        /**
         * id : 7965698
         * title : 春季养肝正当时
         * type : 1
         * tj_type : 0
         * f_s_type : http://m.meishij.net/huodong/zt.php?zt_id=83
         * photo : http://images.meishij.net/p/20160219/8e368ab9c94f159ceb46926d670eedab.jpg
         * descr :
         * jump : {"type":"103","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/m.meishij.net\/huodong\/zt.php?zt_id=83"}}
         */

        private List<ZtEntity> zt;

        public void setFunc1(Func1Entity func1) {
            this.func1 = func1;
        }

        public void setFunc2(Func2Entity func2) {
            this.func2 = func2;
        }

        public void setCustomized(CustomizedEntity customized) {
            this.customized = customized;
        }

        public void setSan_can(List<SanCanEntity> san_can) {
            this.san_can = san_can;
        }

        public void setSan_can_titles(List<SanCanTitlesEntity> san_can_titles) {
            this.san_can_titles = san_can_titles;
        }

        public void setFenlei(List<FenleiEntity> fenlei) {
            this.fenlei = fenlei;
        }

        public void setTop3(List<Top3Entity> top3) {
            this.top3 = top3;
        }

        public void setTop4(List<Top4Entity> top4) {
            this.top4 = top4;
        }

        public void setShops(List<ShopsEntity> shops) {
            this.shops = shops;
        }

        public void setZt(List<ZtEntity> zt) {
            this.zt = zt;
        }

        public Func1Entity getFunc1() {
            return func1;
        }

        public Func2Entity getFunc2() {
            return func2;
        }

        public CustomizedEntity getCustomized() {
            return customized;
        }

        public List<SanCanEntity> getSan_can() {
            return san_can;
        }

        public List<SanCanTitlesEntity> getSan_can_titles() {
            return san_can_titles;
        }

        public List<FenleiEntity> getFenlei() {
            return fenlei;
        }

        public List<Top3Entity> agetTop3() {
            return top3;
        }

        public List<Top4Entity> getTop4() {
            return top4;
        }

        public List<ShopsEntity> getShops() {
            return shops;
        }

        public List<ZtEntity> getZt() {
            return zt;
        }

        public static class Func1Entity {
            @Override
            public String toString() {
                return "Func1Entity{" +
                        "title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        '}';
            }

            private String title;
            private String image;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }
        }

        public static class Func2Entity {
            @Override
            public String toString() {
                return "Func2Entity{" +
                        "title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        '}';
            }

            private String title;
            private String image;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }
        }

        public static class CustomizedEntity {
            @Override
            public String toString() {
                return "CustomizedEntity{" +
                        "title='" + title + '\'' +
                        ", time='" + time + '\'' +
                        ", total=" + total +
                        ", data=" + data +
                        '}';
            }

            private String title;
            private String time;
            private int total;
            private List<?> data;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public void setData(List<?> data) {
                this.data = data;
            }

            public String getTitle() {
                return title;
            }

            public String getTime() {
                return time;
            }

            public int getTotal() {
                return total;
            }

            public List<?> getData() {
                return data;
            }
        }

        public static class SanCanEntity implements Serializable{
            @Override
            public String toString() {
                return "SanCanEntity{" +
                        "id='" + id + '\'' +
                        ", titlepic='" + titlepic + '\'' +
                        ", title='" + title + '\'' +
                        ", descr='" + descr + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        ", sft='" + sft + '\'' +
                        ", is_recipe='" + is_recipe + '\'' +
                        ", is_tj='" + is_tj + '\'' +
                        ", tj_img='" + tj_img + '\'' +
                        ", fav_num='" + fav_num + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }

            private String id;
            private String titlepic;
            private String title;
            private String descr;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String sft;
            private String is_recipe;
            private String is_tj;
            private String tj_img;
            private String fav_num;
            private String jump;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitlepic(String titlepic) {
                this.titlepic = titlepic;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public void setIs_tj(String is_tj) {
                this.is_tj = is_tj;
            }

            public void setTj_img(String tj_img) {
                this.tj_img = tj_img;
            }

            public void setFav_num(String fav_num) {
                this.fav_num = fav_num;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getId() {
                return id;
            }

            public String getTitlepic() {
                return titlepic;
            }

            public String getTitle() {
                return title;
            }

            public String getDescr() {
                return descr;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public String getSft() {
                return sft;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public String getIs_tj() {
                return is_tj;
            }

            public String getTj_img() {
                return tj_img;
            }

            public String getFav_num() {
                return fav_num;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class SanCanTitlesEntity {
            @Override
            public String toString() {
                return "SanCanTitlesEntity{" +
                        "title='" + title + '\'' +
                        ", sub_title='" + sub_title + '\'' +
                        ", titlepic='" + titlepic + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        '}';
            }

            private String title;
            private String sub_title;
            private String titlepic;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public void setTitlepic(String titlepic) {
                this.titlepic = titlepic;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public String getTitle() {
                return title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public String getTitlepic() {
                return titlepic;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }
        }

        public static class FenleiEntity {
            @Override
            public String toString() {
                return "FenleiEntity{" +
                        "title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }

            private String title;
            private String image;
            private String click_type;
            private String click_obj;
            private String jump;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getTitle() {
                return title;
            }

            public String getImage() {
                return image;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class Top3Entity implements Serializable {
            @Override
            public String toString() {
                return "Top3Entity{" +
                        "photo='" + photo + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        ", is_recipe='" + is_recipe + '\'' +
                        ", sft='" + sft + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }

            private String photo;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String is_recipe;
            private String sft;
            private String jump;

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getPhoto() {
                return photo;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public String getSft() {
                return sft;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class Top4Entity {
            @Override
            public String toString() {
                return "Top4Entity{" +
                        "photo='" + photo + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        ", is_recipe='" + is_recipe + '\'' +
                        ", sft='" + sft + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }

            private String photo;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String is_recipe;
            private String sft;
            private String jump;

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getPhoto() {
                return photo;
            }

            public String getClick_type() {
                return click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public String getSft() {
                return sft;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class ShopsEntity {
            @Override
            public String toString() {
                return "ShopsEntity{" +
                        "id='" + id + '\'' +
                        ", title='" + title + '\'' +
                        ", price='" + price + '\'' +
                        ", guige='" + guige + '\'' +
                        ", image='" + image + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }

            private String id;
            private String title;
            private String price;
            private String guige;
            private String image;
            private String jump;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public void setGuige(String guige) {
                this.guige = guige;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getPrice() {
                return price;
            }

            public String getGuige() {
                return guige;
            }

            public String getImage() {
                return image;
            }

            public String getJump() {
                return jump;
            }
        }

        public static class ZtEntity {
            @Override
            public String toString() {
                return "ZtEntity{" +
                        "id='" + id + '\'' +
                        ", title='" + title + '\'' +
                        ", type='" + type + '\'' +
                        ", tj_type='" + tj_type + '\'' +
                        ", f_s_type='" + f_s_type + '\'' +
                        ", photo='" + photo + '\'' +
                        ", descr='" + descr + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }

            private String id;
            private String title;
            private String type;
            private String tj_type;
            private String f_s_type;
            private String photo;
            private String descr;
            private String jump;

            public void setId(String id) {
                this.id = id;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setTj_type(String tj_type) {
                this.tj_type = tj_type;
            }

            public void setF_s_type(String f_s_type) {
                this.f_s_type = f_s_type;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            public String getId() {
                return id;
            }

            public String getTitle() {
                return title;
            }

            public String getType() {
                return type;
            }

            public String getTj_type() {
                return tj_type;
            }

            public String getF_s_type() {
                return f_s_type;
            }

            public String getPhoto() {
                return photo;
            }

            public String getDescr() {
                return descr;
            }

            public String getJump() {
                return jump;
            }
        }
    }
}
