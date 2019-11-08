package com.example.medical_dream.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.medical_dream.R;

import java.util.Timer;
import java.util.TimerTask;

public class TextSwitchView extends TextSwitcher implements ViewSwitcher.ViewFactory{

    private int index= -1;
    private Context context;
    private String[] resources = {"窗前明月光","疑是地上霜","举头望明月","低头思故乡"};
    private Timer timer;

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch(msg.what) {
                case 1:
                    index = next();
                    updateText();
                    break;
            }
            super.handleMessage(msg);
        }
    };

    //自定义View的构造方法
    public TextSwitchView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public TextSwitchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        if (timer == null) {
            timer = new Timer();
        }
        //实现ViewSwitcher.ViewFactory接口方法，创建出TextView并启动动画
        setFactory(this);
        setInAnimation(AnimationUtils.loadAnimation(context, R.anim.in_anim));
        setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.out_anim));
    }

    public void setResources(String[] res) {
        resources = res;
    }

    //这个是自定义View的启动点，从外面传进来的间隔时间，并以此来开启这个定时任务器
    public void setTextStillTime(long time) {
        if (timer == null) {
            timer = new Timer();
        } else {
            timer.scheduleAtFixedRate(new MyTask(), 1, time);
        }
    }

    //启动任务，每间隔time时间发送一个消息给handler更新文字
    private class MyTask extends TimerTask {
        @Override
        public void run() {
            mHandler.sendEmptyMessage(1);
        }
    }

    private int next() {
        int flag = index + 1;
        if (flag > resources.length - 1) {
            flag = flag - resources.length;
        }
        return flag;
    }

    private void updateText() {
        setText(resources[index]);
    }

    @Override
    public View makeView() {
        TextView tv = new TextView(context);
        tv.setTextColor(Color.parseColor("#FF0000"));
        tv.setTextSize(22);
        return tv;
    }
}