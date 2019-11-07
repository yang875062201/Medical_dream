package com.example.medical_dream.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical_dream.R;
import com.example.medical_dream.app.BaseApp;
import com.example.medical_dream.base.BaseFragment;
import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.contract.TikuContract;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.persenter.TikuPresente;
import com.example.medical_dream.ui.adapters.MyQuestionAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionFragment extends BaseFragment<TikuContract.TikuView,
        TikuPresente<TikuContract.TikuView>> implements
        TikuContract.TikuView {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    private MyQuestionAdapter myQuestionAdapter;
    private ArrayList<TikuBean.InfoBean.UTypeBean> list;


    @Override
    protected void initData() {
        String access_token = BaseApp.access_token;

        mPersenter.getData(access_token);
        mPersenter.getDays(access_token);
    }

    @Override
    protected void initView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();

    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_question;
    }

    @Override
    protected TikuPresente<TikuContract.TikuView> createPersenter() {
        return new TikuPresente<>();
    }

    @Override
    public void getData(List<TikuBean.InfoBean.UTypeBean> uTypeBeans) {
        Logger.log("uTypeBeans",uTypeBeans.toString());
        list.addAll(uTypeBeans);
    }

    @Override
    public void getDays(DaysBean.InfoBean infoBeans) {
        Logger.log("infoBeans",infoBeans.toString());
        myQuestionAdapter = new MyQuestionAdapter(getContext(), list,infoBeans);
        mRecyclerView.setAdapter(myQuestionAdapter);
        myQuestionAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String error) {

    }


}
