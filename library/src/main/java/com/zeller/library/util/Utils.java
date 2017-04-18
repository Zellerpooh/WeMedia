package com.zeller.library.util;

import android.content.Context;

/**
 * Class description goes here.
 * 使用Util包中相关类需要在application中先初始化该类
 * @author Zeller
 * @version 1.0.0  17/4/14
 * @date 17/4/14
 */

public final class Utils {
    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }
}
