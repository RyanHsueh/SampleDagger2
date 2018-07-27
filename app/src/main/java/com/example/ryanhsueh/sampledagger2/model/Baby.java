package com.example.ryanhsueh.sampledagger2.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by ryanhsueh on 2018/7/26
 */
public class Baby {

    @Inject
    public Baby(){

    }
    public void cry(){
        Log.d("Dagger2","Baby cry~~~");
    }

}
