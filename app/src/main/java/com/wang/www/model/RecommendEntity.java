package com.wang.www.model;

import java.io.Serializable;
import java.util.List;

/**
 * deso: FoodStreets TODO<br/>
 * time: 2016/10/28 10:59 <br/>
 * author: 7 <br/>
 * since: V ${version} <br/>
 */

public class RecommendEntity {

    /**
     * code : 1
     * obj : {"san_can":[{"id":"586695","titlepic":"http://images.meishij.net/p/20161026/6f021430be1d4d14356abde24320e56b.jpg","title":"夹心馒头片","descr":"香港西多士和中式煎馒头结合的黄金产物","click_type":"5","click_obj":"586695","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20121130/a0c82dcfd9ce5d1b8766a5f2d28f18d2_150x150.jpg","fav_num":"1592","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"586695\"}}"},{"id":"1691748","titlepic":"http://images.meishij.net/p/20161026/04d9a240ba5cb61b2810f05df069d7f2.jpg","title":"芝士烤土司","descr":"土司中间挖个坑，变成鸡蛋和芝士的温床","click_type":"5","click_obj":"1691748","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/10/120/30010/a30010_146908726423573.jpg","fav_num":"6804","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1691748\"}}"},{"id":"594311","titlepic":"http://images.meishij.net/p/20161026/5cd94d754db32ff61c9735906f6f35a5.jpg","title":"万剑穿肠面","descr":"绞尽脑汁都想不到原来面条还能这么吃","click_type":"5","click_obj":"594311","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130626/24a3880ed3851cf383b04897664af849_150x150.jpg","fav_num":"2867","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"594311\"}}"},{"id":"1650913","titlepic":"http://images.meishij.net/p/20161026/a28d44387c99b433fcc8295631943b73.jpg","title":"红焖羊棒骨","descr":"少油小火勤搅拌，教你炒糖浆的小窍门","click_type":"5","click_obj":"1650913","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/72/104/4151072/a4151072_144567256084978.jpg","fav_num":"1454","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1650913\"}}"},{"id":"1681073","titlepic":"http://images.meishij.net/p/20161026/ec7d7507da4f83230ed06db7a7de999d.jpg","title":"土豆烧牛肉","descr":"土豆与牛肉的秋日恋歌，缠绵又浓烈","click_type":"5","click_obj":"1681073","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/163/225/2431413/a2431413_146402958358225.jpg","fav_num":"6","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1681073\"}}"},{"id":"1696962","titlepic":"http://images.meishij.net/p/20161026/17dd6d7f2f1db843c9a0bf61e61a97ae.jpg","title":"香炸藕盒","descr":"谁说吃藕丑，越吃越美越香才是正解","click_type":"5","click_obj":"1696962","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/69/207/2801819/a2801819_147116673342960.jpg","fav_num":"6","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1696962\"}}"},{"id":"1642177","titlepic":"http://images.meishij.net/p/20161026/0644d3c25c3beb0ab7b202a89ee45957.jpg","title":"广州肠粉","descr":"广式茶点铺抢手美味，晶莹剔透妙不可言","click_type":"5","click_obj":"1642177","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/151/186/1421651/a1421651_143829545889556.jpg","fav_num":"1201","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1642177\"}}"},{"id":"1640398","titlepic":"http://images.meishij.net/p/20161026/782146a2e1a86a01f136a0037cbc7f33.jpg","title":"湖南糖油粑粑","descr":"来自长沙的传统名吃，三个下肚能量恢复","click_type":"5","click_obj":"1640398","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/41/143/2723291/a2723291_143728550018304.jpg","fav_num":"12222","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1640398\"}}"},{"id":"1636835","titlepic":"http://images.meishij.net/p/20161026/bbe8ff924f6e7030dcfa189373f305b7.jpg","title":"咖喱鱼蛋","descr":"闽粤地区超人气小吃，香浓Q弹百吃不厌","click_type":"5","click_obj":"1636835","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/184/124/2468684/a2468684_143462129905900.jpg","fav_num":"490","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1636835\"}}"},{"id":"1654099","titlepic":"http://images.meishij.net/p/20161026/cef32316be0318513d0553bc479b8174.jpg","title":"鱼香肉丝","descr":"下饭菜中佼佼者，不用鱼也能做出鱼肉香","click_type":"5","click_obj":"1654099","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/49/144/4036049/a4036049_144729940485500.jpg","fav_num":"10503","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1654099\"}}"},{"id":"1797828","titlepic":"http://images.meishij.net/p/20161027/8397b6d219d292599b25552af795ecfe.jpg","title":"干锅鸡翅虾","descr":"荤素搭配一锅出，香辣滋味让你过足瘾","click_type":"5","click_obj":"1797828","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/115/102/588115/a588115_147746098699201.jpg","fav_num":"1626","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1797828\"}}"},{"id":"592373","titlepic":"http://images.meishij.net/p/20161026/2da57f002c957014d759724531cbb450.jpg","title":"家乡豆腐","descr":"一道麻辣鲜香的下饭豆腐，勾起家乡思念","click_type":"5","click_obj":"592373","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130506/27b91a5a3a337e4255edb84e4fb54bb0_150x150.jpg","fav_num":"41274","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"592373\"}}"},{"id":"594363","titlepic":"http://images.meishij.net/p/20161026/bb7d173b1497a72029f1de04c4d4beda.jpg","title":"孜然牙签鸡肉串","descr":"一口一个真方便，吃完还能用牙签剔剔牙","click_type":"5","click_obj":"594363","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130627/8ad3bea5f57ccb35e7aaa6bf9d5d9192_150x150.jpg","fav_num":"37246","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"594363\"}}"},{"id":"209282","titlepic":"http://images.meishij.net/p/20161026/91a99a6e3aabf94eb77dce62d64dd862.jpg","title":"台湾大肠包小肠","descr":"台湾十大知名小吃之一，这样做才正宗","click_type":"5","click_obj":"209282","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20111118/7f24fce800a51d60302009bd7ca5923d_150x150.jpg","fav_num":"21217","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"209282\"}}"},{"id":"615507","titlepic":"http://images.meishij.net/p/20161026/c4738bb0e9500e392eaf0215b5528973.jpg","title":"香辣烤薯角","descr":"简单快捷的馋嘴小零食，专为懒人设计","click_type":"5","click_obj":"615507","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20141118/e2af3ad14a6f91498ef0f6a81957b45a_150x150.jpg","fav_num":"9774","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"615507\"}}"}],"san_can_titles":[{"title":"早餐","sub_title":"今天的早餐脑洞有点大哦","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_1.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"午餐","sub_title":"在这些美味面前减肥只有靠边站了","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_2.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"下午茶","sub_title":"午后让嘴巴飞去南方度个假","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_3.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"晚餐","sub_title":"汁浓味美香气扑鼻下饭菜","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_4.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"夜宵","sub_title":"用美食赶走一周的辛苦","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_5.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""}],"fenlei":[{"title":"菜谱分类","image":"http://static.meishij.net/wap6/images/v6/quanbu.png","click_type":"24","click_obj":"全部菜谱","jump":"{\"type\":\"24\",\"class_name\":\"MSCategoryController\",\"property\":{}}"},{"title":"视频菜谱","image":"http://static.meishij.net/wap6/images/v6/shipincaipu.png","click_type":"1","click_obj":"20001","jump":"{\"type\":\"1\",\"class_name\":\"MSRecipeListController\",\"property\":{\"categoryName\":\"\",\"cTitle\":\"\\u89c6\\u9891\\u83dc\\u8c31\",\"listID\":\"20001\",\"listSt\":\"\",\"listType\":5,\"listFrom\":0}}"},{"title":"早餐","image":"http://static.meishij.net/wap6/images/v6/kuaishoucai.png","click_type":"102","click_obj":"早餐","jump":"{\"type\":\"102\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u65e9\\u9910\",\"listID\":\"zao\",\"listSt\":\"\\u65e9\\u9910\",\"listType\":3}}"},{"title":"附近","image":"http://static.meishij.net/wap6/images/v6/fujin.png","click_type":"25","click_obj":"附近","jump":"{\"type\":\"25\",\"class_name\":\"MSNearyByMapController\",\"property\":{}}"}],"func1":{"title":"最受欢迎","image":"http://static.meishij.net/wap6/images/v6/paihangbang.png"},"func2":{"title":"食材组菜","image":"http://static.meishij.net/wap6/images/v6/zhinengzucai.png"},"top3":[{"photo":"http://site.meishij.net/adm/additive/2016-10-28/5812aa3cccec3.jpg","click_type":4,"click_obj":"五谷-推荐;http://i.meishi.cc/g/transit.php?ename=1948&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1948&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-26/5810890c05e29.jpg","click_type":4,"click_obj":"锅具-推荐;http://i.meishi.cc/g/transit.php?ename=1940&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1940&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-20/58089f437a4c7.jpg","click_type":4,"click_obj":"潘苹果-推荐;http://i.meishi.cc/g/transit.php?ename=1920&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1920&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-27/5811a583a844b.png","click_type":4,"click_obj":"七周年  1025 编辑部 最热商品下方轮播横幅;http://i.meishi.cc/g/transit.php?ename=1934&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1934&from=mobile_mobile\",\"goodsSource\":\"\"}}"}],"top4":[{"photo":"http://site.meishij.net/adm/additive/2016-10-19/580749abd6771.jpg","click_type":4,"click_obj":"1019 广告部  今日推荐下方轮播横幅;http://i.meishi.cc/g/transit.php?ename=1919&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1919&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-25/580f0f0726089.jpg","click_type":4,"click_obj":"1025 广告部 美的AH煲  今日推荐 ;http://i.meishi.cc/g/transit.php?ename=1938&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1938&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-24/580dd90e8f8f2.jpg","click_type":4,"click_obj":"1021 编辑部 油温 今日推荐;http://i.meishi.cc/g/transit.php?ename=1933&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1933&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg","click_type":"5","click_obj":"1639954","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1639954\",\"goodsSource\":\"\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_banchengpin.jpg","click_type":"5","click_obj":"1636964","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1636964\",\"goodsSource\":\"\"}}"}],"shops":[{"id":"7067","title":"能当乒乓球的手打牛肉丸","price":"56.9","guige":"2包","image":"http://site.meishij.net/shop/uploadfile/20161012/20161012180559.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"7067\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"},{"id":"1525","title":"高活性酵母让馒头更松软","price":"9.9","guige":"10g*10","image":"http://site.meishij.net/shop/uploadfile/20161024/20161024141629.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1525\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"},{"id":"1090","title":"炒菜只用几滴油","price":"148","guige":"1件","image":"http://site.meishij.net/shop/uploadfile/20161014/20161014113133.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1090\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"},{"id":"5241","title":"传承几代人的腊肠手艺","price":"39.9","guige":"1袋","image":"http://site.meishij.net/shop/uploadfile/20161008/20161008123830.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"5241\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"}],"zt":[{"id":"0","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=293","photo":"http://images.meishij.net/p/20161027/64cb21b941d7b3802cdb261a57ebc502.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=293\",\"goodsSource\":\"\"}}"},{"id":"0","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=291","photo":"http://images.meishij.net/p/20161026/ad86d75393b4269c4b64bbda1ed12527.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=291\",\"goodsSource\":\"\"}}"},{"id":"31","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/caidan_zt.php?id=31","photo":"http://images.meishij.net/p/20161025/3b05ef30e3ff33c7e0a8ab5f1a996325.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/caidan_zt.php?id=31\",\"goodsSource\":\"\"}}"},{"id":"0","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=285","photo":"http://images.meishij.net/p/20161024/183a03af619149c44c4d843603820102.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=285\",\"goodsSource\":\"\"}}"}],"customized":{"title":"猜你喜欢","time":"10:58为您更新","total":4,"data":[]},"browser":{"refer":"http://www.meishij.net/chufang/diy/recaipu/58971.html","agent":"Mozilla/5.0 (Windows NT 6.1) .NET CLRMSN AppleWebKit/617.40 (KHTML, like Gecko) Maxthon/9.2.1.5051 Chrome/30.0.1394.101 Safari/272.80","url":"http://www.meishij.net/zuofa/hongzaoyinertang_7.html"}}
     */

