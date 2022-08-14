package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class cate_Handi extends AppCompatActivity {
    CardView burger_item1,burger_item2;
    ImageButton back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cate_handi);
        back_btn=findViewById(R.id.back_btn);
        burger_item1=findViewById(R.id.burger_item1);
        burger_item2=findViewById(R.id.burger_item2);

        burger_item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(cate_Handi.this,prod_Handi.class);
                startActivity(i);
            }
        });
        burger_item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(cate_Handi.this,prod_Handi2.class);
                startActivity(i2);
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(cate_Handi.this,HomePage.class);
                startActivity(i2);
            }
        });
    }
}