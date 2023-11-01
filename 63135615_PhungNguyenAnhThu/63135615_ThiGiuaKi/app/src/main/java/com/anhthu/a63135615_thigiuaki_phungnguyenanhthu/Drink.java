package com.anhthu.a63135615_thigiuaki_phungnguyenanhthu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Drink extends AppCompatActivity {
    private ImageView imageViewDrink;
    private TextView textViewPriceAndName;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        imageViewDrink = findViewById(R.id.imageDrink);
        textViewPriceAndName = findViewById(R.id.textFood);

        Intent intent;
        intent = getIntent();
        if (intent != null && intent.hasExtra("selectDrink")){
             {
                String selectDrink = intent.getStringExtra("selectDrink");
                if (selectDrink.equals("CockTail")) {
                    imageViewDrink.setImageResource(R.drawable.th);
                }
                if (selectDrink.equals("Campuchino")) {
                    imageViewDrink.setImageResource(R.drawable.caphe);
                }
                if (selectDrink.equals("fruit")) {
                    imageViewDrink.setImageResource(R.drawable.drink);
                }
                if (selectDrink.equals("Coca")) {
                    imageViewDrink.setImageResource(R.drawable.coca);
                }
                if (selectDrink.equals("Alcohol")) {
                    imageViewDrink.setImageResource(R.drawable.ruou);
                }

                textViewPriceAndName.setText(selectDrink);
            }

        }
         btn =findViewById(R.id.buttonBack);
         btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Drink.this, MainActivity.class);

                finish();
            }
        });
    }
}