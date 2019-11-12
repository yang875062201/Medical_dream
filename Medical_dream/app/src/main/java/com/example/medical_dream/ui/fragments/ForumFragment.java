package com.example.medical_dream.ui.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.bean.forum.ForumForumFragment;
import com.example.medical_dream.bean.forum.ForumSchoolFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForumFragment extends Fragment {

    private RelativeLayout relative;
    private TextView forum;
    private TextView school;
    private FrameLayout framelayout;
    private FragmentManager childFragmentManager;
    private ForumSchoolFragment forumSchoolFragment;
    private ForumForumFragment forumForumFragment;
    private ImageView image_release;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(),R.layout.forumfragment,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        school = view.findViewById(R.id.school);
        forum = view.findViewById(R.id.forum);
        relative = view.findViewById(R.id.relative);
        framelayout = view.findViewById(R.id.framelayout);
        image_release = view.findViewById(R.id.image_release);
        initFragment();
        initListener();
    }

    private void initFragment() {
        forumSchoolFragment = new ForumSchoolFragment();
        forumForumFragment = new ForumForumFragment(image_release);
        childFragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = childFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout, forumSchoolFragment);
        fragmentTransaction.add(R.id.framelayout, forumForumFragment);
        fragmentTransaction.hide(forumForumFragment);
        fragmentTransaction.commit();
    }


    public void initListener() {
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relative.setBackground(getResources().getDrawable(R.drawable.shequ_bg_1));
                school.setTextColor(getResources().getColor(R.color.blue));
                forum.setTextColor(getResources().getColor(R.color.write));
                FragmentTransaction fragmentTransaction = childFragmentManager.beginTransaction();
                fragmentTransaction.hide(forumForumFragment);
                fragmentTransaction.show(forumSchoolFragment);
                fragmentTransaction.commit();
            }
        });
        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relative.setBackground(getResources().getDrawable(R.drawable.shequ_bg));
                school.setTextColor(getResources().getColor(R.color.write));
                forum.setTextColor(getResources().getColor(R.color.blue));
                FragmentTransaction fragmentTransaction = childFragmentManager.beginTransaction();
                fragmentTransaction.hide(forumSchoolFragment);
                fragmentTransaction.show(forumForumFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
