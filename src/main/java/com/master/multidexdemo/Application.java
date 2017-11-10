package com.master.multidexdemo;

import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by littonishir on 2017/11/10.
 */

public class Application extends android.app.Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        //第一种初始化方法,重写attachBaseContext方法,初始化MultiDex.
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
