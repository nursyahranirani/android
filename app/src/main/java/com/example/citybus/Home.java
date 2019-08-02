package com.example.citybus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class Home extends AppCompatActivity implements DatepickerFragment.DatePickerListener {
    private TextView tglmuncul;
    private static final String[] ASAL = new String[]{
            "makassar", "sinjai", "bulukumba", "bantaeng", "takalar", "bone", "maros", "sengkang", "pare-pare"
    };
private ImageView lanjut;

TextView daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        daftar = (TextView)findViewById(R.id.texthome);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/Roboto-Medium.ttf");
        daftar.setTypeface(typeface);


        tglmuncul = findViewById(R.id.muncultanggal);



        Button pilihtanggall = (Button)findViewById(R.id.pilihtanggal);
        pilihtanggall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePickerFragment=new DatepickerFragment();
                datePickerFragment.setCancelable(false);
                datePickerFragment.show(getSupportFragmentManager(),"datepicker");
            }
        });

        AutoCompleteTextView edittext1 = findViewById(R.id.pilihtujuan);
        ArrayAdapter<String> adapterr =new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_activated_1, ASAL);
        edittext1.setAdapter(adapterr);

        AutoCompleteTextView edittext = findViewById(R.id.pilihasal);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_activated_1, ASAL);
        edittext.setAdapter(adapter);


        lanjut = (ImageView)findViewById(R.id.lanjutdaftar);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Daftar1.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int mount, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,mount);
        cal.set(Calendar.DAY_OF_MONTH,day);

        String date= DateFormat.getDateInstance().format(cal.getTime());
        tglmuncul.setText(date);
    }
}
