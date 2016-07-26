package com.draw.practice.utils;

import android.util.Log;

/**
 * Created by xugang on 2016/7/26.
 */
public class L {
    private static String TAG = "======DEBUG=====>";

    private static boolean isDebug = true;

    public static void e(String msg) {
        if (isDebug)
            Log.e(TAG, msg);
    }

    public static void d(String msg) {
        if (isDebug)
            Log.d(TAG, msg);
    }

    public static void i(String msg) {
        if (isDebug)
            Log.i(TAG, msg);
    }

    public static void w(String msg) {
        if (isDebug)
            Log.w(TAG, msg);
    }

    public static void v(String msg) {
        if (isDebug)
            Log.v(TAG, msg);
    }
}
