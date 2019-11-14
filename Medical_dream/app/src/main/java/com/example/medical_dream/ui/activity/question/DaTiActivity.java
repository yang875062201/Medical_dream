package com.example.medical_dream.ui.activity.question;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.app.BaseApp;
import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.question.DaTiBean;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.http.RxUtils;
import com.example.medical_dream.ui.adapters.question.MyDaTiPagerAdapter;
import com.example.medical_dream.ui.fragments.question.DaTiFragment;

import java.util.ArrayList;
import java.util.List;

public class DaTiActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 返回
     */
    private TextView mBack;
    private ViewPager mViewPager;
    private String access_token;
    private String ti_id;
    private ArrayList<Fragment> fragments;
    private MyDaTiPagerAdapter myDaTiPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_ti);
        access_token = BaseApp.access_token;
        initView();
    }

    private void initView() {
        ti_id = getIntent().getStringExtra("ti_id");
        mBack = (TextView) findViewById(R.id.back);
        mBack.setOnClickListener(this);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        fragments = new ArrayList<>();
        initData();




    }

    private void initData() {
        HttpManager.getInstance().getServer(ApiServer.Url,ApiServer.class)
                .getDaTi("Bearer "+access_token,ti_id)
                .compose(RxUtils.<DaTiBean>rxScheduleThread())
                .subscribe(new BaseObserver<DaTiBean>() {

                    @Override
                    public void onSucess(DaTiBean daTiBean) {
                        for (int i = 0; i < daTiBean.getInfo().getList().size(); i++) {
                            DaTiBean.InfoBean.ListBean listBean = daTiBean.getInfo().getList().get(i);
                            fragments.add(new DaTiFragment(listBean));
                        }
                        myDaTiPagerAdapter = new MyDaTiPagerAdapter(getSupportFragmentManager(), fragments);
                        mViewPager.setAdapter(myDaTiPagerAdapter);
                        myDaTiPagerAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onFail(String error) {

                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.back:
                finish();
                break;
        }
    }

}
