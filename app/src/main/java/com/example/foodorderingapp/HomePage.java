package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {
CardView Home_item1,Home_item2,Home_item3,Home_item4;
ImageButton btn_category,btn_record;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
        btn_category = findViewById(R.id.btn_category);
        Home_item1 = findViewById(R.id.Home_item1);
        Home_item2 = findViewById(R.id.Home_item2);
        Home_item3 = findViewById(R.id.Home_item3);
        Home_item4 = findViewById(R.id.Home_item4);

        Home_item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,prod_Burger.class);
                 startActivity(i);
            }
        });
        Home_item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,prod_Biryani.class);
                startActivity(i);
            }
        });
        Home_item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,prod_Handi.class);
                startActivity(i);
            }
        });
        Home_item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,prod_Chinese.class);
                startActivity(i);
            }
        });
        btn_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(HomePage.this,categoryPage.class);
                startActivity(i2);
            }
        });
    }
}