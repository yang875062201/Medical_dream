package com.example.medical_dream.ui.adapters.curriculum;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.medical_dream.R;
import com.example.medical_dream.bean.currculumBean.CurriculumBean;
import com.example.medical_dream.view.TextSwitchView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MyCurrAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<String> banner;
    private List<CurriculumBean.InfoBean.GongGaoBean> gong_gao;
    private List<CurriculumBean.InfoBean.KechengBean> kecheng;
    private int BANNER=0;
    private int TEXT=1;
    private int RLV=2;
    public MyCurrAdapter(Context context, List<String> banner, List<CurriculumBean.InfoBean.GongGaoBean>
            gong_gao, List<CurriculumBean.InfoBean.KechengBean> kecheng) {
        this.context = context;
        this.banner = banner;
        this.gong_gao = gong_gao;
        this.kecheng = kecheng;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i==BANNER){
            View view = LayoutInflater.from(context).inflate(R.layout.item_banner_curr, viewGroup, false);
            return new MyHodler1(view);
        }else if (i==TEXT){
            View view = LayoutInflater.from(context).inflate(R.layout.item_text_curr, viewGroup, false);
            return new MyHodler2(view);
        }else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_rlv_curr, viewGroup, false);
            return new MyHodler3(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int type = getItemViewType(i);
        if (type==BANNER){
            MyHodler1 viewHolder1 = (MyHodler1) viewHolder;
            viewHolder1.banner.setImages(banner);
            viewHolder1.banner.setImageLoader(new Glidimage());
            viewHolder1.banner.start();
        }else
        if (type==TEXT){
            MyHodler2 viewHolder1 = (MyHodler2) viewHolder;
            String[] autoRes=new String[gong_gao.size()];
            for (int j = 0; j < gong_gao.size(); j++) {
                autoRes[j]=gong_gao.get(j).getName();
            }


            viewHolder1.switchtext.setResources(autoRes);
            viewHolder1.switchtext.setTextStillTime(3000);
        } else  {
            MyHodler3 viewHolder1 = (MyHodler3) viewHolder;
            Glide.with(context).load(kecheng.get(i-2).getPic()).into(viewHolder1.iv);
            viewHolder1.time.setText(kecheng.get(i-2).getClass_hour()+"课时");
            viewHolder1.title.setText(kecheng.get(i-2).getName());
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j <kecheng.get(i-2).getType_str().size() ; j++) {
               sb.append(kecheng.get(i-2).getType_str().get(j)+"");
            }
            viewHolder1.desc.setText(sb);
        }

    }
    class Glidimage extends ImageLoader {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        }

    @Override
    public int getItemCount() {
        return kecheng.size()+2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return BANNER;
        }else if (position==1){
            return TEXT;
        }else {
            return RLV;
        }
    }
    class  MyHodler1 extends RecyclerView.ViewHolder {

        private final Banner banner;

        public MyHodler1(@NonNull View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.banner_curr);
        }
    }
    class  MyHodler2 extends RecyclerView.ViewHolder {

        private final TextSwitchView switchtext;

        public MyHodler2(@NonNull View itemView) {
            super(itemView);
            switchtext = itemView.findViewById(R.id.switcher2);
        }
    }
    class  MyHodler3 extends RecyclerView.ViewHolder {

        private final ImageView iv;
        private final TextView title;
        private final TextView desc;
        private final TextView time;

        public MyHodler3(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_curr);
            title = itemView.findViewById(R.id.title_curr);
            desc = itemView.findViewById(R.id.desc_curr);
            time = itemView.findViewById(R.id.time_curr);

        }
    }
}
