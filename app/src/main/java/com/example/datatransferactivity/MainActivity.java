package com.example.datatransferactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String USERNAME = username.getText().toString();
                String PASSWORD = password.getText().toString();
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("keyuser",USERNAME);
                intent.putExtra("KeyPass",PASSWORD);
                startActivity(intent);
            }
        });
    }
}
