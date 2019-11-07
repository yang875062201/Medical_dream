package com.example.medical_dream.ui.activity.denglu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.medical_dream.R;

import java.util.Timer;
import java.util.TimerTask;

public class StartUpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        ToStart();
    }
    private void ToStart() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

//                boolean isFirst = SharedPrefrenceUtils.getBoolean(StartUpActivity.this, "isFirst");
//                if (!isFirst) {
//                    MyApplication.openActivity(StartUpActivity.this, WelComeActivity.class);
//                    finish();
//                    return;
//                }
//
//                MyApplication.openActivity(StartUpActivity.this, AdvertisementActivity.class);
//                finish();
                startActivity(new Intent(StartUpActivity.this,LoginActivity.class));
            }
        };
        timer.schedule(task, 2000);//第一次执行前的毫秒延迟时间。在随后的执行之间毫秒内的时间

    }
}
