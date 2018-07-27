package com.example.ryanhsueh.sampledagger2.module;

import com.example.ryanhsueh.sampledagger2.annotation.ApplicationScope;
import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ryanhsueh on 2018/7/26
 */

@Module
public class GsonModule {

    @ApplicationScope
    @Provides
    public Gson provideGson() {
        return new Gson();
    }

}
