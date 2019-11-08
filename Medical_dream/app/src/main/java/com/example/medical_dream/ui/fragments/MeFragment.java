package com.example.medical_dream.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.ui.fragments.mine.adapters.Gradapters;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {

    private int insert[] = {R.drawable.shoucang_my, R.drawable.gouwuche_1, R.drawable.wodedingdan, R.drawable.shouhuodizhi
            , R.drawable.wodekecheng, R.drawable.pinglun, R.drawable.zaixianzixun, R.drawable.lianxikefu
            , R.drawable.guanyuwomen};
    private String[] text = {"我的收藏", "购物车", "收货地址", "视频记录", "离线缓存", "关于我们", "在线咨询", "联系客服", "技术支持"};
    private View view;
    private ImageView mImgtitle;
    /**
     * 解放军医学院
     */
    private TextView mTvSchool;
    private ImageView mImgSet;
    private GridView mGridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_me, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        mImgtitle = (ImageView) inflate.findViewById(R.id.imgtitle);
        mTvSchool = (TextView) inflate.findViewById(R.id.tv_school);
        mImgSet = (ImageView) inflate.findViewById(R.id.img_set);
        mGridView = (GridView) inflate.findViewById(R.id.gridView);
        mGridView.setAdapter(new Gradapters(getContext(),insert,text));
    }
}
