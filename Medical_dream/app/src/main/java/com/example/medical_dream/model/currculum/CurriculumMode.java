package com.example.medical_dream.model.currculum;

import com.example.medical_dream.app.BaseApp;
import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.currculumBean.CurriculumBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.contract.curriculum.CurriculumContract;
import com.example.medical_dream.contract.login.LoginContract;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.http.RxUtils;

public class CurriculumMode implements CurriculumContract.CurriculumModuel{

    @Override
    public void getData(final CurriculumCallBack curriculumCallBack) {
        ApiServer server = HttpManager.getInstance().getServer(ApiServer.Url, ApiServer.class);
        server.getCurriculum("Bearer "+BaseApp.access_token,"1","1")
                .compose(RxUtils.<CurriculumBean>rxScheduleThread())
                .subscribe(new BaseObserver<CurriculumBean>() {
                    @Override
                    public void onSucess(CurriculumBean curriculumBean) {
                        if (curriculumBean!=null){
                            curriculumCallBack.setData(curriculumBean);
                        }
                    }

                    @Override
                    public void onFail(String error) {
                        Logger.log("error",error);
                    }
                });
    }
}
