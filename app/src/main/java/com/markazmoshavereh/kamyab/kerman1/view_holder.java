package com.markazmoshavereh.kamyab.kerman1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class view_holder extends RecyclerView.ViewHolder{

    TextView txtday;

    public view_holder(@NonNull View itemView) {
        super(itemView);
        txtday=itemView.findViewById(R.id.txtday);
    }
}
