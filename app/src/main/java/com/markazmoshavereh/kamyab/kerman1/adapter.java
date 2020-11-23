package com.markazmoshavereh.kamyab.kerman1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<view_holder> {
    ArrayList<String> days1;
    public  adapter(ArrayList<String> days){
     days1=days;
    }
    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {
String days=days1.get(position);
holder.txtday.setText(days);
    }

    @Override
    public int getItemCount() {
        return days1.size();
    }
}
