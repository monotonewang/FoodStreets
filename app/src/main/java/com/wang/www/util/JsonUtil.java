package com.wang.www.util;

import com.wang.www.model.RecommendFoodModel;
import com.google.gson.Gson;

/**
 * Created by user on 2016/2/25.
 */
public class JsonUtil {
    public static RecommendFoodModel getRecommendFoodByJson(String json){
        return new Gson().fromJson(json,RecommendFoodModel.class);
    }
}