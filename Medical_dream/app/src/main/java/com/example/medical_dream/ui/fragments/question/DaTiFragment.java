package com.example.medical_dream.ui.fragments.question;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical_dream.R;
import com.example.medical_dream.bean.question.DaTiBean;
import com.example.medical_dream.ui.adapters.question.MyDaTiAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class DaTiFragment extends Fragment {


    private static final String TAG = "DaTiFragment";
    private View view;
    /**
     * Hello blank fragment
     */
    private RecyclerView mRecyclerView;
    private DaTiBean.InfoBean.ListBean list;
    private MyDaTiAdapter myDaTiAdapter;

    public DaTiFragment(DaTiBean.InfoBean.ListBean listBean) {
        Log.d(TAG, "DaTiFragment: "+listBean.toString());
        list=listBean;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_da_ti, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myDaTiAdapter = new MyDaTiAdapter(getContext(), list);
        mRecyclerView.setAdapter(myDaTiAdapter);
        myDaTiAdapter.notifyDataSetChanged();
    }
}
