package com.raoj.eventdistribution.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String TAG = "MainActivity";
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button) findViewById(R.id.btnClick);
        btnClick.setOnClickListener(this);
        btnClick.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d(TAG, "MotionEvent.ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.d(TAG, "MotionEvent.ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.d(TAG, "MotionEvent.ACTION_UP");
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick()");
        switch (v.getId()) {
            case R.id.btnClick:
                Log.d(TAG, "点击了按钮");
                break;
        }
    }

}
