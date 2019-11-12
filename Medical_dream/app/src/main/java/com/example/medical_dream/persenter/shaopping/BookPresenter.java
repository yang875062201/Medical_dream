package com.example.medical_dream.persenter.shaopping;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.contract.shopping.AllContract;
import com.example.medical_dream.contract.shopping.BookContract;

/**
 * Created by ren on 2019/11/8.
 */

public class BookPresenter<V extends BookContract.BookView> extends
        BasePersenter<V>
        implements
        BookContract.BookPresenter,
        BookContract.BookModuel.BookCallBack {

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
