package com.anhthu.vieccanlam;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.google.android.gms.tasks.Tasks;

import java.util.List;

public class Adapter extends RecyclerView.Adapter {
    List<Tasks> dataSource;

    public Adapter(List<Tasks> dataSource) {
        this.dataSource = dataSource;
    }

    //
    public final class TaskItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvTenVCL;
        TextView tvNgayHetHan;

        public int position;

        public TaskItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTenVCL = (TextView) itemView.findViewById(R.id.textViewTenVCL);
            tvNgayHetHan = (TextView) itemView.findViewById(R.id.textViewThoiGian);
        }

        @Override
        public void onClick(View v) {
            // lấy vị trí
            int vtClicked = getAdapterPosition();
            // lục ở nguồn dữ liệu
            Tasks taskClicked = dataSource.get(vtClicked);
            // xử lý, ví dụ ở đây ta Toast
            Toast.makeText(v.getContext(), "Bạn vừa chọn việc " + taskClicked.getClass(), Toast.LENGTH_SHORT).show();
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        TaskItemViewHolder viewHolder = new TaskItemViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        TaskItemViewHolder viewHolder = (TaskItemViewHolder) holder;
        viewHolder.position = position;
        Tasks task = dataSource.get(position);
        ((TaskItemViewHolder) holder).tvTenVCL.setText(task.getName());
        ((TaskItemViewHolder) holder).tvNgayHetHan.setText(task.getDate());

    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}