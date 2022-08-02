package com.example.tugas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_List extends AppCompatActivity {

    ImageView flagCountry ;
    TextView country, ibuNegara,bahasa,luasNegara,populasiPenduduk,ideologiNegara,teleponKode;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        //mengubah nama action bar
        setTitle("Detail");

        //memunculkan back button
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        //inisilisasi
         flagCountry = findViewById(R.id.flag);
         country =  findViewById(R.id.namaNegara);
         ibuNegara = findViewById(R.id.ibuKotaNegara);
         bahasa = findViewById(R.id.bahasaResmi);
         luasNegara = findViewById(R.id.luas);
         populasiPenduduk = findViewById(R.id.populasi);
         ideologiNegara = findViewById(R.id.ideologi);
         teleponKode = findViewById(R.id.kodeTelepon);

        //menagkap data yang dikirim dan meng apply nya
        country.setText("Negara : " + getIntent().getExtras().getString("negara"));
        ibuNegara.setText("Ibu Kota : " + getIntent().getExtras().getString("ibuKotaNegara"));
        int image = getIntent().getIntExtra("flag",R.drawable.indonesian_flag);
        flagCountry.setImageResource(image);
        bahasa.setText("Bahasa : " + getIntent().getExtras().getString("bhsResmi"));
        luasNegara.setText("Luas : " + getIntent().getExtras().getString("luasNegara")+ " Km2");
        populasiPenduduk.setText("Populasi : " + getIntent().getExtras().getString("populasiNegara"));
        ideologiNegara.setText("Ideologi :" + getIntent().getExtras().getString("ideologiNegara"));
        teleponKode.setText("Kode : " + getIntent().getExtras().getString("kodeTelepon"));








    }
}