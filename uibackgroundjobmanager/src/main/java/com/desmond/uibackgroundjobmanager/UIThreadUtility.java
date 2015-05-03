package com.desmond.uibackgroundjobmanager;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by desmond on 3/5/15.
 */
public class UIThreadUtility {
    private static Handler mHandler;

    static {
        mHandler = new Handler(Looper.getMainLooper());
    }

    public static void post(Runnable run) {
        mHandler.post(run);
    }

    public static void removePost(Runnable run) {
        mHandler.removeCallbacks(run);
    }
}