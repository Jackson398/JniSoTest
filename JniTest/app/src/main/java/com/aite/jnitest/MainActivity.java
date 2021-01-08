package com.aite.jnitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.aite.jnilib.JniJava;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView mTvname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvname = (TextView) findViewById(R.id.tv_name);
        JniJava jniJava = new JniJava();
        mTvname.setText(jniJava.getCString());
    }
}