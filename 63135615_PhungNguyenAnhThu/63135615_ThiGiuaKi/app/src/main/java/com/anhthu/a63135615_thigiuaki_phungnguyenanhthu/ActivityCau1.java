package com.anhthu.a63135615_thigiuaki_phungnguyenanhthu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ActivityCau1 extends AppCompatActivity {
    private EditText editTextNumberA, editTextNumberB;
    private Button buttonResult, buttonBack;
    private EditText editTextResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);

        editTextNumberA = findViewById(R.id.editTextNumbera);
        editTextNumberB = findViewById(R.id.editTextNumberb);
        buttonResult = findViewById(R.id.buttonResult);
        buttonBack = findViewById(R.id.buttonBack);
        editTextResult = findViewById(R.id.editResult);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editTextNumberA.getText().toString();
                String b = editTextNumberB.getText().toString();
                if (a.isEmpty() || b.isEmpty() )
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập số vào!", Toast.LENGTH_SHORT).show();
                else {
                    int soa = Integer.parseInt(a);
                    int sob = Integer.parseInt(b);
                    int sum = 0;
                    sum = soa + sob ;
                    editTextResult.setText("Sum: " + sum);
                }
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ActivityCau1.this, MainActivity.class);

                startActivity(intent1);
            }
        });

    }

}
