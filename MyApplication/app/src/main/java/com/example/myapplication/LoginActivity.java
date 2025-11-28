package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);

    }

    public void Singin(View view){
        Toast.makeText(this, "Login successfully", Toast.LENGTH_SHORT).show();
        Intent MyIntent = new Intent(LoginActivity.this, Home.class);
        startActivity(MyIntent);

    }

}