    private String code;
    /**
     * san_can : [{"id":"586695","titlepic":"http://images.meishij.net/p/20161026/6f021430be1d4d14356abde24320e56b.jpg","title":"夹心馒头片","descr":"香港西多士和中式煎馒头结合的黄金产物","click_type":"5","click_obj":"586695","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20121130/a0c82dcfd9ce5d1b8766a5f2d28f18d2_150x150.jpg","fav_num":"1592","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"586695\"}}"},{"id":"1691748","titlepic":"http://images.meishij.net/p/20161026/04d9a240ba5cb61b2810f05df069d7f2.jpg","title":"芝士烤土司","descr":"土司中间挖个坑，变成鸡蛋和芝士的温床","click_type":"5","click_obj":"1691748","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/10/120/30010/a30010_146908726423573.jpg","fav_num":"6804","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1691748\"}}"},{"id":"594311","titlepic":"http://images.meishij.net/p/20161026/5cd94d754db32ff61c9735906f6f35a5.jpg","title":"万剑穿肠面","descr":"绞尽脑汁都想不到原来面条还能这么吃","click_type":"5","click_obj":"594311","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130626/24a3880ed3851cf383b04897664af849_150x150.jpg","fav_num":"2867","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"594311\"}}"},{"id":"1650913","titlepic":"http://images.meishij.net/p/20161026/a28d44387c99b433fcc8295631943b73.jpg","title":"红焖羊棒骨","descr":"少油小火勤搅拌，教你炒糖浆的小窍门","click_type":"5","click_obj":"1650913","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/72/104/4151072/a4151072_144567256084978.jpg","fav_num":"1454","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1650913\"}}"},{"id":"1681073","titlepic":"http://images.meishij.net/p/20161026/ec7d7507da4f83230ed06db7a7de999d.jpg","title":"土豆烧牛肉","descr":"土豆与牛肉的秋日恋歌，缠绵又浓烈","click_type":"5","click_obj":"1681073","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/163/225/2431413/a2431413_146402958358225.jpg","fav_num":"6","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1681073\"}}"},{"id":"1696962","titlepic":"http://images.meishij.net/p/20161026/17dd6d7f2f1db843c9a0bf61e61a97ae.jpg","title":"香炸藕盒","descr":"谁说吃藕丑，越吃越美越香才是正解","click_type":"5","click_obj":"1696962","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/69/207/2801819/a2801819_147116673342960.jpg","fav_num":"6","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1696962\"}}"},{"id":"1642177","titlepic":"http://images.meishij.net/p/20161026/0644d3c25c3beb0ab7b202a89ee45957.jpg","title":"广州肠粉","descr":"广式茶点铺抢手美味，晶莹剔透妙不可言","click_type":"5","click_obj":"1642177","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/151/186/1421651/a1421651_143829545889556.jpg","fav_num":"1201","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1642177\"}}"},{"id":"1640398","titlepic":"http://images.meishij.net/p/20161026/782146a2e1a86a01f136a0037cbc7f33.jpg","title":"湖南糖油粑粑","descr":"来自长沙的传统名吃，三个下肚能量恢复","click_type":"5","click_obj":"1640398","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/41/143/2723291/a2723291_143728550018304.jpg","fav_num":"12222","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1640398\"}}"},{"id":"1636835","titlepic":"http://images.meishij.net/p/20161026/bbe8ff924f6e7030dcfa189373f305b7.jpg","title":"咖喱鱼蛋","descr":"闽粤地区超人气小吃，香浓Q弹百吃不厌","click_type":"5","click_obj":"1636835","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/184/124/2468684/a2468684_143462129905900.jpg","fav_num":"490","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1636835\"}}"},{"id":"1654099","titlepic":"http://images.meishij.net/p/20161026/cef32316be0318513d0553bc479b8174.jpg","title":"鱼香肉丝","descr":"下饭菜中佼佼者，不用鱼也能做出鱼肉香","click_type":"5","click_obj":"1654099","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/49/144/4036049/a4036049_144729940485500.jpg","fav_num":"10503","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1654099\"}}"},{"id":"1797828","titlepic":"http://images.meishij.net/p/20161027/8397b6d219d292599b25552af795ecfe.jpg","title":"干锅鸡翅虾","descr":"荤素搭配一锅出，香辣滋味让你过足瘾","click_type":"5","click_obj":"1797828","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://site.meishij.net/r/115/102/588115/a588115_147746098699201.jpg","fav_num":"1626","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"1797828\"}}"},{"id":"592373","titlepic":"http://images.meishij.net/p/20161026/2da57f002c957014d759724531cbb450.jpg","title":"家乡豆腐","descr":"一道麻辣鲜香的下饭豆腐，勾起家乡思念","click_type":"5","click_obj":"592373","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130506/27b91a5a3a337e4255edb84e4fb54bb0_150x150.jpg","fav_num":"41274","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"592373\"}}"},{"id":"594363","titlepic":"http://images.meishij.net/p/20161026/bb7d173b1497a72029f1de04c4d4beda.jpg","title":"孜然牙签鸡肉串","descr":"一口一个真方便，吃完还能用牙签剔剔牙","click_type":"5","click_obj":"594363","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20130627/8ad3bea5f57ccb35e7aaa6bf9d5d9192_150x150.jpg","fav_num":"37246","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"594363\"}}"},{"id":"209282","titlepic":"http://images.meishij.net/p/20161026/91a99a6e3aabf94eb77dce62d64dd862.jpg","title":"台湾大肠包小肠","descr":"台湾十大知名小吃之一，这样做才正宗","click_type":"5","click_obj":"209282","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20111118/7f24fce800a51d60302009bd7ca5923d_150x150.jpg","fav_num":"21217","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"209282\"}}"},{"id":"615507","titlepic":"http://images.meishij.net/p/20161026/c4738bb0e9500e392eaf0215b5528973.jpg","title":"香辣烤薯角","descr":"简单快捷的馋嘴小零食，专为懒人设计","click_type":"5","click_obj":"615507","pv_trackingURL":"","click_trackingURL":"","sft":"0","is_recipe":"1","is_tj":"1","tj_img":"http://images.meishij.net/p/20141118/e2af3ad14a6f91498ef0f6a81957b45a_150x150.jpg","fav_num":"9774","jump":"{\"type\":\"5\",\"class_name\":\"MSRecipeDetailController\",\"property\":{\"recipeId\":\"615507\"}}"}]
     * san_can_titles : [{"title":"早餐","sub_title":"今天的早餐脑洞有点大哦","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_1.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"午餐","sub_title":"在这些美味面前减肥只有靠边站了","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_2.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"下午茶","sub_title":"午后让嘴巴飞去南方度个假","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_3.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"晚餐","sub_title":"汁浓味美香气扑鼻下饭菜","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_4.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""},{"title":"夜宵","sub_title":"用美食赶走一周的辛苦","titlepic":"http://i5.meishij.net/app/mobile/guyu_icon_5.png","click_type":"0","click_obj":"","pv_trackingURL":"","click_trackingURL":""}]
     * fenlei : [{"title":"菜谱分类","image":"http://static.meishij.net/wap6/images/v6/quanbu.png","click_type":"24","click_obj":"全部菜谱","jump":"{\"type\":\"24\",\"class_name\":\"MSCategoryController\",\"property\":{}}"},{"title":"视频菜谱","image":"http://static.meishij.net/wap6/images/v6/shipincaipu.png","click_type":"1","click_obj":"20001","jump":"{\"type\":\"1\",\"class_name\":\"MSRecipeListController\",\"property\":{\"categoryName\":\"\",\"cTitle\":\"\\u89c6\\u9891\\u83dc\\u8c31\",\"listID\":\"20001\",\"listSt\":\"\",\"listType\":5,\"listFrom\":0}}"},{"title":"早餐","image":"http://static.meishij.net/wap6/images/v6/kuaishoucai.png","click_type":"102","click_obj":"早餐","jump":"{\"type\":\"102\",\"class_name\":\"MSRecipeListController\",\"property\":{\"cTitle\":\"\\u65e9\\u9910\",\"listID\":\"zao\",\"listSt\":\"\\u65e9\\u9910\",\"listType\":3}}"},{"title":"附近","image":"http://static.meishij.net/wap6/images/v6/fujin.png","click_type":"25","click_obj":"附近","jump":"{\"type\":\"25\",\"class_name\":\"MSNearyByMapController\",\"property\":{}}"}]
     * func1 : {"title":"最受欢迎","image":"http://static.meishij.net/wap6/images/v6/paihangbang.png"}
     * func2 : {"title":"食材组菜","image":"http://static.meishij.net/wap6/images/v6/zhinengzucai.png"}
     * top3 : [{"photo":"http://site.meishij.net/adm/additive/2016-10-28/5812aa3cccec3.jpg","click_type":4,"click_obj":"五谷-推荐;http://i.meishi.cc/g/transit.php?ename=1948&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1948&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-26/5810890c05e29.jpg","click_type":4,"click_obj":"锅具-推荐;http://i.meishi.cc/g/transit.php?ename=1940&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1940&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-20/58089f437a4c7.jpg","click_type":4,"click_obj":"潘苹果-推荐;http://i.meishi.cc/g/transit.php?ename=1920&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1920&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-27/5811a583a844b.png","click_type":4,"click_obj":"七周年  1025 编辑部 最热商品下方轮播横幅;http://i.meishi.cc/g/transit.php?ename=1934&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1934&from=mobile_mobile\",\"goodsSource\":\"\"}}"}]
     * top4 : [{"photo":"http://site.meishij.net/adm/additive/2016-10-19/580749abd6771.jpg","click_type":4,"click_obj":"1019 广告部  今日推荐下方轮播横幅;http://i.meishi.cc/g/transit.php?ename=1919&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1919&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-25/580f0f0726089.jpg","click_type":4,"click_obj":"1025 广告部 美的AH煲  今日推荐 ;http://i.meishi.cc/g/transit.php?ename=1938&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1938&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://site.meishij.net/adm/additive/2016-10-24/580dd90e8f8f2.jpg","click_type":4,"click_obj":"1021 编辑部 油温 今日推荐;http://i.meishi.cc/g/transit.php?ename=1933&from=mobile_mobile","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"4\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/i.meishi.cc\\/g\\/transit.php?ename=1933&from=mobile_mobile\",\"goodsSource\":\"\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_baikuanmifan.jpg","click_type":"5","click_obj":"1639954","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1639954\",\"goodsSource\":\"\"}}"},{"photo":"http://static.meishij.net/images/get3/adscroll/adscroll_banchengpin.jpg","click_type":"5","click_obj":"1636964","pv_trackingURL":"","click_trackingURL":"","is_recipe":"0","sft":"0","jump":"{\"type\":\"51\",\"class_name\":\"MSArticleDetailController\",\"property\":{\"recipeId\":\"1636964\",\"goodsSource\":\"\"}}"}]
     * shops : [{"id":"7067","title":"能当乒乓球的手打牛肉丸","price":"56.9","guige":"2包","image":"http://site.meishij.net/shop/uploadfile/20161012/20161012180559.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"7067\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"},{"id":"1525","title":"高活性酵母让馒头更松软","price":"9.9","guige":"10g*10","image":"http://site.meishij.net/shop/uploadfile/20161024/20161024141629.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1525\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"},{"id":"1090","title":"炒菜只用几滴油","price":"148","guige":"1件","image":"http://site.meishij.net/shop/uploadfile/20161014/20161014113133.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"1090\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"},{"id":"5241","title":"传承几代人的腊肠手艺","price":"39.9","guige":"1袋","image":"http://site.meishij.net/shop/uploadfile/20161008/20161008123830.jpg","jump":"{\"type\":\"10\",\"class_name\":\"MSBuyGoodsDetailController\",\"property\":{\"goodsID\":\"5241\",\"sourceContent\":\"index\",\"goodsSource\":\"\"}}"}]
     * zt : [{"id":"0","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=293","photo":"http://images.meishij.net/p/20161027/64cb21b941d7b3802cdb261a57ebc502.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=293\",\"goodsSource\":\"\"}}"},{"id":"0","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=291","photo":"http://images.meishij.net/p/20161026/ad86d75393b4269c4b64bbda1ed12527.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=291\",\"goodsSource\":\"\"}}"},{"id":"31","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/caidan_zt.php?id=31","photo":"http://images.meishij.net/p/20161025/3b05ef30e3ff33c7e0a8ab5f1a996325.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/caidan_zt.php?id=31\",\"goodsSource\":\"\"}}"},{"id":"0","title":"","type":"1","tj_type":"0","f_s_type":"http://m.meishij.net/huodong/zt.php?zt_id=285","photo":"http://images.meishij.net/p/20161024/183a03af619149c44c4d843603820102.jpg","descr":"","jump":"{\"type\":\"103\",\"class_name\":\"MSJWebAdvViewController\",\"property\":{\"urlString\":\"http:\\/\\/m.meishij.net\\/huodong\\/zt.php?zt_id=285\",\"goodsSource\":\"\"}}"}]
     * customized : {"title":"猜你喜欢","time":"10:58为您更新","total":4,"data":[]}
     * browser : {"refer":"http://www.meishij.net/chufang/diy/recaipu/58971.html","agent":"Mozilla/5.0 (Windows NT 6.1) .NET CLRMSN AppleWebKit/617.40 (KHTML, like Gecko) Maxthon/9.2.1.5051 Chrome/30.0.1394.101 Safari/272.80","url":"http://www.meishij.net/zuofa/hongzaoyinertang_7.html"}
     */

