package com.example.medical_dream.ui.adapters.question;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.ui.activity.question.TikuerjiActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyQuestionAdapter extends RecyclerView.Adapter {
    private Context context;
    private  List<TikuBean.InfoBean.UTypeBean> list;
    private DaysBean.InfoBean days;
    private int TYPE_ITEM1=0;
    private int TYPE_ITEM2=1;

    public MyQuestionAdapter(Context context, List<TikuBean.InfoBean.UTypeBean> list, DaysBean.InfoBean days) {
        this.context = context;
        this.list = list;
        this.days = days;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i==TYPE_ITEM1){
            View view = LayoutInflater.from(context).inflate(R.layout.item1_question, viewGroup, false);
            return new MyHolder1(view);
        }else {
            View view = LayoutInflater.from(context).inflate(R.layout.item2__question, viewGroup, false);
            return new MyHolder2(view);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType==TYPE_ITEM1){
            MyHolder1 viewHolder1 = (MyHolder1) viewHolder;
            viewHolder1.tv_time_item1.setText(days.getTian()+"天");
            viewHolder1.tv_desc_item1.setText(days.getBlessing());
        }else {
            MyHolder2 viewHolder2 = (MyHolder2) viewHolder;
            viewHolder2.title.setText(list.get(i-1).getName());
            viewHolder2.desc.setText(list.get(i-1).getJianjie());
            viewHolder2.rlv__question.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    List<TikuBean.InfoBean.UTypeBean.ZTypeBean> z_type = list.get(i - 1).getZ_type();
                    Intent intent = new Intent(context, TikuerjiActivity.class);
                    intent.putExtra("list", (Serializable) z_type);
                    context.startActivity(intent);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return list.size()+1;
    }
    class MyHolder1 extends RecyclerView.ViewHolder {

        private final Button btn_punch;
        private final TextView tv_time_item1;
        private final TextView tv_desc_item1;
        private final LinearLayout lnear_li;
        private final LinearLayout lnear_mo;
        private final LinearLayout lnear_ti;
        private final LinearLayout lnear_zhi;
        private final LinearLayout lnear_zheng;
        private final LinearLayout lnear_cuo;

        public MyHolder1(@NonNull View itemView) {
            super(itemView);
            btn_punch = itemView.findViewById(R.id.btn_punch);
            tv_time_item1 = itemView.findViewById(R.id.tv_time_item1);
            tv_desc_item1 = itemView.findViewById(R.id.tv_desc_item1);
            lnear_li = itemView.findViewById(R.id.lnear_li);
            lnear_mo = itemView.findViewById(R.id.lnear_mo);
            lnear_ti = itemView.findViewById(R.id.lnear_ti);
            lnear_zhi = itemView.findViewById(R.id.lnear_zhi);
            lnear_zheng = itemView.findViewById(R.id.lnear_zheng);
            lnear_cuo = itemView.findViewById(R.id.lnear_cuo);

        }
    }
    class MyHolder2 extends RecyclerView.ViewHolder {

        private final RelativeLayout rlv__question;
        private final TextView title;
        private final TextView desc;

        public MyHolder2(@NonNull View itemView) {
            super(itemView);
            rlv__question = itemView.findViewById(R.id.rlv__question);
            title = itemView.findViewById(R.id.tv_title_question);
            desc = itemView.findViewById(R.id.tv_desc_question);

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return TYPE_ITEM1;
        }else {
            return TYPE_ITEM2;
        }
    }
}
