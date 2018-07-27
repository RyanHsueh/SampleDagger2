package com.example.ryanhsueh.sampledagger2.module;

import com.example.ryanhsueh.sampledagger2.model.Swordsman;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ryanhsueh on 2018/7/27
 */

@Module
public class SwordsmanModule {

    @Provides
    public Swordsman provideSwordsman() {
        return new Swordsman();
    }

}
