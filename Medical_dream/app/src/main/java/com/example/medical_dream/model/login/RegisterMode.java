package com.example.medical_dream.model.login;

import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.RegisterBean;
import com.example.medical_dream.contract.login.RegisterContract;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.http.RxUtils;

public class RegisterMode implements RegisterContract.RegisterModuel{

    @Override
    public void getcode(final RegisterCallBack registerCallBack, String phone) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getCode(phone,"1")
                .compose(RxUtils.<AuthCodeBean>rxScheduleThread())
                .subscribe(new BaseObserver<AuthCodeBean>() {
                    @Override
                    public void onSucess(AuthCodeBean authCodeBean) {
                        registerCallBack.onError(authCodeBean.getMas());
                    }

                    @Override
                    public void onFail(String error) {

                        Logger.log("13233",error);
                    }
                });
    }

    @Override
    public void getData(final RegisterCallBack registerCallBack, String phone,String code, String pass) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getregister(phone,phone,code,pass)
                .compose(RxUtils.<RegisterBean>rxScheduleThread())
                .subscribe(new BaseObserver<RegisterBean>() {
                    @Override
                    public void onSucess(RegisterBean registerBean) {
                        registerCallBack.setData(registerBean);
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("13233",error);
                    }
                });
    }
}
