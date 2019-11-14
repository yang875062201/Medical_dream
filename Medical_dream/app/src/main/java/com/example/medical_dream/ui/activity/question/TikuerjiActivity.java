package com.example.medical_dream.ui.activity.question;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.ui.adapters.question.MyQuestionerjiAdapter;

import java.io.Serializable;
import java.util.List;

public class TikuerjiActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 返回
     */
    private TextView mBack;
    private RecyclerView mRecyclerView;
    private MyQuestionerjiAdapter myQuestionerjiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tikuerji);
        initView();
    }

    private void initView() {
        List<TikuBean.InfoBean.UTypeBean.ZTypeBean>  list = (List<TikuBean.InfoBean.UTypeBean.ZTypeBean>) getIntent().getSerializableExtra("list");
        mBack = (TextView) findViewById(R.id.back);
        mBack.setOnClickListener(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayout.HORIZONTAL));
        myQuestionerjiAdapter = new MyQuestionerjiAdapter(this, list);
        mRecyclerView.setAdapter(myQuestionerjiAdapter);
        myQuestionerjiAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.back:
                finish();
                break;
        }
    }
}
