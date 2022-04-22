package com.google.mlkit.vision.demo.splashScreen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.vision.demo.R;

import java.util.Objects;

public class pythonactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythonactivity);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}