    private ObjBean obj;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ObjBean getObj() {
        return obj;
    }

    public void setObj(ObjBean obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "RecommendEntity{" +
                "code='" + code + '\'' +
                ", obj=" + obj +
                '}';
    }

    public static class ObjBean {
        /**
         * title : 最受欢迎
         * image : http://static.meishij.net/wap6/images/v6/paihangbang.png
         */

        private Func1Bean func1;
        /**
         * title : 食材组菜
         * image : http://static.meishij.net/wap6/images/v6/zhinengzucai.png
         */

        private Func2Bean func2;
        /**
         * title : 猜你喜欢
         * time : 10:58为您更新
         * total : 4
         * data : []
         */

        private CustomizedBean customized;
        /**
         * refer : http://www.meishij.net/chufang/diy/recaipu/58971.html
         * agent : Mozilla/5.0 (Windows NT 6.1) .NET CLRMSN AppleWebKit/617.40 (KHTML, like Gecko) Maxthon/9.2.1.5051 Chrome/30.0.1394.101 Safari/272.80
         * url : http://www.meishij.net/zuofa/hongzaoyinertang_7.html
         */

        private BrowserBean browser;
        /**
         * id : 586695
         * titlepic : http://images.meishij.net/p/20161026/6f021430be1d4d14356abde24320e56b.jpg
         * title : 夹心馒头片
         * descr : 香港西多士和中式煎馒头结合的黄金产物
         * click_type : 5
         * click_obj : 586695
         * pv_trackingURL :
         * click_trackingURL :
         * sft : 0
         * is_recipe : 1
         * is_tj : 1
         * tj_img : http://images.meishij.net/p/20121130/a0c82dcfd9ce5d1b8766a5f2d28f18d2_150x150.jpg
         * fav_num : 1592
         * jump : {"type":"5","class_name":"MSRecipeDetailController","property":{"recipeId":"586695"}}
         */

