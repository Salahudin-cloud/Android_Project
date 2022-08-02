package com.example.tugas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Input_Nama extends AppCompatActivity {
    EditText input_nama ;
    Button btn_tampilkan;
    TextView tmp ;

    String tmpInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
        //change title action bar
        setTitle("Aplikasi Input Nama");

        //memanggil action bar
        ActionBar actionBar = getSupportActionBar();
        //memunculkan back button
        actionBar.setDisplayHomeAsUpEnabled(true);

        //inisialisasi
        input_nama = (EditText) findViewById(R.id.inputNama);
        btn_tampilkan = (Button) findViewById(R.id.buttonTampilkan);
        tmp = (TextView) findViewById(R.id.tampilkanData);

        //handle button tampilkan
        btn_tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //meng apply  data yang diinputkan
                tmp.setText(input_nama.getText().toString());
            }
        });
    }
}