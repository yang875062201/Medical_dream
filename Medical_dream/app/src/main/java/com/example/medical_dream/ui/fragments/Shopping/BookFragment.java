package com.example.medical_dream.ui.fragments.Shopping;

import android.os.Bundle;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseFragment;
import com.example.medical_dream.contract.shopping.BookContract;
import com.example.medical_dream.persenter.shaopping.AllPresenter;
import com.example.medical_dream.persenter.shaopping.BookPresenter;

/**
 * Created by ren on 2019/11/8.
 */

public class BookFragment extends BaseFragment<BookContract.BookView,
        BookPresenter<BookContract.BookView>> implements
        BookContract.BookView {

    public static BookFragment getInstance(){
        BookFragment bookFragment = new BookFragment();
        Bundle bundle = new Bundle();
        bookFragment.setArguments(bundle);
        return bookFragment;
    }

    @Override
    protected BookPresenter<BookContract.BookView> createPersenter() {
        return new BookPresenter<>();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_book;
    }

    @Override
    public void getData() {

    }

    @Override
    public void onError(String error) {

    }
}
