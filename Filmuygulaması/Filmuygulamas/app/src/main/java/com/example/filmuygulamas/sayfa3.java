package com.example.filmuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sayfa3 extends AppCompatActivity {

   Button dublaj1;
   Button altyazi1;
   Button dublaj2;
   Button altyazi2;
   Button dublaj3;
   Button altyazi3;
   Button dublaj4;
   Button altyazi4;
   Button dublaj5;
   Button altyazi5;
   Button dublaj6;
   Button altyazi6;
   Button dublaj7;
   Button altyazi7;
   Button dublaj8;
   Button altyazi8;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //du
        setContentView(R.layout.activity_sayfa3);
        dublaj1=findViewById(R.id.button);
        altyazi1=findViewById(R.id.button5);
        dublaj2=findViewById(R.id.button6);
        altyazi2=findViewById(R.id.button7);
        dublaj3=findViewById(R.id.button8);
        altyazi3=findViewById(R.id.button9);
        dublaj4=findViewById(R.id.button10);
        altyazi4=findViewById(R.id.button11);
        dublaj5=findViewById(R.id.button12);
        altyazi5=findViewById(R.id.button13);
        dublaj6=findViewById(R.id.button14);
        altyazi6=findViewById(R.id.button15);
        dublaj7=findViewById(R.id.button17);
        altyazi7=findViewById(R.id.button16);
        dublaj8=findViewById(R.id.button18);
        altyazi8=findViewById(R.id.button19);



        dublaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://www.filmmodu1.com/tom-jerry-turkce-dublaj-izle");
            }
        });
        altyazi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/tom-jerry-altyazili-izle");
            }
        });
        dublaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/hotel-transylvania-2-hd-turkce-dublaj-izle");
            }
        });
        altyazi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/hotel-transylvania-2-hd-altyazili-izle");
            }
        });
        dublaj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/ice-age-turkce-dublaj-izle");
            }
        });
        altyazi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/ice-age-altyazili-izle");
            }
        });
        dublaj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/the-addams-family-2019-turkce-dublaj-izle");
            }
        });
        altyazi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/the-addams-family-2019-altyazili-izle");
            }
        });
        dublaj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/kar-ulkesi2-turkce-dublaj-izle");
            }
        });
        altyazi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/kar-ulkesi2-altyazili-izle");
            }
        });
        dublaj6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/rio-turkce-dublaj-izle");
            }
        });
        altyazi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/rio-altyazili-izle");
            }
        });
        dublaj7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/scoob-hd-full-turkce-dublaj-izle");
            }
        });
        altyazi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/scoob-hd-full-altyazili-izle");
            }
        });
        dublaj8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/trolls-world-tour-turkce-dublaj-izle");
            }
        });
        altyazi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.filmmodu1.com/trolls-world-tour-altyazili-izle");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }




}