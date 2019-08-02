package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private Button daftar;
    private Button masuk;
    TextView textView1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView1 = (TextView)findViewById(R.id.text3);
        Typeface typefacee = Typeface.createFromAsset(getAssets(),"font/Roboto-Regular.ttf");
        textView1.setTypeface(typefacee);

        textView = (TextView)findViewById(R.id.text1);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/Roboto-Medium.ttf");
        textView.setTypeface(typeface);

        masuk = (Button)findViewById(R.id.btnmasuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Dashboard.class);
                startActivity(i);
            }
        });

        daftar = (Button)findViewById(R.id.btnbuatakun);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, daftaruser.class);
                startActivity(i);
            }
        });
    }
}
