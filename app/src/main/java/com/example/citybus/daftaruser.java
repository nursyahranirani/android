package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class daftaruser extends AppCompatActivity {
    private Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.back);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("daftar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#26A69A")));
        setContentView(R.layout.activity_daftaruser);

        btn_daftar = (Button)findViewById(R.id.btndaftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "terima kasih telah mendaftar", Toast.LENGTH_LONG).show();
            }
        });
    }
}
