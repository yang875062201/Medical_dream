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


import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseObserver;
import com.example.medical_dream.bean.OfficialForumBean;
import com.example.medical_dream.bean.forum.OfficialBean;
import com.example.medical_dream.http.ApiServer;
import com.example.medical_dream.http.HttpManager;
import com.example.medical_dream.http.RxUtils;
import com.example.medical_dream.ui.adapters.OfficialForumAdapter;
import com.example.medical_dream.utils.ColorDividerItemDecoration;

import java.util.List;

public class OfficialForumFragment extends Fragment {

    private RecyclerView recyclerView;
    private OfficialForumAdapter officialForumAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= View.inflate(getContext(),R.layout.officialforumfragment,null);
        initView(view);
        return view;
    }

    private void initData() {
        HttpManager.getInstance().getServer("  https://app.yiyanmeng.com/index.php/", ApiServer.class)
                .getOffcial("Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTQ3NSIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzk5OTc4NH0.rDikwD5QS2FFChPsMiBz204FrsAR6o3dy2liwwasuqg","1")
                .compose(RxUtils.<OfficialBean>rxScheduleThread())
                .subscribe(new BaseObserver<OfficialBean>() {
                    @Override
                    public void onSucess(OfficialBean officialBean) {
                        List<OfficialBean.InfoBean.ArticleBean> article = officialBean.getInfo().getArticle();
                        List<OfficialBean.InfoBean.PlateBean> plate = officialBean.getInfo().getPlate();
                        officialForumAdapter.sendData(article,plate);
                    }

                    @Override
                    public void onFail(String error) {

                    }
                });
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new ColorDividerItemDecoration(
                getResources().getColor(R.color.write),
                3
        ));
        officialForumAdapter = new OfficialForumAdapter(getContext());
        recyclerView.setAdapter(officialForumAdapter);
        initData();
    }


}
