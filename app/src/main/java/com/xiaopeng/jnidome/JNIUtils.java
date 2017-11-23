package com.xiaopeng.jnidome;

import android.content.Context;

/**
 * Created by xiaopeng on 2017/8/31.
 */

public class JNIUtils {

    static {
        System.loadLibrary("JniTest");
    }

    public static native String sayHello(Context context);

}
