package com.example.filmuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayfa6 extends AppCompatActivity {
    Button dublaj1;
    Button altyazi1;
    Button dublaj2;
    Button altyazi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa6);
        dublaj1=findViewById(R.id.button28);
        altyazi1=findViewById(R.id.button29);
        dublaj2=findViewById(R.id.button30);
        altyazi2=findViewById(R.id.button31);
        altyazi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/oluler-ordusu-altyazili-izle");
            }
        });
        dublaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/oluler-ordusu-turkce-dublaj-izle");
            }
        });
        altyazi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/venom-let-there-be-carnage-altyazili-izle");
            }
        });
        dublaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/venom-let-there-be-carnage-turkce-dublaj-izle");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}