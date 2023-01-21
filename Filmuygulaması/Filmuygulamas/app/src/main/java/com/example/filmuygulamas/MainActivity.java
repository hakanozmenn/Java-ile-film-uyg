package com.example.filmuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Edittext;
    EditText Edittext2;
    String username;
    Button facebook;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edittext=findViewById(R.id.editTextTextPersonName2);
        Edittext2=findViewById(R.id.editTextNumberPassword2);

        username="";
        Toast.makeText(MainActivity.this,"Film Kitaplığına Hoşgeldiniz",Toast.LENGTH_LONG).show();
        //facebook ıcın go to url
        facebook=findViewById(R.id.button2);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://www.facebook.com/Movierapp1/");
                Edittext=findViewById(R.id.editTextTextPersonName2);
                Edittext2=findViewById(R.id.editTextNumberPassword2);
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void İleri (View view){
        if(Edittext.getText().toString().equals("admin")&& Edittext2.getText().toString().equals("1234")) {
            Intent intent = new Intent(MainActivity.this, sayfa2.class);

            username = Edittext.getText().toString();

            intent.putExtra("ad", username);

            startActivity(intent);
            Toast.makeText(MainActivity.this, "GİRİŞ BAŞARILI", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "GİRİŞ BAŞARISIZ", Toast.LENGTH_SHORT).show();

        }




    }
    public void destek(View view){
        Intent intent = new Intent(MainActivity.this, destek.class);
        startActivity(intent);

    }
    public void kaynak(View view){
        Intent intent = new Intent(MainActivity.this, kaynak.class);
        startActivity(intent);

    }
}