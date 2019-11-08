package com.example.medical_dream.ui.fragments.Shopping;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.medical_dream.R;
import com.example.medical_dream.app.BaseApp;
import com.example.medical_dream.base.BaseFragment;
import com.example.medical_dream.bean.shopping.AllBean;
import com.example.medical_dream.contract.shopping.AllContract;
import com.example.medical_dream.persenter.shaopping.AllPresenter;
import com.example.medical_dream.ui.adapters.shopping.MyAllReAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by ren on 2019/11/8.
 */

public class AllFragment extends BaseFragment<AllContract.AllView,
        AllPresenter<AllContract.AllView>> implements
        AllContract.AllView {

    @BindView(R.id.recycler)
    RecyclerView mRecycler;
    private MyAllReAdapter adapter;

    public static AllFragment getInstance() {
        AllFragment allFragment = new AllFragment();
        Bundle bundle = new Bundle();
        allFragment.setArguments(bundle);
        return allFragment;
    }

    @Override
    protected AllPresenter<AllContract.AllView> createPersenter() {
        return new AllPresenter<>();
    }

    @Override
    protected void initData() {
        mPersenter.getData(BaseApp.access_token);
    }

    @Override
    protected void initView() {
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecycler.setItemAnimator(new DefaultItemAnimator());
        mRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        adapter = new MyAllReAdapter(getActivity());
        mRecycler.setAdapter(adapter);
    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_all;
    }

    @Override
    public void getData(AllBean allBean) {
        adapter.setData(allBean.getInfo());
    }

    @Override
    public void onError(String error) {
        Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
    }

}
