package com.anhthu.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<MyDataModel> dataModelList;
    private Context context;

    public MyAdapter(List<MyDataModel> dataModelList, Context context) {
        this.dataModelList = dataModelList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyDataModel dataModel = dataModelList.get(position);
        holder.imageView.setImageResource(dataModel.getAvatarResource());
        holder.textView1.setText(dataModel.getName());
        holder.textView2.setText(dataModel.getInfo());
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }
}
