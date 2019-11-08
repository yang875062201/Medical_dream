package com.example.medical_dream.persenter.shaopping;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.contract.TikuContract;
import com.example.medical_dream.contract.shopping.ShoppingContract;

/**
 * Created by ren on 2019/11/8.
 */

public class ShoppingPresente <V extends ShoppingContract.ShoppingView> extends
        BasePersenter<V>
        implements
        ShoppingContract.ShoppingPresenter,
        ShoppingContract.ShoppingModuel.ShoppingCallBack  {
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
