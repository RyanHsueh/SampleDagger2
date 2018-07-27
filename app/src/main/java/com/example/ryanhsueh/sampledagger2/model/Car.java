package com.example.ryanhsueh.sampledagger2.model;

import android.util.Log;

import com.example.ryanhsueh.sampledagger2.annotation.Diesel;

import javax.inject.Inject;

/**
 * Created by ryanhsueh on 2018/7/26
 */

public class Car {

    private Engine engine;

    @Inject
    public Car(@Diesel Engine engine) {
        this.engine = engine;
    }

    public void run() {
        Log.d("Dagger2", "run: " + engine.work());
    }

}
