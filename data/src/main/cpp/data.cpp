#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_tj_politech_diplom_data_1repository_native_NativeRepositoryImpl_getBaseUrl(JNIEnv *env,
                                                                                jobject thiz) {
    return env->NewStringUTF("base url");
}