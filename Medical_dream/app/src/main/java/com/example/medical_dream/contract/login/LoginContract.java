package com.example.medical_dream.contract.login;

import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;

public interface LoginContract {

    interface LoginPresenter{
        void getcode(String phone);
        void getCode(String phone,String code);
        void getDatapass(String phone,String pass);
    }
    interface LoginView{
        void getcode(AuthCodeBean authCodeBean);
        void getData(LoginBean loginBean);
        void getCode(LoginBean loginBean);
        void onError(String error);
    }

    interface LoginModuel{
        interface LoginCallBack{
            void setData(LoginBean loginBean);
            void setcode(AuthCodeBean authCodeBean);
            void setCode(LoginBean loginBean);
            void onError(String error);
        }
        void getData(LoginCallBack loginCallBack,String phone,String pass);
        void getCode(LoginCallBack loginCallBack,String phone,String code);
        void getcode(LoginCallBack loginCallBack,String phone);
    }


}
