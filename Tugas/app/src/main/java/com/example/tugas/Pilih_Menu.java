package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pilih_Menu extends AppCompatActivity {
    Button btn_inputNama,btn_kalkulator,btn_list,btn_kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_menu);

        //hide action bar
        getSupportActionBar().hide();

        //inisialisasi
        btn_inputNama = (Button) findViewById(R.id.buttonInputNama);
        btn_kalkulator = (Button) findViewById(R.id.buttonKalkulator);
        btn_list = (Button) findViewById(R.id.buttonList);
        btn_kembali = (Button) findViewById(R.id.buttonKembali);

        //handle ke menu input nama
        btn_inputNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuInputNama = new Intent(Pilih_Menu.this, Input_Nama.class);
                startActivity(menuInputNama);
            }
        });

        //handle ke menu kalkulator
        btn_kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuKalkulator = new Intent(Pilih_Menu.this, Kalkulator.class);
                startActivity(menuKalkulator);
            }
        });

        //handle ke menu list
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuList = new Intent(Pilih_Menu.this, List_View.class);
                startActivity(menuList);
            }
        });

        //handle back Button
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backBtn = new Intent(Pilih_Menu.this, Menu_Utama.class);
                startActivity(backBtn);
            }
        });


    }
}