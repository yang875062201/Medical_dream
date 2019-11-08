package com.example.medical_dream.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseFragment;
import com.example.medical_dream.bean.currculumBean.CurriculumBean;
import com.example.medical_dream.contract.curriculum.CurriculumContract;
import com.example.medical_dream.persenter.curriculum.CurriculumPresente;
import com.example.medical_dream.ui.adapters.curriculum.MyCurrAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurriculumFragment extends BaseFragment<CurriculumContract.CurriculumView,
        CurriculumPresente<CurriculumContract.CurriculumView>> implements
        CurriculumContract.CurriculumView {


    @BindView(R.id.rec_curr)
    RecyclerView mRecCurr;
    private MyCurrAdapter myCurrAdapter;
    private ArrayList<String> banner;
    private List<CurriculumBean.InfoBean.GongGaoBean> gong_gao;
    private List<CurriculumBean.InfoBean.KechengBean> kecheng;


    @Override
    protected CurriculumPresente<CurriculumContract.CurriculumView> createPersenter() {
        return new CurriculumPresente<>();
    }

    @Override
    protected void initData() {
        mPersenter.getData();
    }

    @Override
    protected void initView() {
        mRecCurr.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_curriculum;
    }

    @Override
    public void getData(CurriculumBean curriculumBean) {
        banner = new ArrayList<>();
        for (int i = 0; i < curriculumBean.getInfo().getLunbo().size(); i++) {
            String pic = curriculumBean.getInfo().getLunbo().get(i).getPic();
            banner.add(pic);
        }

        gong_gao = curriculumBean.getInfo().getGong_gao();
        kecheng = curriculumBean.getInfo().getKecheng();
        Log.d("banner", "getData: "+banner);
        Log.d("gong_gao", "getData: "+gong_gao.toString());
        Log.d("kecheng", "getData: "+kecheng.toString());
        myCurrAdapter = new MyCurrAdapter(getContext(), banner, gong_gao, kecheng);
        mRecCurr.setAdapter(myCurrAdapter);
        myCurrAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String error) {

    }


}
