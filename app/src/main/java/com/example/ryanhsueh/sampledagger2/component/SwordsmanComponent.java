package com.example.ryanhsueh.sampledagger2.component;

import com.example.ryanhsueh.sampledagger2.model.Swordsman;
import com.example.ryanhsueh.sampledagger2.module.SwordsmanModule;

import dagger.Component;

/**
 * Created by ryanhsueh on 2018/7/27
 */

@Component(modules = SwordsmanModule.class)
public interface SwordsmanComponent {
    Swordsman getSwordsman();
}
