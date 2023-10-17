package com.anhthu.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout mainLayout;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.main_layout);
    }

    public void changeBackgroundColor(View view) {
        int color = Color.rgb(255, 165, 0); // Màu orange
        mainLayout.setBackgroundColor(color);
    }
}