package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity2 extends AppCompatActivity {

    EditText usernET;
    EditText passwrdET;
    Button logBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        usernET = findViewById(R.id.usrEditText);
        passwrdET = findViewById(R.id.pwrdEditText);
        logBTN = findViewById(R.id.lognbtn);
        logBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity2.this, "login successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}