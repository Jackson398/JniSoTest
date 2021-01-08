package com.aite.jnilib;

public class JniJava {
    static {
        System.loadLibrary("LibJni");
    }

    /**
     * java层,通过该方法从C层获取到一个字符串
     *
     * @return
     */
    public native String getCString();
}
