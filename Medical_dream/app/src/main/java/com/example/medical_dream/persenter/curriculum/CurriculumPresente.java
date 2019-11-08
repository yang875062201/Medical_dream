package com.example.medical_dream.persenter.curriculum;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.bean.currculumBean.CurriculumBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.contract.curriculum.CurriculumContract;
import com.example.medical_dream.contract.login.LoginContract;
import com.example.medical_dream.model.currculum.CurriculumMode;
import com.example.medical_dream.model.login.LoginMode;

public class CurriculumPresente<V extends CurriculumContract.CurriculumView> extends
        BasePersenter<V>
        implements
        CurriculumContract.CurriculumPresenter,
        CurriculumContract.CurriculumModuel.CurriculumCallBack{
    CurriculumContract.CurriculumModuel curriculumMode=new CurriculumMode();


    @Override
    public void setData(CurriculumBean curriculumBean) {
        mView.getData(curriculumBean);
    }

    @Override
    public void onError(String error) {
        mView.onError(error);
    }

    @Override
    public void getData() {
        curriculumMode.getData(this);
    }
}
