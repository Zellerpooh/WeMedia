package com.zeller.wemedia.common.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.zeller.library.base.BaseApplication;
import com.zeller.library.util.LogUtils;
import com.zeller.wemedia.BuildConfig;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/14
 * @date 17/4/14
 */

public class App extends BaseApplication {

    public static final String DEBUG_TAG = "debug_";

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
        LogUtils.logInit(BuildConfig.DEBUG, DEBUG_TAG);
    }
}
