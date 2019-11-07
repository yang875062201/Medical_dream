package com.example.medical_dream.contract;

public interface MainContract {
    interface MainView{
        void getData();
        void onError(String error);
    }

    interface MainModuel{
        interface MainCallBack{
            void setData();
            void onError(String error);
        }
        void getData(MainCallBack MainCallBack);
    }

    interface MainPresenter{
        void getData();
    }
}
