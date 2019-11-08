package com.example.medical_dream.persenter.shaopping;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.bean.shopping.AllBean;
import com.example.medical_dream.contract.shopping.AllContract;
import com.example.medical_dream.model.all.AllMode;

/**
 * Created by ren on 2019/11/8.
 */

public class AllPresenter <V extends AllContract.AllView> extends
        BasePersenter<V>
        implements
        AllContract.AllPresenter,
        AllContract.AllModuel.AllCallBack {
    AllContract.AllModuel allModuel=new AllMode();


    @Override
    public void setData(AllBean allBean) {
        mView.getData(allBean);
    }

    @Override
    public void onError(String error) {
        mView.onError(error);
    }

    @Override
    public void getData(String token) {
        allModuel.getData(this,token);
    }
}
