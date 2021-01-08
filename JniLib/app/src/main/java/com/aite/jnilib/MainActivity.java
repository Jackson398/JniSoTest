package com.aite.jnilib;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {
        private static final String TAG = "MainActivity";
        private JniJava jniJava;
        private TextView mTvname;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mTvname = (TextView) findViewById(R.id.tv_name);
            jniJava = new JniJava();
            String cString = jniJava.getCString();
            mTvname.setText("onCreate: 调用jni 获取到的字符串=="+ cString);
        }
}