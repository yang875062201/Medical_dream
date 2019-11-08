package com.example.medical_dream.persenter.shaopping;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.contract.shopping.BookContract;
import com.example.medical_dream.contract.shopping.VdeoContract;

/**
 * Created by ren on 2019/11/8.
 */

public class VdeoPresenter<V extends VdeoContract.VdeoView> extends
        BasePersenter<V>
        implements
        VdeoContract.VdeoPresenter,
        VdeoContract.VdeoModuel.VdeoCallBack {

    @Override
    public void setData() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void getData() {

    }
}
