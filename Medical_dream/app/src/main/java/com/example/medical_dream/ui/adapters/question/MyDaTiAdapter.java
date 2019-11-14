package com.example.medical_dream.ui.adapters.question;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.bean.question.DaTiBean;
import com.example.medical_dream.ui.activity.question.DaTiActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyDaTiAdapter extends RecyclerView.Adapter {
    private Context context;
    private DaTiBean.InfoBean.ListBean list;

    public MyDaTiAdapter(Context context, DaTiBean.InfoBean.ListBean list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_dati, viewGroup, false);
        return new MyHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        final Drawable yes = context.getResources().getDrawable(R.drawable.xuanzhong);
        final Drawable no = context.getResources().getDrawable(R.drawable.no);
        final MyHolder1 viewHolder1 = (MyHolder1) viewHolder;
        viewHolder1.mTvDesc.setText(list.getName());
        viewHolder1.mTvA.setText(list.getData().getA());
        viewHolder1.mTvB.setText(list.getData().getB());
        viewHolder1.mTvC.setText(list.getData().getC());
        viewHolder1.mTvD.setText(list.getData().getD());
        final String da_an = list.getDa_an();
        viewHolder1.mXiangjie_tv.setText(list.getXiang_jie());
        viewHolder1.mlin_xiangjie.setVisibility(View.GONE);
        viewHolder1.mLinA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder1.mIvA.setText("");
                if (da_an.equals("A")){
                    viewHolder1.mIvA.setBackgroundDrawable(yes);
                    viewHolder1.mDaan.setText("答案："+da_an);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                }else {
                    viewHolder1.mIvA.setBackgroundDrawable(no);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                    if (da_an.equals("B")){
                        viewHolder1.mIvB.setBackgroundDrawable(yes);
                        viewHolder1.mIvB.setText("");
                        viewHolder1.mDaan.setText("答案："+da_an);

                    }else {
                        if (da_an.equals("C")){
                            viewHolder1.mIvC.setBackgroundDrawable(yes);
                            viewHolder1.mIvC.setText("");
                            viewHolder1.mDaan.setText("答案："+da_an);

                        }else {
                            if (da_an.equals("D")){
                                viewHolder1.mIvD.setBackgroundDrawable(yes);
                                viewHolder1.mIvD.setText("");
                                viewHolder1.mDaan.setText("答案："+da_an);

                            }
                        }
                    }
                }
            }
        });
        viewHolder1.mLinB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder1.mIvB.setText("");
                if (da_an.equals("B")){
                    viewHolder1.mIvB.setBackgroundDrawable(yes);
                    viewHolder1.mDaan.setText("答案："+da_an);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                }else {
                    viewHolder1.mIvB.setBackgroundDrawable(no);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                    if (da_an.equals("A")){
                        viewHolder1.mIvA.setBackgroundDrawable(yes);
                        viewHolder1.mIvA.setText("");

                        viewHolder1.mDaan.setText("答案："+da_an);
                    }else {
                        if (da_an.equals("C")){
                            viewHolder1.mIvC.setBackgroundDrawable(yes);
                            viewHolder1.mIvC.setText("");
                            viewHolder1.mDaan.setText("答案："+da_an);
                        }else {
                            if (da_an.equals("D")){
                                viewHolder1.mIvD.setBackgroundDrawable(yes);
                                viewHolder1.mIvD.setText("");
                                viewHolder1.mDaan.setText("答案："+da_an);

                            }
                        }
                    }
                }
            }
        });
        viewHolder1.mLinC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder1.mIvC.setText("");
                if (da_an.equals("C")){
                    viewHolder1.mIvC.setBackgroundDrawable(yes);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                    viewHolder1.mDaan.setText("答案："+da_an);
                }else {
                    viewHolder1.mIvC.setBackgroundDrawable(no);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                    if (da_an.equals("A")){
                        viewHolder1.mIvA.setBackgroundDrawable(yes);
                        viewHolder1.mIvA.setText("");
                        viewHolder1.mDaan.setText("答案："+da_an);
                    }else {
                        if (da_an.equals("B")){
                            viewHolder1.mIvB.setBackgroundDrawable(yes);
                            viewHolder1.mIvB.setText("");
                            viewHolder1.mDaan.setText("答案："+da_an);
                        }else {
                            if (da_an.equals("D")){
                                viewHolder1.mIvD.setBackgroundDrawable(yes);
                                viewHolder1.mIvD.setText("");
                                viewHolder1.mDaan.setText("答案："+da_an);
                            }
                        }
                    }
                }
            }
        });
        viewHolder1.mLinD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder1.mIvD.setText("");
                if (da_an.equals("D")){
                    viewHolder1.mIvD.setBackgroundDrawable(yes);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                    viewHolder1.mDaan.setText("答案："+da_an);
                }else {
                    viewHolder1.mIvD.setBackgroundDrawable(no);
                    viewHolder1.mlin_xiangjie.setVisibility(View.VISIBLE);
                    if (da_an.equals("A")){
                        viewHolder1.mIvA.setBackgroundDrawable(yes);
                        viewHolder1.mIvA.setText("");
                        viewHolder1.mDaan.setText("答案："+da_an);
                    }else {
                        if (da_an.equals("B")){
                            viewHolder1.mIvB.setBackgroundDrawable(yes);
                            viewHolder1.mIvB.setText("");
                            viewHolder1.mDaan.setText("答案："+da_an);
                        }else {
                            if (da_an.equals("C")){
                                viewHolder1.mIvC.setBackgroundDrawable(yes);
                                viewHolder1.mIvC.setText("");
                                viewHolder1.mDaan.setText("答案："+da_an);
                            }
                        }
                    }
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class MyHolder1 extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_desc)
        TextView mTvDesc;
        @BindView(R.id.iv_A)
        TextView mIvA;
        @BindView(R.id.tv_A)
        TextView mTvA;
        @BindView(R.id.lin_A)
        LinearLayout mLinA;
        @BindView(R.id.iv_B)
        TextView mIvB;
        @BindView(R.id.tv_B)
        TextView mTvB;
        @BindView(R.id.lin_B)
        LinearLayout mLinB;
        @BindView(R.id.iv_C)
        TextView mIvC;
        @BindView(R.id.tv_C)
        TextView mTvC;
        @BindView(R.id.lin_C)
        LinearLayout mLinC;
        @BindView(R.id.iv_D)
        TextView mIvD;
        @BindView(R.id.tv_D)
        TextView mTvD;
        @BindView(R.id.lin_D)
        LinearLayout mLinD;
        @BindView(R.id.daan)
        TextView mDaan;
        @BindView(R.id.xiangjie_tv)
        TextView mXiangjie_tv;
        @BindView(R.id.lin_xiangjie)
        LinearLayout mlin_xiangjie;
        public MyHolder1(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }



}
