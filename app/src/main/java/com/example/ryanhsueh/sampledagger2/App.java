package com.example.ryanhsueh.sampledagger2;

import android.app.Application;
import android.content.Context;

import com.example.ryanhsueh.sampledagger2.component.ActivityComponent;
import com.example.ryanhsueh.sampledagger2.component.DaggerActivityComponent;
import com.example.ryanhsueh.sampledagger2.component.DaggerSwordsmanComponent;

/**
 * Created by ryanhsueh on 2018/7/26
 */
public class App extends Application {

    private static Context mApplicationContext;
    private static ActivityComponent mActivityComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationContext = getApplicationContext();
        mActivityComponent = DaggerActivityComponent.builder()
                .swordsmanComponent(DaggerSwordsmanComponent.create()).build();
    }

    public static App get() {
        return (App) mApplicationContext;
    }

    public static ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
