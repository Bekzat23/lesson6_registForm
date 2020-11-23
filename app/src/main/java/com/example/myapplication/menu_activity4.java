package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu_activity4 extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu4_design);

        btnBack = findViewById(R.id.Btn_back);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent menu1 = new Intent(this, menu_activity.class);
        startActivity(menu1);
    }
}