package com.lgx.lihandler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;

import java.util.logging.LoggingPermission;


public class MainActivity extends AppCompatActivity {

    private Handler handlerLI;


    Handler handler = new Handler(){
        @Override

        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

              //  Toast.makeText(MainActivity.this, "0"+msg.obj, Toast.LENGTH_SHORT).show();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       /* Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                //初始化Looper
                Looper.prepare();
                //在子线程内部初始化handler即可，发送消息的代码可在主线程任意地方发送
                handler=new Handler(){
                    @Override
                    public void handleMessage(Message msg) {
                        super.handleMessage(msg);
                        //所有的事情处理完成后要退出looper，即终止Looper循环
                        //这两个方法都可以，有关这两个方法的区别自行寻找答案
                        handler.getLooper().quit();
                       // handler.getLooper().quitSafely();
                    }
                };

                //启动Looper循环
                Looper.loop();
            }
        };
        thread.start();*/


        
        new Thread(new Runnable() {


            @Override
            public void run() {
                Looper.prepare();
                handlerLI = new Handler(){
                    @Override
                    public void handleMessage(@NonNull Message msg) {
                        super.handleMessage(msg);
                        Toast.makeText(MainActivity.this, msg.obj+"", Toast.LENGTH_SHORT).show();
                    }
                };
                Looper.loop();
            }
        }).start();



        new Thread(new Runnable() {
            @Override
            public void run() {

                Message obtain = Message.obtain();
                obtain.obj = "liguixiao";
               // handlerLI.sendMessage(obtain);
               // handler.sendMessage(obtain);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, "8888888888888", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        }).start();

    }
}
