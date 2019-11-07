package com.example.medical_dream.model.login;

import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.contract.login.FindPassContract;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.http.RxUtils;

public class FindPassMode implements FindPassContract.FindPassModuel{


    @Override
    public void getcode(final FindPassCallBack findPassCallBack, String phone) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getCode(phone,"2")
                .compose(RxUtils.<AuthCodeBean>rxScheduleThread())
                .subscribe(new BaseObserver<AuthCodeBean>() {
                    @Override
                    public void onSucess(AuthCodeBean authCodeBean) {
                        findPassCallBack.onError(authCodeBean.getMas());
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("13233",error);
                    }
                });
    }

    @Override
    public void getData(final FindPassCallBack findPassCallBack, String phone, String pass, String code) {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getPass(phone,pass,pass,code)
                .compose(RxUtils.<FindPassBean>rxScheduleThread())
                .subscribe(new BaseObserver<FindPassBean>() {
                    @Override
                    public void onSucess(FindPassBean findPassBean) {
                        findPassCallBack.setData(findPassBean);
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("13233",error);
                    }
                });
    }
}
