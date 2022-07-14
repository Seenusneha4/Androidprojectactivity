package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    Button frstbtn;
    Button secndbtn;
    Button thirdbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        frstbtn = findViewById(R.id.frstbtn);
        secndbtn = findViewById(R.id.secondbtn);
        thirdbtn = findViewById(R.id.thirdbtn);
        frstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Intent=new Intent(ButtonActivity.this,LoginActivity.class);
                startActivity(Intent);
            }
        });

        secndbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Intent=new Intent(ButtonActivity.this,RegActivity.class);
                startActivity(Intent);
            }
        });

        thirdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Intent=new Intent(ButtonActivity.this,FacebookActivity.class);
                startActivity(Intent);
            }
        });
    }
}