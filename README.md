# MultidexDemo

>由于Android平台的持续增长，Android应用程序的大小也随之增大。当你的应用程序引用库达到一定的规模，就会出错（64K）：

MultiDex解决Android64K方法限制

### 1.添加依賴

```gradle
 //添加multidex依賴
    compile 'com.android.support:multidex:1.0.2'
```

### 2.开启multidex支持

```gradle
 //开启multidex支持
        multiDexEnabled true
```

### 3.初始化multidex

第一种初始化方法,重写attachBaseContext方法,初始化

```java
package com.master.multidexdemo;

import android.content.Context;
import android.support.multidex.MultiDex;

public class Application extends android.app.Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        
        MultiDex.
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
```

第二种初始化方法,直接继承MultiDexApplication,初始化

```java
package com.master.multidexdemo;

public class MultiDexApplication extends android.support.multidex.MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
```

### 4.清单文件中配置Application:name

配置Application:name,用哪种初始化方法即填写哪个配置Application:name

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.master.multidexdemo">

    <application
        android:name=".Application"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```

### 5.检查是否成功
如图所示有许多dex dex4 ...恭喜你成功
![20171110105600.jpg](http://upload-images.jianshu.io/upload_images/1074123-63a9908a6eb2e87f.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- [源码地址](https://github.com/littonishir/MultidexDemo)