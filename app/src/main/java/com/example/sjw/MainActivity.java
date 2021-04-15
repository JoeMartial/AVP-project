package com.example.sjw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.login).setOnClickListener(v -> {
            startActivity(new Intent(this, Home.class));
            finish();
        });
        findViewById(R.id.sign_up).setOnClickListener(v -> {
            startActivity(new Intent(this, Home.class));
            finish();
        });
    }
}