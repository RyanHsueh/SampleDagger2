package com.example.ryanhsueh.sampledagger2.module;

import com.example.ryanhsueh.sampledagger2.annotation.Diesel;
import com.example.ryanhsueh.sampledagger2.annotation.Gasoline;
import com.example.ryanhsueh.sampledagger2.model.DieselEngine;
import com.example.ryanhsueh.sampledagger2.model.Engine;
import com.example.ryanhsueh.sampledagger2.model.GasolineEngine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ryanhsueh on 2018/7/26
 */

@Module
public class EngineModule {

    @Provides
    @Diesel
    public Engine provideDieselEngine() {
        return new DieselEngine();
    }

    @Provides
    @Gasoline
    public Engine provideGasolineEngine() {
        return new GasolineEngine();
    }

}
