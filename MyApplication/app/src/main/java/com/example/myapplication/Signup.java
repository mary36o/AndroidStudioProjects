package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);


    }

    public void Login(View view){

        Toast.makeText(this, "Login Here we come", Toast.LENGTH_SHORT).show();
        Intent MyIntent = new Intent(Signup.this,Signin.class);
startActivity(MyIntent);


    }



    public void Register(View view){
        Toast.makeText(this, "Registred ", Toast.LENGTH_SHORT).show();

    }
}