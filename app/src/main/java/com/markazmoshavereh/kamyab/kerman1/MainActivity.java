package com.markazmoshavereh.kamyab.kerman1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

private static  final int REQUEST_CALL=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtname=findViewById(R.id.edtname);
        EditText edtfamily=findViewById(R.id.edtfamily);
         EditText edtage=findViewById(R.id.edtage);
         EditText edteducation=findViewById(R.id.edteducation);
         EditText edtaddress=findViewById(R.id.edtaddress);
         EditText edtphone=findViewById(R.id.edtphone);
        TextView txtweb=findViewById(R.id.txtweb);
        TextView txtphone=findViewById(R.id.txtphone);
        VideoView vv=findViewById(R.id.vv);
        Button btnsave=findViewById(R.id.btnsave);
        Button btncancel=findViewById(R.id.btncancel);
        RadioButton ratman=findViewById(R.id.ratman);
        RadioButton ratwoman=findViewById(R.id.ratwoman);






       // String url="https://hw5.cdn.asset.aparat.com/aparat-video/4de349c9c7f4ea214de56a29c217fbf826490120-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImJlYjRjNzFiMjFkZGVhMTgwZWUyNGNkODFlNjAwYjZlIiwiZXhwIjoxNjA1NDc0ODcyLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.I0bLU8E3bj-QEGxYaCPHO78WKMtlTfRJT6mv_SgC2Io";
        //vv.setMediaController(new MediaController(this));
        //vv.setVideoURI(Uri.parse(url));
       // vv.start();
        //WebView web = findViewById(R.id.web);
        //web.getSettings().setJavaScriptEnabled(true);
        //web.setWebViewClient(new WebViewClient());
        //web.loadUrl("https://www.nedayemehr.ir/psychological-counseling-centers");
        btnsave.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "اطلاعات با موفقیت ذخیره شد!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, destination.class);
                String name = edtname.getText().toString();
                intent.putExtra("name", name);
                String family = edtfamily.getText().toString();
                intent.putExtra("family", family);
                double age = Double.parseDouble(edtage.getText().toString());
                intent.putExtra("age",age);
                String education=edteducation.getText().toString();
                intent.putExtra("education",education);
                String address=edtaddress.getText().toString();
                intent.putExtra("address",address);
                Double phone=Double.parseDouble((edtphone).getText().toString());
                intent.putExtra("phone",phone);
                startActivity(intent);





            }


    });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"انصراف!" ,Toast.LENGTH_SHORT).show();
            }
        });

        txtweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.nedayemehr.ir/psychological-counseling-centers"));
            startActivity(intent1);
            }
        });
        txtphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}