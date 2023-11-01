package com.anhthu.a63135615_thigiuaki_phungnguyenanhthu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    ListView listViewDrink;

    String[] drink = {"CockTail", "Campuchino", "fruit", "Coca", "Alcohol" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);

    listViewDrink = findViewById(R.id.lstDrink);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,drink);
        listViewDrink.setAdapter(adapter);

        listViewDrink.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectDrink = (String) parent.getItemAtPosition(position);
                Toast.makeText(Activity3.this, "selectDrink", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Activity3.this, Drink.class);
                intent.putExtra("selectDrink", selectDrink); // chuyen dl
                startActivity(intent);

            }
        });



    }
}
