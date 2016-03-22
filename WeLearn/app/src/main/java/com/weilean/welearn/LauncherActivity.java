package com.weilean.welearn;

import android.app.Activity;
import android.os.Bundle;

import org.xutils.x;

/**
 * Created by 光浩 on 2016/3/22.
 */
public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);
        x.view().inject(this);
    }
}
