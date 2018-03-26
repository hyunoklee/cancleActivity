package com.example.hyunok.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityTest extends AppCompatActivity {

    public static AppCompatActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = MainActivityTest.this;

        Intent intent;
        intent = new Intent(this, SubActivity.class);

        startActivity(intent);

    }
}
