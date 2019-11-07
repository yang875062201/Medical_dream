package com.example.medical_dream.http;

import android.util.Log;

import com.example.medical_dream.http.Constants;


public class Logger {
    public  static  void  log(String tag,String str){
        if (Constants.isDebug){
            Log.d(tag,str);
        }

    }
    public static  void  println(String str){
        if (Constants.isDebug) {
            System.out.println(str);
        }
    }
}
