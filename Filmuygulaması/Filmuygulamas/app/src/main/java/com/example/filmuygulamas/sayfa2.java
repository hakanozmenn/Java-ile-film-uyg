package com.example.filmuygulamas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class sayfa2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa2);
        textView=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String username=intent.getStringExtra("ad");

        textView.setText(username);
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("MOVIER");
        alert.setMessage("Devam etmek istiyor musun?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(sayfa2.this,"Kategori Seçimi yapınız",Toast.LENGTH_LONG).show();

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(sayfa2.this,"Tekrar giriş yapınız",Toast.LENGTH_LONG).show();
                System.exit(0);
            }
        });
        alert.show();


    }
    public void ileri3 (View view){
        Intent intent=new Intent(sayfa2.this,sayfa3.class);
        startActivity(intent);

    }
    public void komedi (View view){
        Intent intent=new Intent(sayfa2.this,sayfa4.class);
        startActivity(intent);

    }
    public void fantastik (View view){
        Intent intent=new Intent(sayfa2.this,sayfa5.class);
        startActivity(intent);

    }
    public void bilim (View view){
        Intent intent=new Intent(sayfa2.this,sayfa6.class);
        startActivity(intent);

    }
    public void romantik (View view){
        Intent intent=new Intent(sayfa2.this,sayfa7.class);
        startActivity(intent);

    }
    public void gizem (View view){
        Intent intent=new Intent(sayfa2.this,sayfa8.class);
        startActivity(intent);

    }
}