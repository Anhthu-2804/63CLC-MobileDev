package com.anhthu.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textView1, textView2;
    public ImageView imageView;



    public MyViewHolder(@NonNull View View) {
        super(View);
        textView1 = View.findViewById(R.id.text_view1);
        textView2 = View.findViewById(R.id.text_view2);
        imageView = View.findViewById(R.id.image_view);
    }

}
