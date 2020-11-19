package com.markazmoshavereh.kamyab.kerman1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText edtnumber=findViewById(R.id.edtnumber);
        Button btnsave=findViewById(R.id.btnsave);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                try
                {
                    String number=edtnumber.getText().toString();
                    double str1 = Double.parseDouble(number);
                    intent.putExtra("number",str1);
                    startActivity(intent);

                }
                catch(Exception ex)
                {
                    Double str1=10.0;
                }

            }
        });
    }
}