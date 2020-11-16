package com.markazmoshavereh.kamyab.kerman1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class destination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        TextView txtname=findViewById(R.id.txtname);
        TextView txtfamily=findViewById(R.id.txtfamily);
        TextView txtgender=findViewById(R.id.txtgender);
        TextView txtage=findViewById(R.id.txtage);
        TextView txteducation=findViewById(R.id.txteducation);
        TextView txtaddress=findViewById(R.id.txtaddress);
        TextView txtphone=findViewById(R.id.txtphone);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String family=intent.getStringExtra("family");
        String gender=intent.getStringExtra("gender");
        Double age=intent.getDoubleExtra("age",10);
       String age1=new Double(age).toString();
        String education=intent.getStringExtra("education");
        String address=intent.getStringExtra("address");
        Double phone=intent.getDoubleExtra("phone",10);
        String phone1=new Double(phone).toString();
       txtname.setText(name);
        txtfamily.setText(family);
        txtgender.setText(gender);
        txtage.setText(age1);
        txteducation.setText(education);
        txtaddress.setText(address);
        txtphone.setText(phone1);
;    }
}