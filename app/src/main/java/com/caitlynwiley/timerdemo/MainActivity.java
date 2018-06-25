package com.caitlynwiley.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Handler", "A second passed");
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);*/

        new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilDone) {
                Log.i("Time Left", Long.toString(millisUntilDone / 1000));
            }

            public void onFinish() {
                Log.i("Time Left", "Time is up!");
            }
        }.start();
    }
}
