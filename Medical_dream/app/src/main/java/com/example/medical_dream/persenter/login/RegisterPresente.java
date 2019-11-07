package com.example.medical_dream.persenter.login;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.bean.login.regiter.RegisterBean;
import com.example.medical_dream.contract.login.RegisterContract;
import com.example.medical_dream.model.login.RegisterMode;

public class RegisterPresente<V extends RegisterContract.RegisterView> extends
        BasePersenter<V>
        implements
        RegisterContract.RegisterPresenter,
        RegisterContract.RegisterModuel.RegisterCallBack{
    RegisterContract.RegisterModuel registerModuel=new RegisterMode();


    @Override
    public void getcode(String phone) {
        registerModuel.getcode(this,phone);
    }

    @Override
    public void getData(String phone, String code, String pass) {
        registerModuel.getData(this,phone,code,pass);
    }

    @Override
    public void setData(RegisterBean registerBean) {
        mView.getData(registerBean);
    }

    @Override
    public void onError(String error) {
        mView.onError(error);
    }
}
