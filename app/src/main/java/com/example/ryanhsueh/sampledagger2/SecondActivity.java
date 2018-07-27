package com.example.ryanhsueh.sampledagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ryanhsueh.sampledagger2.model.Swordsman;

import javax.inject.Inject;

import dagger.Lazy;

public class SecondActivity extends AppCompatActivity {

    @Inject
    Swordsman swordsman;

    @Inject
    Lazy<Swordsman> swordsmanLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        App.getActivityComponent().inject(this);

        Log.d("Dagger2", "onCreate: Swordsman --- " + swordsman.fighting());


        Swordsman sm2 = swordsmanLazy.get();
        Log.d("Dagger2", "onCreate: Swordsman 222 --- " + sm2.fighting());
    }
}
