package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class categoryPage extends AppCompatActivity {
ImageButton back_btn;
CardView cate_item1,cate_item2,cate_item3,cate_item4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);
        cate_item1=findViewById(R.id.cate_item1);
        cate_item2=findViewById(R.id.cate_item2);
        cate_item3=findViewById(R.id.cate_item3);
        cate_item4=findViewById(R.id.cate_item4);
        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(categoryPage.this,cate_Burger.class);
                startActivity(i2);
            }
        });
        cate_item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(categoryPage.this,cate_Burger.class);
                startActivity(i2);
            }
        });
        cate_item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(categoryPage.this,cate_Biryani.class);
                startActivity(i2);
            }
        });
        cate_item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(categoryPage.this,cate_Handi.class);
                startActivity(i2);
            }
        });
        cate_item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(categoryPage.this,cate_Chinese.class);
                startActivity(i2);
            }
        });
    }
}