package com.weilean.welearn;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.xutils.x;

/**
 * Created by 光浩 on 2016/3/22.
 */
public class WLApplication  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /*初始化Xutils */
        x.Ext.init(this);
        x.Ext.setDebug(true);
        /*初始化fresco*/
        /*OkHttpClient okHttpClient;
        ImagePipelineConfig config = OkHttpImagePipelineConfigFactory.newBuilder(getApplicationContext(), okHttpClient)
                .build();*/
        Fresco.initialize(getApplicationContext());

    }
}
