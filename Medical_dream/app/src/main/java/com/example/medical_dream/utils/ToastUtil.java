package com.example.medical_dream.utils;

import android.widget.Toast;

import com.example.medical_dream.app.BaseApp;

public class ToastUtil {
    public  static  void showShort(String str){
        Toast.makeText(BaseApp.getInstance(),str,Toast.LENGTH_SHORT).show();
    }
    public  static  void showLong(String str){
        Toast.makeText(BaseApp.getInstance(),str,Toast.LENGTH_LONG).show();
    }
}
