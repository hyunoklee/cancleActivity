package com.example.hyunok.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        AppCompatActivity MA = (AppCompatActivity) MainActivityTest.activity;
        MA.finish();


    }
}
