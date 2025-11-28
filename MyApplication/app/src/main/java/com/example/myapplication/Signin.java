package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signin);

    }

public void Register(View view){
    Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    Intent MyIntent = new Intent(Signin.this, Signup.class);
    startActivity(MyIntent);
}


    public void Login(View view){

        Toast.makeText(this, "Login successfully", Toast.LENGTH_SHORT).show();
        Intent MyIntent = new Intent(Signin.this, Home.class);
        startActivity(MyIntent);


    }


    }
