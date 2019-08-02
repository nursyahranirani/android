package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Daftar1 extends AppCompatActivity {
    private ImageButton btn_info;
    private ImageButton btn_pilih;
    TextView bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar1);
        bus = (TextView)findViewById(R.id.textbus);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/Roboto-Medium.ttf");
        bus.setTypeface(typeface);

        btn_pilih = (ImageButton)findViewById(R.id.btnpilih);
        btn_pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Daftar1.this, daftar2.class);
                startActivity(i);
            }
        });

       btn_info = (ImageButton)findViewById(R.id.btninfo);
       btn_info.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            showDialog();
           }


       });
    }

    private void showDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("INFORMASI FASILITAS BUS");
        alertDialogBuilder
                .setMessage("1.free wifi \n2.kenyamanan ayye \n3.hiya hiya");
        alertDialogBuilder.setPositiveButton("ok",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialogInterface, int id){
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