        private List<SanCanBean> san_can;
        /**
         * title : 早餐
         * sub_title : 今天的早餐脑洞有点大哦
         * titlepic : http://i5.meishij.net/app/mobile/guyu_icon_1.png
         * click_type : 0
         * click_obj :
         * pv_trackingURL :
         * click_trackingURL :
         */

        private List<SanCanTitlesBean> san_can_titles;
        /**
         * title : 菜谱分类
         * image : http://static.meishij.net/wap6/images/v6/quanbu.png
         * click_type : 24
         * click_obj : 全部菜谱
         * jump : {"type":"24","class_name":"MSCategoryController","property":{}}
         */

        private List<FenleiBean> fenlei;
        /**
         * photo : http://site.meishij.net/adm/additive/2016-10-28/5812aa3cccec3.jpg
         * click_type : 4
         * click_obj : 五谷-推荐;http://i.meishi.cc/g/transit.php?ename=1948&from=mobile_mobile
         * pv_trackingURL :
         * click_trackingURL :
         * is_recipe : 0
         * sft : 0
         * jump : {"type":"4","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/i.meishi.cc\/g\/transit.php?ename=1948&from=mobile_mobile","goodsSource":""}}
         */

        private List<Top3Bean> top3;
        /**
         * photo : http://site.meishij.net/adm/additive/2016-10-19/580749abd6771.jpg
         * click_type : 4
         * click_obj : 1019 广告部  今日推荐下方轮播横幅;http://i.meishi.cc/g/transit.php?ename=1919&from=mobile_mobile
         * pv_trackingURL :
         * click_trackingURL :
         * is_recipe : 0
         * sft : 0
         * jump : {"type":"4","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/i.meishi.cc\/g\/transit.php?ename=1919&from=mobile_mobile","goodsSource":""}}
         */

