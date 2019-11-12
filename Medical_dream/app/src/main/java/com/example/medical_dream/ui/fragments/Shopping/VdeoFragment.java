package com.example.medical_dream.ui.fragments.Shopping;

import android.os.Bundle;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseFragment;
import com.example.medical_dream.contract.shopping.BookContract;
import com.example.medical_dream.contract.shopping.VdeoContract;
import com.example.medical_dream.persenter.shaopping.BookPresenter;
import com.example.medical_dream.persenter.shaopping.VdeoPresenter;

/**
 * Created by ren on 2019/11/8.
 */

public class VdeoFragment extends BaseFragment<VdeoContract.VdeoView,
        VdeoPresenter<VdeoContract.VdeoView>> implements
        BookContract.BookView {

    public static VdeoFragment getInstance(){
        VdeoFragment vdeoFragment = new VdeoFragment();
        Bundle bundle = new Bundle();
        vdeoFragment.setArguments(bundle);
        return vdeoFragment;
    }

    @Override
    protected VdeoPresenter<VdeoContract.VdeoView> createPersenter() {
        return new VdeoPresenter<>();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_vdeo;
    }

    @Override
    public void getData() {

    }

    @Override
    public void onError(String error) {

    }
}
