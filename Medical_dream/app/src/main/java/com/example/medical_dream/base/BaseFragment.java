package com.example.medical_dream.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public abstract  class BaseFragment<V,P extends BasePersenter<V>> extends  SimpleFragment{

    public P mPersenter;

    @Override
    protected void initPersenter() {
        mPersenter = createPersenter();
        if (mPersenter!=null){
            mPersenter.attachView((V)this);
        }
    }

    protected abstract P createPersenter();

    public static Fragment newInstance(String param1, Class<?> fragmentClass) {
        Fragment fragment = null;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
            Bundle args = new Bundle();
            args.putString("", param1);
            fragment.setArguments(args);
        } catch (java.lang.InstantiationException e) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return fragment;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPersenter!=null){
            mPersenter.destoryView();
            mPersenter=null;
        }
    }


}