        private List<Top4Bean> top4;
        /**
         * id : 7067
         * title : 能当乒乓球的手打牛肉丸
         * price : 56.9
         * guige : 2包
         * image : http://site.meishij.net/shop/uploadfile/20161012/20161012180559.jpg
         * jump : {"type":"10","class_name":"MSBuyGoodsDetailController","property":{"goodsID":"7067","sourceContent":"index","goodsSource":""}}
         */

        private List<ShopsBean> shops;
        /**
         * id : 0
         * title :
         * type : 1
         * tj_type : 0
         * f_s_type : http://m.meishij.net/huodong/zt.php?zt_id=293
         * photo : http://images.meishij.net/p/20161027/64cb21b941d7b3802cdb261a57ebc502.jpg
         * descr :
         * jump : {"type":"103","class_name":"MSJWebAdvViewController","property":{"urlString":"http:\/\/m.meishij.net\/huodong\/zt.php?zt_id=293","goodsSource":""}}
         */

        private List<ZtBean> zt;

        @Override
        public String toString() {
            return "ObjBean{" +
                    "func1=" + func1 +
                    ", func2=" + func2 +
                    ", customized=" + customized +
                    ", browser=" + browser +
                    ", san_can=" + san_can +
                    ", san_can_titles=" + san_can_titles +
                    ", fenlei=" + fenlei +
                    ", top3=" + top3 +
                    ", top4=" + top4 +
                    ", shops=" + shops +
                    ", zt=" + zt +
                    '}';
        }

