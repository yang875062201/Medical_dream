package com.example.medical_dream.contract;

import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;

import java.util.List;

public interface TikuContract {

    interface TikuPresenter{
        void getData(String token);
        void getDays(String token);
    }
    interface TikuView{
        void getData(List<TikuBean.InfoBean.UTypeBean> uTypeBeans);
        void getDays(DaysBean.InfoBean infoBeans);
        void onError(String error);
    }

    interface TikuModuel{
        interface TikuCallBack{
            void setData(List<TikuBean.InfoBean.UTypeBean> uTypeBeans);
            void setDays(DaysBean.InfoBean infoBeans);
            void onError(String error);
        }
        void getData(TikuCallBack tikuCallBack,String token);
        void getDays(TikuCallBack tikuCallBack,String token);
    }


}
