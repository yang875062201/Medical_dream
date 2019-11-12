package com.example.medical_dream.bean.forum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.medical_dream.R;

@SuppressLint("ValidFragment")
public class ForumSchoolInFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= View.inflate(getContext(), R.layout.forumschoolinfragment,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextView tv = view.findViewById(R.id.tv);
        tv.setText(id);
    }

    private String id;

    @SuppressLint("ValidFragment")
    public ForumSchoolInFragment(String id) {
        this.id = id;
    }
}
