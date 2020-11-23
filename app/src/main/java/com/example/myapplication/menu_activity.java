package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu_activity extends AppCompatActivity implements View.OnClickListener {
    Button btnMenu1, btnMenu2, btnMenu3, btnMenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_menu_activity);

        btnMenu1 = findViewById(R.id.btnMenu1);
        btnMenu2 = findViewById(R.id.btnMenu2);
        btnMenu3 = findViewById(R.id.btnMenu3);
        btnMenu4 = findViewById(R.id.btnMenu4);
        btnMenu1.setOnClickListener(this);
        btnMenu2.setOnClickListener(this);
        btnMenu3.setOnClickListener(this);
        btnMenu4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.btnMenu1){
            Intent menu1 = new Intent(this, menu_activity1.class);
            startActivity(menu1);
        }
        else if(view.getId() == R.id.btnMenu2){
            Intent menu1 = new Intent(this, menu_activity2.class);
            startActivity(menu1);
        }
        else if(view.getId() == R.id.btnMenu3){
            Intent menu1 = new Intent(this, menu_activity3.class);
            startActivity(menu1);
        }
        else if(view.getId() == R.id.btnMenu4){
            Intent menu1 = new Intent(this, menu_activity4.class);
            startActivity(menu1);
        }
    }
}