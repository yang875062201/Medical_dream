package com.example.medical_dream.app;

import android.app.Application;

import com.example.medical_dream.utils.SharedPrefrenceUtils;

public class BaseApp extends Application {
    private static BaseApp baseApp;
    public static  String access_token;
    public  static boolean isLogin;


    @Override
    public void onCreate() {
        super.onCreate();
        baseApp=this;
        access_token=SharedPrefrenceUtils.getSharePreStr(baseApp,"access_token");
        isLogin=SharedPrefrenceUtils.getSharePreBoolean(baseApp,"isLogin");
    }
    public static  BaseApp getInstance(){
        return baseApp;
    }
}
