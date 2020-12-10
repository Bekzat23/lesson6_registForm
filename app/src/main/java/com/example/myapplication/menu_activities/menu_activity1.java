package com.example.myapplication.menu_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class menu_activity1 extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1_design);

        btnBack = findViewById(R.id.Btn_back);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent menu1 = new Intent(this, menu_activity.class);
        startActivity(menu1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_set:
                Toast.makeText(this, "Settings menu clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_refresh:
                Toast.makeText(this, "Refresh menu clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_delete:
                Toast.makeText(this, "Delete menu clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.main_select:
                Toast.makeText(this, "Select menu clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_selectall:
            Toast.makeText(this, "Select All menu clicked", Toast.LENGTH_SHORT).show();
            break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
