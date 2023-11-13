package com.anhthu.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyDataModel> dataModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        dataModelList = generateSampleData();

        adapter = new MyAdapter(dataModelList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<MyDataModel> generateSampleData(){
        List<MyDataModel> data = new ArrayList<>();
        data.add(new MyDataModel(R.id.image_view, "Anh Thu", "Developer"));
        data.add(new MyDataModel(R.id.image_view, "Giang", "Data Analyst"));

        return data;
    }
}