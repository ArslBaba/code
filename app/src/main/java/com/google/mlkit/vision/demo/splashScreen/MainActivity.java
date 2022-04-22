package com.google.mlkit.vision.demo.splashScreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.vision.demo.R;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Thread splashTread = new Thread()
        {


            @Override

            public void run()
            {

                try
                {

                    sleep(3000);

                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));

                    finish();

                }
                catch (InterruptedException e)
                {

                    e.printStackTrace();

                }


                super.run();

            }

        };
        splashTread.start();





    }




}
