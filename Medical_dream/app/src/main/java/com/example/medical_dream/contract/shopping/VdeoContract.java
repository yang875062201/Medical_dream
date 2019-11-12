package com.example.medical_dream.contract.shopping;

public interface VdeoContract {
    interface VdeoView{
        void getData();
        void onError(String error);
    }

    interface VdeoModuel{
        interface VdeoCallBack{
            void setData();
            void onError(String error);
        }
        void getData(VdeoCallBack vdeoCallBack);
    }

    interface VdeoPresenter{
        void getData();
    }
}
