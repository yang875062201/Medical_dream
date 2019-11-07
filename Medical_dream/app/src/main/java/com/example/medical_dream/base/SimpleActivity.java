package com.example.medical_dream.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public  abstract  class SimpleActivity  extends AppCompatActivity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createLayout());
        unbinder = ButterKnife.bind(this);
        initView();
        initPersenter();
        initData();
    }
    protected abstract int createLayout();
    protected abstract void initData();

    public void initPersenter() {}

    protected abstract void initView();



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder!=null){
            unbinder.unbind();
        }
    }
}
