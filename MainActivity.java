package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login1,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      getSupportActionBar().hide();

      login1 = findViewById(R.id.login1);
      login1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent1 = new Intent(MainActivity.this,Login_Activity.class);
              startActivity(intent1);
          }
      });

      signup = findViewById(R.id.signup);
      signup.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent2 = new Intent(MainActivity.this,HomeScreen.class);
              startActivity(intent2);
          }
      });
    }
}

