package com.example.medical_dream.contract.curriculum;

import com.example.medical_dream.bean.currculumBean.CurriculumBean;

public interface CurriculumContract {
    interface CurriculumView{
        void getData(CurriculumBean curriculumBean);
        void onError(String error);
    }

    interface CurriculumModuel{
        interface CurriculumCallBack{
            void setData(CurriculumBean curriculumBean);
            void onError(String error);
        }
        void getData(CurriculumCallBack curriculumCallBack);
    }

    interface CurriculumPresenter{
        void getData();
    }
}
