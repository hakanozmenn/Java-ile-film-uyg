package com.example.filmuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayfa5 extends AppCompatActivity {
    Button dublaj1;
    Button altyazi1;
    Button dublaj2;
    Button altyazi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa5);
        dublaj1=findViewById(R.id.button20);
        altyazi1=findViewById(R.id.button21);
        dublaj2=findViewById(R.id.button25);
        altyazi2=findViewById(R.id.button27);

        altyazi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/fantasy-island-altyazili-izle");
            }
        });
        dublaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/fantasy-island-turkce-dublaj-izle");
            }
        });
        altyazi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("filmmodu1.com/a-babysitter-s-guide-to-monster-hunting-altyazili-izle");
            }
        });
        dublaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/a-babysitter-s-guide-to-monster-hunting-turkce-dublaj-izle");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}