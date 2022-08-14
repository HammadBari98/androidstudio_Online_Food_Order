package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread td = new Thread()
        {
            public void run()
            {
                try{
                    sleep(3000);
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                finally {
                    Intent it = new Intent (splashScreen.this,HomePage.class);
                    startActivity(it);
                }
            }
        };td.start();
    }
}
