package com.zeller.library.widget.imageloader;

import android.content.Context;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/14
 * @date 17/4/14
 */

public interface BaseImageLoaderStrategy<T extends ImageConfig> {
    void loadImage(Context ctx, T config);
    void clear(Context ctx, T config);
}
