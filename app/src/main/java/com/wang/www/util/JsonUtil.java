package com.wang.www.util;

import com.google.gson.Gson;
import com.wang.www.model.RecommendEntity;

/**
 * Created by user on 2016/2/25.
 */
public class JsonUtil {
    public static RecommendEntity getRecommendFoodByJson(String json) {
        return new Gson().fromJson(json, RecommendEntity.class);
    }
}
