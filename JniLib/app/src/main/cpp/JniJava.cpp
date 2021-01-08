#include "JniJava.h"

#include <jni.h>
#include <string>
extern "C"
jstring Java_com_aite_jnilib_JniJava_getCString(JNIEnv * env, jobject object){
    // 注意这里创建的是C文件 所以必须以C语言格式去编写
    return env->NewStringUTF("我来自C底层");
}

