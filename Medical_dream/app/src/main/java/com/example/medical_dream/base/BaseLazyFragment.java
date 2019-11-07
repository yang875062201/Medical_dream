package com.example.medical_dream.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.medical_dream.base.BaseFragment;

public abstract  class BaseLazyFragment<V,P extends BasePersenter<V>> extends BaseFragment {
    private boolean isPrepared;

    private boolean isLazyed;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isPrepared=true;
        lazyLoad();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        lazyLoad();
    }

    public void lazyLoad(){
        if (getUserVisibleHint()&&isPrepared&&!isLazyed){
            isLazyed=true;
            onLazyLoad();
        }
    }

    protected abstract void onLazyLoad();
}
