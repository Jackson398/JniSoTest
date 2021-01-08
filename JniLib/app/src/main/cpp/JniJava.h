#ifndef JNILIB_JNIJAVA_H
#define JNILIB_JNIJAVA_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif
JNIEXPORT jstring JNICALL Java_com_aite_jnilib_JniJava_getCString(JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif

#endif //JNILIB_JNIJAVA_H
