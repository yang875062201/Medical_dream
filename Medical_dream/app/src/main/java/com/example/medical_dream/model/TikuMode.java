package com.example.medical_dream.model;

import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.contract.TikuContract;
import com.example.medical_dream.contract.login.FindPassContract;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.http.RxUtils;

public class TikuMode implements TikuContract.TikuModuel{


    @Override
    public void getData(final TikuCallBack tikuCallBack, String token) {
        ApiServer server = HttpManager.getInstance().getServer(ApiServer.Url, ApiServer.class);
        server.getTiku("Bearer "+token)
                .compose(RxUtils.<TikuBean>rxScheduleThread())
                .subscribe(new BaseObserver<TikuBean>() {
                    @Override
                    public void onSucess(TikuBean tikuBean) {
                        if (tikuBean!=null){
                            tikuCallBack.setData(tikuBean.getInfo().getU_type());
                        }
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("error",error);
                    }
                });
    }

    @Override
    public void getDays(final TikuCallBack tikuCallBack, String token) {
        ApiServer server = HttpManager.getInstance().getServer(ApiServer.Url, ApiServer.class);
        server.getDays("Bearer "+token)
                .compose(RxUtils.<DaysBean>rxScheduleThread())
                .subscribe(new BaseObserver<DaysBean>() {
                    @Override
                    public void onSucess(DaysBean daysBean) {
                        if (daysBean!=null){
                            tikuCallBack.setDays(daysBean.getInfo());
                        }
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("error",error);
                    }
                });
    }
}
