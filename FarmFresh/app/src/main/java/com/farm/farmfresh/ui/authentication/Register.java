package com.farm.farmfresh.ui.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.farm.farmfresh.Home;
import com.farm.farmfresh.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

    }


    public void login(View view) {
        Intent MyIntent = new Intent(Register.this, Login.class);
        startActivity(MyIntent);
        finish();
    }
    public void Home(View view) {
        Toast.makeText(this, "Registration Successful,Welcome Home", Toast.LENGTH_SHORT).show();
        Intent MyIntent = new Intent(Register.this, Home.class);
        startActivity(MyIntent);
        finish();
    }
}