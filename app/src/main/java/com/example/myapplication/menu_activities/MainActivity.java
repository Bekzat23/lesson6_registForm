package com.example.myapplication.menu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText number1, number2;
    Button btnPlus, btnMinus, btnMulti, btnDivide;
    TextView tv_r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mini_calculator);
        number1 = findViewById(R.id.number_1);
        number2 = findViewById(R.id.number_2);

        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMulti = findViewById(R.id.btn_multi);
        btnDivide = findViewById(R.id.btn_divide);

        tv_r = findViewById(R.id.tv_result);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        int result = 0;

        if(view.getId() == R.id.btn_plus){
            result = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());

        } else if (view.getId() == R.id.btn_minus){
            result = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
                    }
        else if (view.getId() == R.id.btn_multi){
            result = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());

        }
        else if (view.getId() == R.id.btn_divide){
            result = Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
        }
        tv_r.setText("Result: "+ result);
    }
}