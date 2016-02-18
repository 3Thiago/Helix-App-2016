package com.wordpress.priyankvex.helixapp;

import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

/**
 * Created by @priyankvex on 17/2/16.
 */
public class Application extends android.app.Application{

    private static Application mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .diskCacheExtraOptions(480, 800, null)
                .threadPriority(Thread.NORM_PRIORITY - 2) // default
                .tasksProcessingOrder(QueueProcessingType.FIFO) // default
                .denyCacheImageMultipleSizesInMemory()
                .writeDebugLogs()
                .build();
        // Initializing image loader with config
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().init(config);
    }
}
