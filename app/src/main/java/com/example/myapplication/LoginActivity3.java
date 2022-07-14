package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity3 extends AppCompatActivity {

    EditText emailEdT;
    EditText passwordEdT;
    Button logBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        emailEdT = findViewById(R.id.emailEdT);
        passwordEdT = findViewById(R.id.passEditText);
        logBtn = findViewById(R.id.logbtn);
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });


    }

    private void login() {

        Toast.makeText(LoginActivity3.this, "success", Toast.LENGTH_SHORT).show();
    }
}