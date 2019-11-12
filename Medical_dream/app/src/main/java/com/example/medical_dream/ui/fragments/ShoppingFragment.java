package com.example.medical_dream.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseFragment;
import com.example.medical_dream.contract.shopping.ShoppingContract;
import com.example.medical_dream.persenter.shaopping.ShoppingPresente;
import com.example.medical_dream.ui.fragments.Shopping.AllFragment;
import com.example.medical_dream.ui.fragments.Shopping.BookFragment;
import com.example.medical_dream.ui.fragments.Shopping.VdeoFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends BaseFragment<ShoppingContract.ShoppingView,
        ShoppingPresente<ShoppingContract.ShoppingView>> implements
        ShoppingContract.ShoppingView {

    @BindView(R.id.blue)
    RelativeLayout mBlue;
    @BindView(R.id.linear1)
    LinearLayout mLinear1;
    @BindView(R.id.linear2)
    LinearLayout mLinear2;
    @BindView(R.id.linear3)
    LinearLayout mLinear3;
    @BindView(R.id.lin_shopping)
    LinearLayout mLinShopping;
    @BindView(R.id.frame)
    FrameLayout mframe;
    private ArrayList<BaseFragment> fragments;

    private static final int TYPE_ALL = 0;
    private static final int TYPE_BOOK = 1;
    private static final int TYPE_VDEO = 2;
    private FragmentManager fragmentManager;
    private int _position;


    @Override
    public void getData() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    protected ShoppingPresente<ShoppingContract.ShoppingView> createPersenter() {
        return new ShoppingPresente<>();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        fragments = new ArrayList<>();
        fragments.add(AllFragment.getInstance());
        fragments.add(BookFragment.getInstance());
        fragments.add(VdeoFragment.getInstance());

        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        supportFragmentManager.beginTransaction().add(R.id.frame,fragments.get(0)).commit();
    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_shopping;
    }



    @OnClick({R.id.linear1, R.id.linear2, R.id.linear3})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.linear1:
                switchFragment(TYPE_ALL);
                break;
            case R.id.linear2:
                switchFragment(TYPE_BOOK);
                break;
            case R.id.linear3:
                switchFragment(TYPE_VDEO);
                break;
        }
    }

    private void switchFragment(int typeAll) {
        fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        BaseFragment baseFragment = fragments.get(_position);
        BaseFragment fragment = fragments.get(typeAll);
        if (!fragment.isAdded()) {
            transaction.add(R.id.frame,fragment);
        }
        transaction.hide(baseFragment);
        transaction.show(fragment);
        transaction.commit();
        _position = typeAll;
    }
}
