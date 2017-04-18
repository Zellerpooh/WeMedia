package com.zeller.library.widget.imageloader;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/14
 * @date 17/4/14
 */
@Singleton
public final class ImageLoader {
    private BaseImageLoaderStrategy mStrategy;

    @Inject
    public ImageLoader(BaseImageLoaderStrategy strategy) {
        setLoadImgStrategy(strategy);
    }


    public <T extends ImageConfig> void loadImage(Context context, T config) {
        this.mStrategy.loadImage(context, config);
    }

    public <T extends ImageConfig> void clear(Context context, T config) {
        this.mStrategy.clear(context, config);
    }


    public void setLoadImgStrategy(BaseImageLoaderStrategy strategy) {
        this.mStrategy = strategy;
    }

}