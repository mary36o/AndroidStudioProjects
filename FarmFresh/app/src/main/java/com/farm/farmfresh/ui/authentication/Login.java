package com.farm.farmfresh.ui.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.farm.farmfresh.Home;
import com.farm.farmfresh.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

    }

    public void Register(View view){

        Intent MyIntent = new Intent(Login.this, Register.class);
        startActivity(MyIntent);

    }
    public void Home(View view){
        Toast.makeText(this, "Login successfully", Toast.LENGTH_SHORT).show();
        Intent MyIntent = new Intent(Login.this, Home.class);
        startActivity(MyIntent);

    }
}