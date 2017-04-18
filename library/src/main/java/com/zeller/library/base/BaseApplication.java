package com.zeller.library.base;

import android.support.multidex.MultiDexApplication;

import com.zeller.library.util.Utils;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/17
 * @date 17/4/17
 */

public class BaseApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
