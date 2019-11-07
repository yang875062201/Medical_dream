package com.example.medical_dream.contract.login;

import com.example.medical_dream.bean.login.regiter.RegisterBean;

public interface RegisterContract {

    interface RegisterPresenter{
        void getcode(String phone);
        void getData(String phone,String code, String pass);
    }
    interface RegisterView{
        void getData(RegisterBean registerBean);
        void onError(String error);
    }

    interface RegisterModuel{
        interface RegisterCallBack{
            void setData(RegisterBean registerBean);
            void onError(String error);
        }
        void getcode(RegisterCallBack registerCallBack,String phone);
        void getData(RegisterCallBack registerCallBack, String phone,String code, String pass);
    }


}
