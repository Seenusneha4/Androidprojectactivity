package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {

    EditText namET;
    EditText addET;
    EditText noET;
    EditText emilET;
    EditText passET;
    Button regBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        namET = findViewById(R.id.naEditText);
        addET = findViewById(R.id.addrEditText);
        noET = findViewById(R.id.noEditText);
        emilET = findViewById(R.id.emilEditText);
        passET = findViewById(R.id.passEditText);
        regBTN = findViewById(R.id.regibtn);

        regBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = namET.getText().toString();
                String address = addET.getText().toString();
                String phnno= noET.getText().toString();
                String email = emilET.getText().toString();
                String passwrd = passET.getText().toString();

               // register(name,address,phnno,email,passwrd);
            }
        });
    }

    private void register(String name, String address, String phnno, String email, String passwrd) {
    }
}