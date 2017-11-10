package com.master.multidexdemo;


/**
 * Created by littonishir on 2017/11/10.
 *
 * 第二种初始化方法,直接继承MultiDexApplication,初始化MultiDex.
 */

public class MultiDexApplication extends android.support.multidex.MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
