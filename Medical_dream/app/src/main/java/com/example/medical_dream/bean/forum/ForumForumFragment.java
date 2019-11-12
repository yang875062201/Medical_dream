package com.example.medical_dream.bean.forum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.medical_dream.R;
import com.example.medical_dream.ui.adapters.ForumSchoolAdapter;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class ForumForumFragment extends Fragment {

    private ImageView img;
    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;

    @SuppressLint("ValidFragment")
    public ForumForumFragment(ImageView img) {
        this.img = img;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.forumforumfragment,null);
        initView(view);
        return view;
    }

    private void initView(View view) {

        slidingTabLayout = view.findViewById(R.id.slidingTabLayout);
        viewPager = view.findViewById(R.id.viewpager);

        OfficialForumFragment officialForumFragment = new OfficialForumFragment();
        ExperienceForumFragment experienceForumFragment = new ExperienceForumFragment();
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(officialForumFragment);
        fragments.add(experienceForumFragment);
        ArrayList<String> titles = new ArrayList<>();
        titles.add("官方论坛");
        titles.add("经验论坛");
        ForumSchoolAdapter forumSchoolAdapter = new ForumSchoolAdapter(getChildFragmentManager(), fragments, titles);
        viewPager.setAdapter(forumSchoolAdapter);
        slidingTabLayout.setViewPager(viewPager);
        slidingTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                if (position == 1){
                    img.setVisibility(View.VISIBLE);
                }else{
                    img.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

    }

}
