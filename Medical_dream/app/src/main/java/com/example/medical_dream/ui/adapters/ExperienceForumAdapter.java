package com.example.medical_dream.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.medical_dream.R;
import com.example.medical_dream.bean.forum.ExperienceBean;


import java.util.List;

public class ExperienceForumAdapter extends RecyclerView.Adapter<ExperienceForumAdapter.ViewHolder> {

    private Context context;
    private List<ExperienceBean.InfoBean.ArticleBean> article;


    public ExperienceForumAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.experienceforumlayout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.authname.setText(article.get(position).getAuthName());
        holder.addtime.setText(article.get(position).getAddtime());
        holder.title.setText(article.get(position).getTitle());
        holder.message.setText(article.get(position).getContent());
        holder.number.setText(article.get(position).getPing_num());
        Glide.with(context).load(article.get(position).getAuthImg()).apply(new RequestOptions().circleCrop()).into(holder.img);
        List<String> images = article.get(position).getImages();
        if (images!=null){
            String s = images.get(0);
            if (s!=null){
                Glide.with(context).load(s).into(holder.messimg);
                holder.messimg.setVisibility(View.VISIBLE);
            }else{
                holder.messimg.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        if (article!=null){
            return article.size();
        }else{
            return 0;
        }
    }

    public void sendData(List<com.example.medical_dream.bean.forum.ExperienceBean.InfoBean.ArticleBean> article) {

        this.article = article;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        ImageView messimg;
        TextView authname;
        TextView addtime;
        TextView title;
        TextView message;
        TextView number;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            messimg = itemView.findViewById(R.id.messimg);
            authname = itemView.findViewById(R.id.retitle);
            addtime = itemView.findViewById(R.id.addtime);
            title = itemView.findViewById(R.id.title);
            message = itemView.findViewById(R.id.message);
            number = itemView.findViewById(R.id.number);
        }
    }
}