        public Func1Bean getFunc1() {
            return func1;
        }

        public void setFunc1(Func1Bean func1) {
            this.func1 = func1;
        }

        public Func2Bean getFunc2() {
            return func2;
        }

        public void setFunc2(Func2Bean func2) {
            this.func2 = func2;
        }

        public CustomizedBean getCustomized() {
            return customized;
        }

        public void setCustomized(CustomizedBean customized) {
            this.customized = customized;
        }

        public BrowserBean getBrowser() {
            return browser;
        }

        public void setBrowser(BrowserBean browser) {
            this.browser = browser;
        }

        public List<SanCanBean> getSan_can() {
            return san_can;
        }

        public void setSan_can(List<SanCanBean> san_can) {
            this.san_can = san_can;
        }

        public List<SanCanTitlesBean> getSan_can_titles() {
            return san_can_titles;
        }

        public void setSan_can_titles(List<SanCanTitlesBean> san_can_titles) {
            this.san_can_titles = san_can_titles;
        }

        public List<FenleiBean> getFenlei() {
            return fenlei;
        }

        public void setFenlei(List<FenleiBean> fenlei) {
            this.fenlei = fenlei;
        }

        public List<Top3Bean> getTop3() {
            return top3;
        }

        public void setTop3(List<Top3Bean> top3) {
            this.top3 = top3;
        }

