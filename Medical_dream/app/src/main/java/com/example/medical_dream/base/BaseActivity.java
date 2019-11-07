package com.example.medical_dream.base;

public abstract class BaseActivity
            <V,P extends BasePersenter<V>>
        extends SimpleActivity{

    protected P mPersenter=null;

    @Override
    public void initPersenter() {
        mPersenter = createPersenter();
        mPersenter.attachView((V)this);
    }
    protected abstract P createPersenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPersenter!=null){
            mPersenter.destoryView();
            mPersenter=null;
        }
    }
}
