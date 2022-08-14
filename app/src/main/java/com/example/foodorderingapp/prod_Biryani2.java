package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class prod_Biryani2 extends AppCompatActivity {
    public static final String ExtraET1 = "com.example.com.example.foodorderingapp";
    int count = 0;
    Button btn_Add,btn_Sub,proceed_btn;
    TextView product_quantity,tot_price;
    ImageButton backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prod_biryani2);
        backBtn = (ImageButton) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(prod_Biryani2.this,HomePage.class);
                startActivity(i);
            }
        });
        product_quantity =(TextView)findViewById(R.id.product_quantity);
        tot_price =(TextView)findViewById(R.id.tot_price);
        btn_Add= (Button)findViewById(R.id.btn_Add);
        btn_Sub= (Button)findViewById(R.id.btn_Sub);
        proceed_btn=(Button)findViewById(R.id.proceed_btn);

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int price = 350;
                double total;
                count ++;
                total = count*price;
                product_quantity.setText(String.valueOf(count));
                tot_price.setText(String.valueOf(total));
            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int price = 350;
                double total;
                if (count >0){
                    count --;

                }
                total = count*price;
                product_quantity.setText(String.valueOf(count));
                tot_price.setText(String.valueOf(total));
            }
        });

        proceed_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(prod_Biryani2.this, proceed.class);
                TextView extra1 = findViewById(R.id.tot_price);
                String e1 = extra1.getText().toString();
                it.putExtra(ExtraET1, e1);
                startActivity(it);
            }
        });
    }
}