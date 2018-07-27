package com.example.ryanhsueh.sampledagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ryanhsueh.sampledagger2.model.Car;
import com.example.ryanhsueh.sampledagger2.model.Man;
import com.example.ryanhsueh.sampledagger2.model.Baby;
import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Baby baby;

    @Inject
    Car car;

    @Inject
    Gson gson;

    @Inject
    Gson gson1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getActivityComponent().inject(this);

        baby.cry();

        car.run();

        String jsonData = "{'name': 'Ryan', 'age': 33}";
        Man man = gson.fromJson(jsonData, Man.class);
        Log.d("Dagger2", "onCreate: man's name = " + man.getName() + ", age = " + man.getAge());

        Log.d("Dagger2", "onCreate: Gson => " + gson.hashCode() + " --- " + gson1.hashCode());

        onClick();
    }

    private void onClick() {
        findViewById(R.id.btn_jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}
