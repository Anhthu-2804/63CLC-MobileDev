package com.anhthu.a63135615_thigiuaki_phungnguyenanhthu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    ListView listView;
    Button btn;
    String[] actors = {"Lee Min-ho", "Park Shin-hye", "Song Joong-ki", "Jun Ji-hyun"};
    String[] ages = {"34", "31", "36", "40"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);

        listView = findViewById(R.id.listViewActor);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, actors);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int position, long id) {
                Toast.makeText(
                        getBaseContext(),
                        "Ban da chon " + actors[position] + ". Tuổi: " + ages[position] ,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activity2.this, MainActivity.class);

                startActivity(intent1);
            }
        });

    }
}

