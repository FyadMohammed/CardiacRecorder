package com.example.cardiacrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_btn = findViewById(R.id.login_btn2);
        Button register_btn = findViewById(R.id.register_btn2);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    public void loginUser(){
        Intent login_page = new Intent(MainActivity.this,loginActivity.class);
        startActivity(login_page);
    }
    public void registerUser(){
        Intent register_page = new Intent(MainActivity.this,registerActivity.class);
        startActivity(register_page);
    }
}