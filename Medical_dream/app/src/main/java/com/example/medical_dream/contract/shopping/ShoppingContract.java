package com.example.medical_dream.contract.shopping;

public interface ShoppingContract {
    interface ShoppingView{
        void getData();
        void onError(String error);
    }

    interface ShoppingModuel{
        interface ShoppingCallBack{
            void setData();
            void onError(String error);
        }
        void getData(ShoppingCallBack shoppingCallBack);
    }

    interface ShoppingPresenter{
        void getData();
    }
}
