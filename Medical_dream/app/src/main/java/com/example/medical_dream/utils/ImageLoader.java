package com.example.medical_dream.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public abstract class ImageLoader {
    //加载网络图片
    public  static  void  setImage(Context context, String url,int placeResId, ImageView iv){
        //站位图
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(placeResId)
                ;
        Glide.with(context).load(url).apply(requestOptions).into(iv);
    }
    //加载本地资源图片
    public  static  void  setImage(Context context, int resId,int placeResId, ImageView iv){
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(placeResId)
                ;
        Glide.with(context).load(resId).apply(requestOptions).into(iv);
    }

    public abstract void displayImage(Context context, Object path, ImageView imageView);
}