        public List<Top4Bean> getTop4() {
            return top4;
        }

        public void setTop4(List<Top4Bean> top4) {
            this.top4 = top4;
        }

        public List<ShopsBean> getShops() {
            return shops;
        }

        public void setShops(List<ShopsBean> shops) {
            this.shops = shops;
        }

        public List<ZtBean> getZt() {
            return zt;
        }

        public void setZt(List<ZtBean> zt) {
            this.zt = zt;
        }

        public static class Func1Bean {
            private String title;
            private String image;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            @Override
            public String toString() {
                return "Func1Bean{" +
                        "title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        '}';
            }
        }

        public static class Func2Bean {
            private String title;
            private String image;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            @Override
            public String toString() {
                return "Func2Bean{" +
                        "title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        '}';
            }
        }

        public static class CustomizedBean {
            private String title;
            private String time;
            private int total;
            private List<?> data;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<?> getData() {
                return data;
            }

            public void setData(List<?> data) {
                this.data = data;
            }

            @Override
            public String toString() {
                return "CustomizedBean{" +
                        "title='" + title + '\'' +
                        ", time='" + time + '\'' +
                        ", total=" + total +
                        ", data=" + data +
                        '}';
            }
        }

        public static class BrowserBean {
            private String refer;
            private String agent;
            private String url;

            public String getRefer() {
                return refer;
            }

            public void setRefer(String refer) {
                this.refer = refer;
            }

            public String getAgent() {
                return agent;
            }

            public void setAgent(String agent) {
                this.agent = agent;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            @Override
            public String toString() {
                return "BrowserBean{" +
                        "refer='" + refer + '\'' +
                        ", agent='" + agent + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }
        }

        public static class SanCanBean implements Serializable{
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

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitlepic() {
                return titlepic;
            }

