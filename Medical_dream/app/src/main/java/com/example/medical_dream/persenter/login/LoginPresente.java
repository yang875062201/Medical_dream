package com.example.medical_dream.persenter.login;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.contract.login.LoginContract;
import com.example.medical_dream.model.login.LoginMode;

public class LoginPresente <V extends LoginContract.LoginView> extends
        BasePersenter<V>
        implements
        LoginContract.LoginPresenter,
        LoginContract.LoginModuel.LoginCallBack{
    LoginContract.LoginModuel loginModuel=new LoginMode();

    @Override
    public void getcode(String phone) {
        loginModuel.getcode(this,phone);
    }

    @Override
    public void getCode(String phone, String code) {
        loginModuel.getCode(this,phone,code);
    }

    @Override
    public void getDatapass(String phone, String pass) {
        loginModuel.getData(this,phone,pass);
    }
    @Override
    public void setData(LoginBean loginBean) {
        mView.getData(loginBean);
    }

    @Override
    public void setcode(AuthCodeBean authCodeBean) {
        mView.getcode(authCodeBean);
    }

    @Override
    public void setCode(LoginBean loginBean) {
        mView.getCode(loginBean);
    }




    @Override
    public void onError(String error) {
        mView.onError(error);
    }


}
