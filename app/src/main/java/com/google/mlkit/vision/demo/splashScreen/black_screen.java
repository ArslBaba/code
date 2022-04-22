package com.google.mlkit.vision.demo.splashScreen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.vision.demo.R;

import java.util.Objects;

public class black_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_screen);

        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}