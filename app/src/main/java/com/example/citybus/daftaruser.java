package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class daftaruser extends AppCompatActivity {
    private Button btn_daftar;

    TextView daftaruser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftaruser);
        daftaruser = (TextView)findViewById(R.id.textuser);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/Roboto-Medium.ttf");
        daftaruser.setTypeface(typeface);


        btn_daftar = (Button)findViewById(R.id.btndaftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "terima kasih telah mendaftar", Toast.LENGTH_LONG).show();
            }
        });
    }
}