            public void setTitlepic(String titlepic) {
                this.titlepic = titlepic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescr() {
                return descr;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public String getClick_type() {
                return click_type;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public String getSft() {
                return sft;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public String getIs_tj() {
                return is_tj;
            }

            public void setIs_tj(String is_tj) {
                this.is_tj = is_tj;
            }

            public String getTj_img() {
                return tj_img;
            }

            public void setTj_img(String tj_img) {
                this.tj_img = tj_img;
            }

            public String getFav_num() {
                return fav_num;
            }

            public void setFav_num(String fav_num) {
                this.fav_num = fav_num;
            }

            public String getJump() {
                return jump;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            @Override
            public String toString() {
                return "SanCanBean{" +
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
        }

        public static class SanCanTitlesBean {
            private String title;
            private String sub_title;
            private String titlepic;
            private String click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSub_title() {
                return sub_title;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }

            public String getTitlepic() {
                return titlepic;
            }

            public void setTitlepic(String titlepic) {
                this.titlepic = titlepic;
            }

            public String getClick_type() {
                return click_type;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            @Override
            public String toString() {
                return "SanCanTitlesBean{" +
                        "title='" + title + '\'' +
                        ", sub_title='" + sub_title + '\'' +
                        ", titlepic='" + titlepic + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        '}';
            }
        }

        public static class FenleiBean {
            private String title;
            private String image;
            private String click_type;
            private String click_obj;
            private String jump;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getClick_type() {
                return click_type;
            }

            public void setClick_type(String click_type) {
                this.click_type = click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public String getJump() {
                return jump;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            @Override
            public String toString() {
                return "FenleiBean{" +
                        "title='" + title + '\'' +
                        ", image='" + image + '\'' +
                        ", click_type='" + click_type + '\'' +
                        ", click_obj='" + click_obj + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }
        }

        public static class Top3Bean {
            private String photo;
            private int click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String is_recipe;
            private String sft;
            private String jump;

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public int getClick_type() {
                return click_type;
            }

            public void setClick_type(int click_type) {
                this.click_type = click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public String getSft() {
                return sft;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public String getJump() {
                return jump;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            @Override
            public String toString() {
                return "Top3Bean{" +
                        "photo='" + photo + '\'' +
                        ", click_type=" + click_type +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        ", is_recipe='" + is_recipe + '\'' +
                        ", sft='" + sft + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }
        }

        public static class Top4Bean {
            private String photo;
            private int click_type;
            private String click_obj;
            private String pv_trackingURL;
            private String click_trackingURL;
            private String is_recipe;
            private String sft;
            private String jump;

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public int getClick_type() {
                return click_type;
            }

            public void setClick_type(int click_type) {
                this.click_type = click_type;
            }

            public String getClick_obj() {
                return click_obj;
            }

            public void setClick_obj(String click_obj) {
                this.click_obj = click_obj;
            }

            public String getPv_trackingURL() {
                return pv_trackingURL;
            }

            public void setPv_trackingURL(String pv_trackingURL) {
                this.pv_trackingURL = pv_trackingURL;
            }

            public String getClick_trackingURL() {
                return click_trackingURL;
            }

            public void setClick_trackingURL(String click_trackingURL) {
                this.click_trackingURL = click_trackingURL;
            }

            public String getIs_recipe() {
                return is_recipe;
            }

            public void setIs_recipe(String is_recipe) {
                this.is_recipe = is_recipe;
            }

            public String getSft() {
                return sft;
            }

            public void setSft(String sft) {
                this.sft = sft;
            }

            public String getJump() {
                return jump;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            @Override
            public String toString() {
                return "Top4Bean{" +
                        "photo='" + photo + '\'' +
                        ", click_type=" + click_type +
                        ", click_obj='" + click_obj + '\'' +
                        ", pv_trackingURL='" + pv_trackingURL + '\'' +
                        ", click_trackingURL='" + click_trackingURL + '\'' +
                        ", is_recipe='" + is_recipe + '\'' +
                        ", sft='" + sft + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }
        }

        public static class ShopsBean {
            private String id;
            private String title;
            private String price;
            private String guige;
            private String image;
            private String jump;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getGuige() {
                return guige;
            }

            public void setGuige(String guige) {
                this.guige = guige;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getJump() {
                return jump;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            @Override
            public String toString() {
                return "ShopsBean{" +
                        "id='" + id + '\'' +
                        ", title='" + title + '\'' +
                        ", price='" + price + '\'' +
                        ", guige='" + guige + '\'' +
                        ", image='" + image + '\'' +
                        ", jump='" + jump + '\'' +
                        '}';
            }
        }

        public static class ZtBean {
            private String id;
            private String title;
            private String type;
            private String tj_type;
            private String f_s_type;
            private String photo;
            private String descr;
            private String jump;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTj_type() {
                return tj_type;
            }

            public void setTj_type(String tj_type) {
                this.tj_type = tj_type;
            }

            public String getF_s_type() {
                return f_s_type;
            }

            public void setF_s_type(String f_s_type) {
                this.f_s_type = f_s_type;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }

            public String getDescr() {
                return descr;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public String getJump() {
                return jump;
            }

            public void setJump(String jump) {
                this.jump = jump;
            }

            @Override
            public String toString() {
                return "ZtBean{" +
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
        }
    }
}
