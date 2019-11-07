package com.example.medical_dream.base;

import com.example.medical_dream.http.Logger;

import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;

public abstract class BaseObserver<T> implements Observer<T> {
    private CompositeDisposable compositeDisposable=new CompositeDisposable();

    @Override
    public void onSubscribe(Disposable d) {
        compositeDisposable.add(d);
    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof ApiException){
            ApiException apiException=(ApiException)e;
           apiException.getMessage();
            Logger.log("yzh", "onError: "+apiException.getMessage());
        }else if (e instanceof HttpException){
            Logger.log("yzh", "onError: "+e.getMessage());
        }
        onFail(e.getMessage());
    }

    @Override
    public void onNext(T t) {
        onSucess(t);
    }
    public void  onComplete(){
        if (compositeDisposable!=null){
            compositeDisposable.clear();
        }
    }

    public  abstract void  onSucess(T t);
    public abstract  void  onFail(String error);
}
