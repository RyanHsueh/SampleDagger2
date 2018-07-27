package com.example.ryanhsueh.sampledagger2.component;

import com.example.ryanhsueh.sampledagger2.MainActivity;
import com.example.ryanhsueh.sampledagger2.SecondActivity;
import com.example.ryanhsueh.sampledagger2.annotation.ApplicationScope;
import com.example.ryanhsueh.sampledagger2.module.EngineModule;
import com.example.ryanhsueh.sampledagger2.module.GsonModule;

import dagger.Component;

/**
 * Created by ryanhsueh on 2018/7/26
 */

@ApplicationScope
@Component(modules = {GsonModule.class, EngineModule.class}, dependencies = SwordsmanComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(SecondActivity activity);
}
