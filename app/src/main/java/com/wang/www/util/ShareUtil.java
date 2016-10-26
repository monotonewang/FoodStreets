package com.wang.www.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user on 2016/2/25.
 */
public class ShareUtil {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    //初始化共享参数
    public static void initShared(Context context) {
        String fileName = "FoodStreetConfig";
        sharedPreferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    //保存String
    public static void putString(String key, String value) {
        editor.putString(key, value);
        editor.apply();
    }

    //获取String
    public static String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    //保存Int
    public static void putInt(String key, int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    //获取Int
    public static int getInt(String key) {
        return sharedPreferences.getInt(key, -1);
    }

    //写入boolean类型的值
    public static void putWelcomeBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    //获取boolean类型的值
    public static boolean getWelocomeBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }
}
