package com.example.medical_dream.persenter.login;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.contract.login.FindPassContract;
import com.example.medical_dream.model.login.FindPassMode;

public class FindPassPresente<V extends FindPassContract.FindPassView> extends
        BasePersenter<V>
        implements
        FindPassContract.FindPassPresenter,
        FindPassContract.FindPassModuel.FindPassCallBack{
    FindPassContract.FindPassModuel findPassMode=new FindPassMode();


    @Override
    public void getcode(String phone) {
        findPassMode.getcode(this,phone);
    }

    @Override
    public void getData(String phone,  String pass,String code) {
        findPassMode.getData(this,phone,pass,code);
    }

    @Override
    public void setData(FindPassBean findPassBean) {
        mView.getData(findPassBean);
    }

    @Override
    public void onError(String error) {
        mView.onError(error);
    }
}
