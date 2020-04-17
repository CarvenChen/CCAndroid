package com.example.a17_progressbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mProgress = 0;
    Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final ProgressBar progressBar = findViewById(R.id.progressBar);

        mHandler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what == 0x111) {
                    progressBar.setProgress(mProgress);
                } else {
                    Toast.makeText(MainActivity.this, "耗时操作已完成", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                }
            }

        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    mProgress = doWork();
                    Message message = new Message();
                    if (mProgress < 100) {
                        message.what = 0x111;
                        mHandler.sendMessage(message);
                    } else {
                        message.what = 0x110;
                        mHandler.sendMessage(message);
                        break;
                    }
                }
            }

            private int doWork() {
                mProgress += Math.random()*10;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return  mProgress;
            }
        }).start();

    }
}
