package com.markazmoshavereh.kamyab.kerman1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtname = findViewById(R.id.edtname);
        EditText edtfamily = findViewById(R.id.edtfamily);
        EditText edtage = findViewById(R.id.edtage);
        EditText edteducation = findViewById(R.id.edteducation);
        EditText edtaddress = findViewById(R.id.edtaddress);
        EditText edtphone = findViewById(R.id.edtphone);
        TextView txtweb = findViewById(R.id.txtweb);
        TextView txtphone = findViewById(R.id.txtphone);
        VideoView vv = findViewById(R.id.vv);
        Button btnsave = findViewById(R.id.btnsave);
        Button btncancel = findViewById(R.id.btncancel);
        RadioButton ratman = findViewById(R.id.ratman);
        RadioButton ratwoman = findViewById(R.id.ratwoman);
        RecyclerView recycler_view=findViewById(R.id.recycler_view);
        ArrayList days=new ArrayList<String>();
        days.add("شنبه");
        days.add("یکشنبه");
        days.add("دو شنبه");
        days.add("سه شنبه");
        days.add("چهار شنبه");
        days.add("پنجشنبه");
        Intent intent1=new Intent(MainActivity.this,service_bf.class);
        ContextCompat.startForegroundService(MainActivity.this,intent1);


        adapter adapter=new adapter(days);
        recycler_view.setAdapter(adapter);
        recycler_view.setHasFixedSize(true);
        GridLayoutManager gm = new GridLayoutManager(MainActivity.this,3,RecyclerView.VERTICAL,false);
        recycler_view.setLayoutManager(gm);

        String name1=getSharedPreferences("user_profile", Context.MODE_PRIVATE).getString("name","نامشخص!");
        edtname.setText(name1);
        String family1=getSharedPreferences("user_profile",Context.MODE_PRIVATE).getString("family","نامشخص!");
        edtfamily.setText(family1);
        Float age2=getSharedPreferences("user_profile",Context.MODE_PRIVATE).getFloat("age",0f);
        String age3=age2.toString();
        edtage.setText(age3);
        Float phone2=getSharedPreferences("user_profile",Context.MODE_PRIVATE).getFloat("phone",0f);
        String phone3=phone2.toString();
        edtphone.setText(phone3);
        String education1=getSharedPreferences("user_profile",Context.MODE_PRIVATE).getString("education","نا مشخص!");
        edteducation.setText(education1);

        String address1=getSharedPreferences("user_profile",Context.MODE_PRIVATE).getString("address","نامشخص!");
        edtaddress.setText(address1);

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
                Intent intent = new Intent(MainActivity.this, destination.class);
                String name=edtname.getText().toString();
                intent.putExtra("name",name);
                getSharedPreferences("user_profile",Context.MODE_PRIVATE).edit().putString("name",name).apply();

                String family = edtfamily.getText().toString();
                intent.putExtra("family", family);
                getSharedPreferences("user_profile",Context.MODE_PRIVATE).edit().putString("family",family).apply();


try {
    String age=edtage.getText().toString();
    Float age1=Float.parseFloat(age);
    intent.putExtra("age", age1);
    getSharedPreferences("user_profile",Context.MODE_PRIVATE).edit().putFloat("age",age1).apply();
}
catch(Exception ex)
{
    Float age1=10f;
}

                String education = edteducation.getText().toString();
                intent.putExtra("education", education);
                getSharedPreferences("user_profile",Context.MODE_PRIVATE).edit().putString("education",education).apply();


                String address = edtaddress.getText().toString();
                intent.putExtra("address", address);
                getSharedPreferences("user_profile",Context.MODE_PRIVATE).edit().putString("address",address).apply();


                try {
                    String phone = edtphone.getText().toString();
                    Float phone1 = Float.parseFloat(phone);
                    intent.putExtra("phone", phone1);
                    getSharedPreferences("user_profile",Context.MODE_PRIVATE).edit().putFloat("phone",phone1).apply();
                }catch(Exception ex){
                    Float phone1=10.f;
                }




                startActivityForResult(intent, 2000);


            }


        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "انصراف!", Toast.LENGTH_SHORT).show();
            }
        });

        txtweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nedayemehr.ir/psychological-counseling-centers"));
                startActivity(intent1);
            }
        });
        txtphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2000) {
            if (resultCode == Activity.RESULT_OK) {
                boolean yes = data.getBooleanExtra("yes", true);
              String result="";
              if (yes==true){
                  result= "صحت اطلاعات مورد تایید است!";
              }else {
                  result="مجدد تلاش کنید!";
              }
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
            }
        }


    }
}