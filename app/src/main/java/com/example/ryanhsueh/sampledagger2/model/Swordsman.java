package com.example.ryanhsueh.sampledagger2.model;

import javax.inject.Inject;

/**
 * Created by ryanhsueh on 2018/7/27
 */
public class Swordsman {

    @Inject
    public Swordsman() {
    }

    public String fighting() {
        return "飛天御劍流！！";
    }

}
