package com.example.medical_dream.contract.login;

import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.bean.login.regiter.RegisterBean;

public interface FindPassContract {

    interface FindPassPresenter{
        void getcode(String phone);
        void getData(String phone,  String pass,String code);
    }
    interface FindPassView{
        void getData(FindPassBean findPassBean);
        void onError(String error);
    }

    interface FindPassModuel{
        interface FindPassCallBack{
            void setData(FindPassBean findPassBean);
            void onError(String error);
        }
        void getcode(FindPassCallBack findPassCallBack, String phone);
        void getData(FindPassCallBack registerCallBack, String phone,  String pass,String code);
    }


}
