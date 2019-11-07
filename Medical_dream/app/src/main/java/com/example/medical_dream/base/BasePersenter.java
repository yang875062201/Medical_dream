package com.example.medical_dream.base;

import java.lang.ref.WeakReference;

public class BasePersenter<V> {

    private WeakReference<V> weakReference;
    protected V mView;

    public void  attachView(V v){
        weakReference = new WeakReference<V>(v);
        mView = weakReference.get();
    }
    public  void destoryView(){
        if (weakReference!=null){
            weakReference.clear();
            weakReference=null;
        }
    }
}
