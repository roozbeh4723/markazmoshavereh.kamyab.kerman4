package com.markazmoshavereh.kamyab.kerman1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        Button btnyes=findViewById(R.id.btnyes);
        Button btnno=findViewById(R.id.btnno);


        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String family=intent.getStringExtra("family");
        String gender=intent.getStringExtra("gender");
        Float age=intent.getFloatExtra("age",0);
        String age1=new Float(age).toString();
        String education=intent.getStringExtra("education");

        String address=intent.getStringExtra("address");
        Float phone=intent.getFloatExtra("phone",20);
        String phone1=new Float(phone).toString();
       txtname.setText(name);
        txtfamily.setText(family);
        txtgender.setText(gender);
        txtage.setText(age1);
        txteducation.setText(education);
        txtaddress.setText(address);
        txtphone.setText(phone1);

        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent();
                intent2.putExtra("yes","true");
                setResult(Activity.RESULT_OK,intent2);
                Toast.makeText(destination.this,"اطلاعات شما با موفقیت ذخیره شد!",Toast.LENGTH_LONG).show();
            finish();
            }
        });
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent();
                intent2.putExtra("no",false);
                setResult(Activity.RESULT_OK,intent2);
                finish();
            }
        });

;    }
}