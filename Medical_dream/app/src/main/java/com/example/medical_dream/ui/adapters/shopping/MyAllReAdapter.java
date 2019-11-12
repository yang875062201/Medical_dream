package com.example.medical_dream.ui.adapters.shopping;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.medical_dream.R;
import com.example.medical_dream.bean.shopping.AllBean;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ren on 2019/11/8.
 */

public class MyAllReAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<AllBean.InfoBean.CourseBean> list1 = new ArrayList<>();
    private List<AllBean.InfoBean.ShopBean> list2 = new ArrayList<>();
    private int ITEM1=0;
    private int ITEM2=1;

    public MyAllReAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == ITEM1){
            return new MyHolder1(LayoutInflater.from(context).inflate(R.layout.layout_shopping_adapter,viewGroup,false));
        }else {
            return new MyHolder2(LayoutInflater.from(context).inflate(R.layout.layout_shopping_adapter2,viewGroup,false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType==ITEM1){
            MyHolder1 myHolder1= (MyHolder1) viewHolder;
            myHolder1.tv1.setText(list2.get(i).getName());
            myHolder1.tv2.setText("预售");
            myHolder1.tv3.setText("教务微信");
            myHolder1.tv4.setText("yinyanmengapp");
            myHolder1.tv5.setText("￥ "+list2.get(i).getXian_price());
            Glide.with(context).load(list2.get(i).getPic()).into(myHolder1.image);
        }else {
            List<String> type_str = list1.get(i-list2.size()).getType_str();
            MyHolder2 myHolder2 = (MyHolder2) viewHolder;
            myHolder2.tv1.setText(list1.get(i-list2.size()).getName());
            for (int j = 0; j < type_str.size(); j++) {
                myHolder2.tv2.setText(type_str.get(j));
            }
            myHolder2.tv3.setText("￥ "+list1.get(i-list2.size()).getYuan_jia_ge());
            Glide.with(context).load(list1.get(i-list2.size()).getPic()).into(myHolder2.image);
        }
    }

    @Override
    public int getItemCount() {
        return list1.size()+list2.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position<=(list2.size()-1)){
            return ITEM1;
        }else {
            return ITEM2;
        }
    }

    public void setData(AllBean.InfoBean info) {
        List<AllBean.InfoBean.CourseBean> course = info.getCourse();
        List<AllBean.InfoBean.ShopBean> shop = info.getShop();
        list1.addAll(course);
        list2.addAll(shop);
        notifyDataSetChanged();
    }

    class MyHolder1 extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        TextView tv5;
        public MyHolder1(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.all_image);
            tv1 = itemView.findViewById(R.id.all_tv1);
            tv2 = itemView.findViewById(R.id.all_tv2);
            tv3 = itemView.findViewById(R.id.all_tv3);
            tv4 = itemView.findViewById(R.id.all_tv4);
            tv5 = itemView.findViewById(R.id.all_tv5);
        }
    }

    class MyHolder2 extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv1;
        TextView tv2;
        TextView tv3;
        public MyHolder2(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.alls_image);
            tv1 = itemView.findViewById(R.id.alls_tv1);
            tv2 = itemView.findViewById(R.id.alls_tv2);
            tv3 = itemView.findViewById(R.id.alls_tv3);
        }
    }
}
