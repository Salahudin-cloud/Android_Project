package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class Menu_Utama extends AppCompatActivity {
 MaterialButton btnMasuk ,btnKeluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //hidden action bar
        getSupportActionBar().hide();

        btnMasuk = (MaterialButton) findViewById(R.id.buttonMasuk);
        btnKeluar = (MaterialButton)  findViewById(R.id.buttoKeluar);

        //handle btn masuk
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msk = new Intent(Menu_Utama.this, Pilih_Menu.class);
                startActivity(msk);
            }
        });

        //handle btn keluar
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klr = new Intent(Intent.ACTION_MAIN);
                klr.addCategory(Intent.CATEGORY_HOME);
                startActivity(klr);
            }
        });

    }
}