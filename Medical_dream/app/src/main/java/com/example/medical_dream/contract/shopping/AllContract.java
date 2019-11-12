package com.example.medical_dream.contract.shopping;

import com.example.medical_dream.bean.shopping.AllBean;

public interface AllContract {
    interface AllView{
        void getData(AllBean allBean);
        void onError(String error);
    }

    interface AllModuel{
        interface AllCallBack{
            void setData(AllBean allBean);
            void onError(String error);
        }
        void getData(AllCallBack AllCallBack,String token);
    }

    interface AllPresenter{
        void getData(String token);
    }
}
