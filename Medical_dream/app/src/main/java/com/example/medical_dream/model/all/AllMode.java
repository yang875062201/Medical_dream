package com.example.medical_dream.model.all;

import com.example.medical_dream.app.BaseApp;
import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.shopping.AllBean;
import com.example.medical_dream.contract.TikuContract;
import com.example.medical_dream.contract.shopping.AllContract;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.RxUtils;

import io.reactivex.Observable;

/**
 * Created by ren on 2019/11/8.
 */

public class AllMode implements AllContract.AllModuel {
    @Override
    public void getData(final AllCallBack allCallBack,String token) {
        ApiServer apiServer = HttpManager.getInstance().getServer(ApiServer.Url, ApiServer.class);
        Observable<AllBean> observable = apiServer.getAll("Bearer "+token, "0", "0");
        observable.compose(RxUtils.<AllBean>rxScheduleThread())
                .subscribe(new BaseObserver<AllBean>() {
                    @Override
                    public void onSucess(AllBean allBean) {
                        if (allBean!=null){
                            allCallBack.setData(allBean);
                        }
                    }

                    @Override
                    public void onFail(String error) {
                            allCallBack.onError(error);
                    }
                });
    }


}
