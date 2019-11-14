package com.example.medical_dream.ui.adapters.question;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.ui.activity.question.DaTiActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyQuestionerjiAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<TikuBean.InfoBean.UTypeBean.ZTypeBean> list;

    public MyQuestionerjiAdapter(Context context, List<TikuBean.InfoBean.UTypeBean.ZTypeBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tikuerji, viewGroup, false);
        return new MyHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {

        MyHolder1 viewHolder1 = (MyHolder1) viewHolder;
        viewHolder1.mTvName.setText(list.get(i).getName());
        viewHolder1.mTvNum.setText("0/"+list.get(i).getZong());
        viewHolder1.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DaTiActivity.class);
                intent.putExtra("ti_id",list.get(i).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder1 extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name)
        TextView mTvName;
        @BindView(R.id.image)
        ImageView mImage;
        @BindView(R.id.tv_num)
        TextView mTvNum;
        @BindView(R.id.relativeLayout)
        RelativeLayout relativeLayout;
        public MyHolder1(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }


}
