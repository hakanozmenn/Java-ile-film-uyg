package com.example.filmuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayfa7 extends AppCompatActivity {

    Button dublaj1;
    Button altyazi1;
    Button dublaj2;
    Button altyazi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa7);

        dublaj1=findViewById(R.id.button32);
        altyazi1=findViewById(R.id.button33);
        dublaj2=findViewById(R.id.button34);
        altyazi2=findViewById(R.id.button35);


        altyazi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/diana-the-musical-altyazili-izle");
            }
        });
        dublaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/diana-the-musical-altyazili-izle");
            }
        });
        altyazi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/tt10525672-hd-altyazili-izle");
            }
        });
        dublaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/tt10525672-hd-turkce-dublaj-izle");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}