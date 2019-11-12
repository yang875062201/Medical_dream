package com.example.medical_dream.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import com.bumptech.glide.Glide;
import com.example.medical_dream.R;
import com.example.medical_dream.bean.OfficialForumBean;
import com.example.medical_dream.bean.forum.OfficialBean;


import java.util.List;

public class OfficialForumAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private int i;
    private List<OfficialBean.InfoBean.ArticleBean> article;
    private List<OfficialBean.InfoBean.PlateBean> plate;


    public OfficialForumAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View view = View.inflate(context, R.layout.officialforumfirstlayout, null);
            return new FirstVh(view);
        } else {
            View view = View.inflate(context, R.layout.officialforumnextlayout, null);
            return new NextVh(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            FirstVh firstVh = (FirstVh) holder;
            firstVh.title.setText(plate.get(position).getTitle());
            firstVh.number.setText(plate.get(position).getNum());
            Glide.with(context).load(plate.get(position).getImage()).into(firstVh.img);
        } else {
            NextVh nextVh = (NextVh) holder;
            nextVh.authname.setText(article.get(i).getAuthName());
            nextVh.addtime.setText(article.get(i).getAddtime());
            nextVh.title.setText(article.get(i).getTitle());
            nextVh.message.setText(article.get(i).getContent());
            nextVh.number.setText(article.get(i).getPing_num());
            Glide.with(context).load(article.get(i).getAuthImg()).into(nextVh.img);
            i++;
            if (i == article.size()) {
                i = 0;
                return;
            }
        }
    }

    @Override
    public int getItemCount() {
        if (article != null && plate != null) {
            return article.size() + plate.size();
        } else {
            return 0;
        }
    }

    @Override
    public int getItemViewType(int position) {
        int size = plate.size();
        if (position <= size - 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public void sendData(List<OfficialBean.InfoBean.ArticleBean> article, List<OfficialBean.InfoBean.PlateBean> plate) {
        this.article = article;
        this.plate = plate;
        notifyDataSetChanged();
    }


    class FirstVh extends RecyclerView.ViewHolder {
        TextView title;
        TextView number;
        ImageView img;

        public FirstVh(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            number = itemView.findViewById(R.id.number);
            img = itemView.findViewById(R.id.img);
        }
    }

    class NextVh extends RecyclerView.ViewHolder {
        ImageView img;
        TextView authname;
        TextView addtime;
        TextView title;
        TextView message;
        TextView number;

        public NextVh(@NonNull View itemView) {
            super(itemView);
            authname = itemView.findViewById(R.id.authname);
            addtime = itemView.findViewById(R.id.addtime);
            title = itemView.findViewById(R.id.title);
            message = itemView.findViewById(R.id.message);
            number = itemView.findViewById(R.id.number  );
            img = itemView.findViewById(R.id.img);
        }
    }

}
