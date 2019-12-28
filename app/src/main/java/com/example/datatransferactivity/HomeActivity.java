package com.example.datatransferactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView user,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        user = findViewById(R.id.tuser);
        password = findViewById(R.id.tpassword);
        Intent intent =getIntent();
     String s = intent.getStringExtra("keyuser");
     user.setText(s);
     String s1 = intent.getStringExtra("KeyPass");
     password.setText(s1);

    }
}
