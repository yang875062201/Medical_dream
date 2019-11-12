package com.example.medical_dream.contract.shopping;

public interface BookContract {
    interface BookView{
        void getData();
        void onError(String error);
    }

    interface BookModuel{
        interface BookCallBack{
            void setData();
            void onError(String error);
        }
        void getData(BookCallBack bookCallBack);
    }

    interface BookPresenter{
        void getData();
    }
}
