package com.anhthu.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> dsQG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        dsQG = new ArrayList<Country>();
        Country qg1 = new Country("Vietnam","vn",80000000);
        Country qg2 = new Country("USA","usa",180000000);
        Country qg3 = new Country("Lao","lao",10000000);
        dsQG.add(qg1);
        dsQG.add(qg2);
        dsQG.add(qg3);
        // tim dieu khien
        ListView lvQG = findViewById(R.id.listViewNation);
        // Tao adaper
        CountryArrayAdapter adaper;
        adaper = new CountryArrayAdapter(dsQG,this);
        // Gan vao
        lvQG.setAdapter(adaper);
        // Xu ly su kien, nhu bai cu
    }




}