package com.example.tugas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Kalkulator extends AppCompatActivity {

    EditText inputSatu,inputDua;
    Button tambah,kurang,bagi,kali,clean;
    TextView hasil;
    int hasilPerhitungan;
    int satu,dua;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        //set title
        setTitle("Aplikais Kalkulator");
        //memunculkan back button
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //iniisialisasi
        inputSatu = findViewById(R.id.inputAngkaPertama);
        inputDua = findViewById(R.id.inputAngkaKedua);
        tambah = findViewById(R.id.buttonPlus);
        kurang = findViewById(R.id.buttonSubtraction);
        bagi = findViewById(R.id.buttonDivine);
        kali = findViewById(R.id.buttonMultiple);
        clean = findViewById(R.id.buttonClean);
        hasil = findViewById(R.id.hasil);

        //handle tambah button
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                satu = Integer.parseInt(inputSatu.getText().toString());
                dua = Integer.parseInt(inputDua.getText().toString());
                hasilPerhitungan = satu + dua ;
                hasil.setText(String.valueOf(hasilPerhitungan));
            }
        });

        //handle button kurang
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                satu = Integer.parseInt(inputSatu.getText().toString());
                dua = Integer.parseInt(inputDua.getText().toString());
                hasilPerhitungan = satu - dua ;
                hasil.setText(String.valueOf(hasilPerhitungan));
            }
        });

        //handle button kali
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                satu = Integer.parseInt(inputSatu.getText().toString());
                dua = Integer.parseInt(inputDua.getText().toString());
                hasilPerhitungan = satu * dua ;
                hasil.setText(String.valueOf(hasilPerhitungan));
            }
        });

        //handle button bagi
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                satu = Integer.parseInt(inputSatu.getText().toString());
                dua = Integer.parseInt(inputDua.getText().toString());
                hasilPerhitungan = satu /  dua ;
                hasil.setText(String.valueOf(hasilPerhitungan));
            }
        });

        //menghapus field input angka satu ,dua , dan hasil ketika menekan tombol bersihkan
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membersihkan field input , dan tampilan total hasil perhitungan
                hasil.setText("");
                inputSatu.getText().clear();
                inputDua.getText().clear();
            }
        });
    }
}