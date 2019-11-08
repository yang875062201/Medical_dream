package com.example.medical_dream.ui.fragments;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.medical_dream.R;
import com.example.medical_dream.ui.activity.MainActivity;
import com.example.medical_dream.ui.fragments.mine.adapters.Gradapters;

import butterknife.OnTouch;

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
    private int page;
    private View inflate;
    private PopupWindow popupWindow;

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
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                page=i;
                if (page==0){

                }else if (page==1){

                }else if (page==2){

                }else if (page==3){

                }else if (page==4){

                }else if (page==5){

                }else if (page==6){

                }else if (page==7){
                    initpopw();
                }else if (page==8){

                }

            }
        });

    }
    private void initpopw() {

        inflate = View.inflate(getContext(), R.layout.item_mine_img, null);
        popupWindow = new PopupWindow(inflate, GridView.MarginLayoutParams.MATCH_PARENT, GridView.MarginLayoutParams.MATCH_PARENT);
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAsDropDown(inflate, 0, 0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        back(0.5f);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });

        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
               popupWindow.dismiss();
               back(1f);

            }
        });
    }

    private void back(float a) {
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.alpha = a;
        getActivity().getWindow().setAttributes(attributes);

    }

  /*  public boolean onTouch(View v, MotionEvent event) {
        int height = inflate.getHeight();
        int y = (int) event.getY();
        if (event.getAction() == MotionEvent.ACTION_UP) {
            if (y < height) {
                popupWindow.dismiss();
            }
        }
        return true;
    }*/

}
