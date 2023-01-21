package com.example.filmuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayfa8 extends AppCompatActivity {
    Button dublaj1;
    Button altyazi1;
    Button dublaj2;
    Button altyazi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa8);
        dublaj1=findViewById(R.id.button36);
        altyazi1=findViewById(R.id.button37);
        dublaj2=findViewById(R.id.button38);
        altyazi2=findViewById(R.id.button39);


        altyazi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/zone-414-altyazili-izle");
            }
        });
        dublaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/zone-414-altyazili-izle");
            }
        });
        altyazi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/fear-street-part-one-1994-altyazili-izle");
            }
        });
        dublaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/fear-street-part-one-1994-turkce-dublaj-izle");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}