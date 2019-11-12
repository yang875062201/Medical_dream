package com.example.medical_dream.bean.forum;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.RxUtils;
import com.example.medical_dream.ui.adapters.ForumSchoolAdapter;

import java.util.ArrayList;
import java.util.List;


public class ForumSchoolFragment extends Fragment {

    private ArrayList<String> titles;
    private ArrayList<Fragment> fragments;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.forumschoolfragment,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tabLayout = view.findViewById(R.id.tablayout);
        viewPager = view.findViewById(R.id.viewpager);
        titles = new ArrayList<>();
        fragments = new ArrayList<>();
        initData();
    }

    private void initData() {
        HttpManager.getInstance().getServer("https://app.yiyanmeng.com/index.php/", ApiServer.class)
                .getForumSchoolData()
                .compose(RxUtils.<SchoolTab>rxScheduleThread())
                .subscribe(new BaseObserver<SchoolTab>() {

                    private List<SchoolTab.InfoBean> info;

                    @Override
                    public void onSucess(SchoolTab schoolTab) {
                        info = schoolTab.getInfo();
                        tabLayout.post(new Runnable() {
                            @Override
                            public void run() {

                                for (int i = 0; i < info.size(); i++) {
                                    String id = info.get(i).getId();
                                    fragments.add(new ForumSchoolInFragment(id));
                                    titles.add(info.get(i).getName());
                                }
                                ForumSchoolAdapter forumSchoolAdapter = new ForumSchoolAdapter(getFragmentManager(), fragments, titles);
                                viewPager.setAdapter(forumSchoolAdapter);
                                tabLayout.setupWithViewPager(viewPager);

                            }
                        });
                    }

                    @Override
                    public void onFail(String error) {

                    }
                });
    }


}
