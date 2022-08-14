package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        TextView tvout = findViewById(R.id.tvoutput);
        Intent i = getIntent();
        String text = i.getStringExtra(productPage.ExtraET1);
        tvout.setText(text);
    }
}