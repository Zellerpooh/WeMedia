package com.zeller.library.widget.imageloader;

import android.widget.ImageView;

/**
 * Class description goes here.
 * 这里是图片加载配置信息的基类,可以定义一些所有图片加载框架都可以用的通用参数
 * @author Zeller
 * @version 1.0.0  17/4/14
 * @date 17/4/14
 */

public class ImageConfig {
    protected String url;
    protected ImageView imageView;
    protected int placeholder;
    protected int errorPic;


    public String getUrl() {
        return url;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public int getErrorPic() {
        return errorPic;
    }
}
