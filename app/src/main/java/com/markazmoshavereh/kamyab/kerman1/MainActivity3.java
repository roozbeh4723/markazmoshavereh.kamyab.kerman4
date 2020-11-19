package com.markazmoshavereh.kamyab.kerman1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView txtnumber=findViewById(R.id.txtnumber);
        Intent intent=getIntent();
        Double number=intent.getDoubleExtra("number",0);
        String number1= number.toString();
        txtnumber.setText(number1);
    }
}