package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userET;
    EditText pswrdET;
    Button lgnBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userET = findViewById(R.id.nameEditText);
        pswrdET = findViewById(R.id.pswrdEditText);
        lgnBTN = findViewById(R.id.lgnbtn);

        lgnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"successfully login",Toast.LENGTH_LONG).show();
            }
        });
    }
}