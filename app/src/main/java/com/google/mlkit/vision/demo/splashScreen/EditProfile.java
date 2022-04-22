package com.google.mlkit.vision.demo.splashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.mlkit.vision.demo.R;

import java.util.Objects;

public class EditProfile extends AppCompatActivity {

    ImageView pic ;
    TextView name , mobile , email_name ;
    FirebaseDatabase database;
    DatabaseReference userref ;
    String Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Intent intent = getIntent();
        Email = intent.getStringExtra("nameadress");

        name = findViewById(R.id.name) ;

        mobile = findViewById(R.id.Mobile) ;

        email_name = findViewById(R.id.email) ;

        database = FirebaseDatabase.getInstance() ;

        userref  = database.getReference() ;

        userref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for ( DataSnapshot ds : snapshot.getChildren())
                {
                    if(ds.child("email").getValue().equals(Email))
                    {

                        name.setText(ds.child("name").getValue(String.class));

                        mobile.setText(ds.child("mobile").getValue(String.class));

                        email_name.setText(ds.child("email").getValue(String.class));

                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}

