package com.example.medical_dream.model.login;

import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.contract.login.LoginContract;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.http.RxUtils;

public class LoginMode  implements LoginContract.LoginModuel{
    @Override
    public void getData(final LoginCallBack loginCallBack, String phone, String pass) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getLogin(phone,pass)
                .compose(RxUtils.<LoginBean>rxScheduleThread())
                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    public void onSucess(LoginBean loginBean) {
                        loginCallBack.setData(loginBean);
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("13233",error);
                    }
                });
    }

    @Override
    public void getCode(final LoginCallBack loginCallBack, String phone, String code) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getZLogin("1",phone,code)
                .compose(RxUtils.<LoginBean>rxScheduleThread())
                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    public void onSucess(LoginBean loginBean) {
                        loginCallBack.setCode(loginBean);
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("13233",error);
                    }
                });
    }

    @Override
    public void getcode(final LoginCallBack loginCallBack, String phone) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getCode(phone,"6")
                .compose(RxUtils.<AuthCodeBean>rxScheduleThread())
                .subscribe(new BaseObserver<AuthCodeBean>() {
                    @Override
                    public void onSucess(AuthCodeBean authCodeBean) {
                        loginCallBack.setcode(authCodeBean);
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("13233",error);
                    }
                });
    }
}
