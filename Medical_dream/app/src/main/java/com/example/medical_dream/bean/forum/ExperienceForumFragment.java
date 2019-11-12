package com.example.medical_dream.bean.forum;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.forum.ExperienceBean;
import com.example.medical_dream.bean.forum.OfficialBean;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.RxUtils;
import com.example.medical_dream.ui.adapters.ExperienceForumAdapter;
import com.example.medical_dream.utils.ColorDividerItemDecoration;

import java.util.List;

public class ExperienceForumFragment extends Fragment {

    private TextView tvTitle;
    private RecyclerView recycler;
    private ExperienceForumAdapter experienceForumAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= View.inflate(getContext(), R.layout.experienceforumfragment,null);
        initView(view);
        return view;
    }

    private void initView(View view) {

        tvTitle = view.findViewById(R.id.tv_title);
        recycler = view.findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.addItemDecoration(new ColorDividerItemDecoration(
                getResources().getColor(R.color.write),
                3
        ));
        experienceForumAdapter = new ExperienceForumAdapter(getContext());
        recycler.setAdapter(experienceForumAdapter);
        initData();

    }



    private void initData() {
        HttpManager.getInstance().getServer("  https://app.yiyanmeng.com/index.php/", ApiServer.class)
                .getExperience("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTQ3NSIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzk5OTc4NH0.rDikwD5QS2FFChPsMiBz204FrsAR6o3dy2liwwasuqg","1")
                .compose(RxUtils.<ExperienceBean>rxScheduleThread())
                .subscribe(new BaseObserver<ExperienceBean>() {
                    @Override
                    public void onSucess(ExperienceBean experienceBean) {
                        String title = experienceBean.getInfo().getTop().get(0).getTitle();
                        tvTitle.setText(title);
                        List<ExperienceBean.InfoBean.ArticleBean> article = experienceBean.getInfo().getArticle();
                        experienceForumAdapter.sendData(article);
                    }

                    @Override
                    public void onFail(String error) {

                    }
                });
    }


}
