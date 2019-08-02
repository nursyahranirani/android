package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Detail_tiket extends AppCompatActivity {
    private Button lanjutbayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tiket);

        lanjutbayar = (Button)findViewById(R.id.btnlanjutbayar);
        lanjutbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Detail_tiket.this, Pembayaran.class);
                startActivity(i);
            }
        });
    }
}
