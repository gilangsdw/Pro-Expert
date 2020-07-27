package com.example.proexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Intent intent;
    TextView tvDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvDaftar = (TextView) findViewById(R.id.tvDaftar);

      tvDaftar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


              switch (v.getId()){
                  case R.id.tvDaftar:
                      intent = new Intent(Login.this, Register.class);
                      break;
              }
              startActivity(intent);

          }
      });


    }
}