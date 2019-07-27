package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Calendar;

public class Home extends AppCompatActivity {
Toolbar toolbar;
TextView text;
Button btn1;

Calendar c;
DatePickerDialog dpg;
private ImageView lanjut;
private ImageView btnperr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.logoo_round);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#26A69A")));
        setContentView(R.layout.activity_home);

        btnperr = (ImageView)findViewById(R.id.btnperusahaa);
        btnperr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Profil.class);
                startActivity(i);
            }
        });



        text = (TextView)findViewById(R.id.btnpilihtgl);
        btn1 = (Button)findViewById(R.id.btnpilihtgl);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = Calendar.getInstance();
                final int day = c.get(Calendar.DAY_OF_MONTH);
                final int month = c.get(Calendar.MONTH);
                final int year = c.get(Calendar.YEAR);

                dpg = new DatePickerDialog(Home.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        text.setText(day + "/" + (month+1)+ "/" + year);
                    }
                },day,month,year);
                dpg.show();
            }
        });
        lanjut = (ImageView)findViewById(R.id.lanjutdaftar);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Daftar1.class);
                startActivity(i);
            }
        });

    }

}
