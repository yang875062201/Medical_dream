package com.example.medical_dream.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import com.example.medical_dream.R;
import com.example.medical_dream.ui.fragments.CurriculumFragment;
import com.example.medical_dream.ui.fragments.ForumFragment;
import com.example.medical_dream.ui.fragments.MeFragment;
import com.example.medical_dream.ui.fragments.QuestionFragment;
import com.example.medical_dream.ui.fragments.ShoppingFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout mFrameLayout;
    /**
     * 题库
     */
    private RadioButton mRbQuestion;
    /**
     * 商城
     */
    private RadioButton mRbShopping;
    /**
     * 课程
     */
    private RadioButton mRbCurriculum;
    /**
     * 论坛
     */
    private RadioButton mRbForum;
    /**
     * 我
     */
    private RadioButton mRbMe;
    private FragmentManager manager;
    private ArrayList<Fragment> fragments;
    private static final int TYPE_QUESTION= 0;
    private static final int TYPE_SHOPPING = 1;
    private static final int TYPE_CURRICULUM = 2;
    private static final int TYPE_FORUM = 3;
    private static final int TYPE_ME = 4;
    private int mLastFragmentPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mFrameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        mRbQuestion = (RadioButton) findViewById(R.id.rb_question);
        mRbQuestion.setOnClickListener(this);
        mRbShopping = (RadioButton) findViewById(R.id.rb_shopping);
        mRbShopping.setOnClickListener(this);
        mRbCurriculum = (RadioButton) findViewById(R.id.rb_curriculum);
        mRbCurriculum.setOnClickListener(this);
        mRbForum = (RadioButton) findViewById(R.id.rb_forum);
        mRbForum.setOnClickListener(this);
        mRbMe = (RadioButton) findViewById(R.id.rb_me);
        mRbMe.setOnClickListener(this);
        manager = getSupportFragmentManager();
        initFragments();
        addFragment();
        mRbQuestion.setSelected(true);
        mRbShopping.setSelected(false);
        mRbCurriculum.setSelected(false);
        mRbForum.setSelected(false);
        mRbMe.setSelected(false);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.rb_question:
                mRbQuestion.setSelected(true);
                mRbShopping.setSelected(false);
                mRbCurriculum.setSelected(false);
                mRbForum.setSelected(false);
                mRbMe.setSelected(false);
               switchFragment(TYPE_QUESTION);
                break;
            case R.id.rb_shopping:
                mRbQuestion.setSelected(false);
                mRbShopping.setSelected(true);
                mRbCurriculum.setSelected(false);
                mRbForum.setSelected(false);
                mRbMe.setSelected(false);
                switchFragment(TYPE_SHOPPING);
                break;
            case R.id.rb_curriculum:
                mRbQuestion.setSelected(false);
                mRbShopping.setSelected(false);
                mRbCurriculum.setSelected(true);
                mRbForum.setSelected(false);
                mRbMe.setSelected(false);
                switchFragment(TYPE_CURRICULUM);
                break;
            case R.id.rb_forum:
                mRbQuestion.setSelected(false);
                mRbShopping.setSelected(false);
                mRbCurriculum.setSelected(false);
                mRbForum.setSelected(true);
                mRbMe.setSelected(false);
                switchFragment(TYPE_FORUM);
                break;
            case R.id.rb_me:
                mRbQuestion.setSelected(false);
                mRbShopping.setSelected(false);
                mRbCurriculum.setSelected(false);
                mRbForum.setSelected(false);
                mRbMe.setSelected(true);
                switchFragment(TYPE_ME);
                break;
        }
    }
    private void addFragment() {
        FragmentTransaction transaction = manager.beginTransaction();
        //replace = remove + add()
        transaction.add(R.id.frameLayout, fragments.get(0));
        transaction.commit();
    }
    private void initFragments() {
        fragments = new ArrayList<>();
        fragments.add(new QuestionFragment());
        fragments.add(new ShoppingFragment());
        fragments.add(new CurriculumFragment());
        fragments.add(new ForumFragment());
        fragments.add(new MeFragment());
    }
    private void switchFragment(int type) {
        FragmentTransaction tr = manager.beginTransaction();
        Fragment showFragment = fragments.get(type);
        Fragment hideFragment = fragments.get(mLastFragmentPosition);
        if (!showFragment.isAdded()) {
            //一个Fragment只能添加一次，否则会崩
            tr.add(R.id.frameLayout, showFragment);
        }
        //隐藏上一个
        //这次显示的fragment，就是下一次要隐藏的Fragment
        tr.hide(hideFragment);
        tr.show(showFragment);
        tr.commit();
        //记录当前的Fragment索引，方便下次隐藏
        mLastFragmentPosition = type;
    }
}
