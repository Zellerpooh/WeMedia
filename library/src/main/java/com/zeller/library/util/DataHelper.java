package com.zeller.library.util;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/14
 * @date 17/4/14
 */

public class DataHelper {
    /**
     * 返回缓存文件夹
     */
    public static File getCacheFile(Context context) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            File file = null;
            file = context.getExternalCacheDir();//获取系统管理的sd卡缓存文件
            if (file == null) {//如果获取的为空,就是用自己定义的缓存文件夹做缓存路径
                file = new File(getCacheFilePath(context));
                makeDirs(file);
            }
            return file;
        } else {
            return context.getCacheDir();
        }
    }

    /**
     * 获取自定义缓存文件地址
     * @param context
     * @return
     */
    public static String getCacheFilePath(Context context) {
        String packageName = context.getPackageName();
        return "/mnt/sdcard/" + packageName;
    }

    /**
     * 创建未存在的文件夹
     * @param file
     * @return
     */
    public static File makeDirs(File file){
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
