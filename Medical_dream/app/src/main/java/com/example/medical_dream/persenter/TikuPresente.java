package com.example.medical_dream.persenter;

import com.example.medical_dream.base.BasePersenter;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.contract.TikuContract;
import com.example.medical_dream.contract.login.FindPassContract;
import com.example.medical_dream.model.TikuMode;
import com.example.medical_dream.model.login.FindPassMode;

import java.util.List;

public class TikuPresente<V extends TikuContract.TikuView> extends
        BasePersenter<V>
        implements
        TikuContract.TikuPresenter,
        TikuContract.TikuModuel.TikuCallBack{
    TikuContract.TikuModuel tikuMode=new TikuMode();


    @Override
    public void getData(String token) {
        tikuMode.getData(this,token);
    }

    @Override
    public void getDays(String token) {
        tikuMode.getDays(this,token);
    }

    @Override
    public void setData(List<TikuBean.InfoBean.UTypeBean> uTypeBeans) {
        mView.getData(uTypeBeans);
    }

    @Override
    public void setDays(DaysBean.InfoBean infoBeans) {
        mView.getDays(infoBeans);
    }

    @Override
    public void onError(String error) {
        mView.onError(error);
    }
}
