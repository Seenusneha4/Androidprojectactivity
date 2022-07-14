package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegistrationActivity extends AppCompatActivity {

    EditText nameET;
    EditText phonenoET;
    EditText addressET;
    EditText emailET;
    EditText passwordET;
    Button regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        nameET = findViewById(R.id.nameEditText);
        phonenoET = findViewById(R.id.phonenoEditText);
        addressET = findViewById(R.id.addressEditText);
        emailET = findViewById(R.id.emailEditText);
        passwordET = findViewById(R.id.passwordEditText);
        regBtn = findViewById(R.id.regbtn);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameET.getText().toString();
                String phnno = phonenoET.getText().toString();
                String address = addressET.getText().toString();
                String email = emailET.getText().toString();
                String password = passwordET.getText().toString();

                //Toast.makeText(RegistrationActivity.this, "hyyyy", Toast.LENGTH_SHORT).show();
                register(name,phnno,address,email,password);
            }
        });
    }

    private void register(String name, String phnno, String address, String email, String password) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://192.168.29.91/project/register.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.equals("success")){
                    Intent intent=new Intent(RegistrationActivity.this,LogininActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(RegistrationActivity.this, ""+response, Toast.LENGTH_SHORT).show();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(RegistrationActivity.this, ""+error, Toast.LENGTH_SHORT).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<>();
                params.put("name",name);
                params.put("phnno",phnno);
                params.put("address",address);
                params.put("email",email);
                params.put("password",password);
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(RegistrationActivity.this);
        requestQueue.add(stringRequest);

    }
}