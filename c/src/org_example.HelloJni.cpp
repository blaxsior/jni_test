#include <jni.h>
#include "org_example_HelloJni.h"

JNIEXPORT jint JNICALL Java_org_example_HelloJni_add(JNIEnv *, jobject, jint a, jint b) {
    return a + b;
}