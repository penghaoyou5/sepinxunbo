package com.sepin.xunbo.base;

import android.app.Application;
import android.content.Context;
import android.test.TouchUtils;

import com.sepin.xunbo.utils.ToastUtil;

/**
 * Created by bjhl on 16/8/14.
 */
public class SeBoApplication extends Application {

    public static Application application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static Application getApplication(){
        return application;
    }

    public static Context getContext(){
        return application.getApplicationContext();
    }

}
