package com.example.tugas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class List_View extends AppCompatActivity {

    Integer[] imageId = {R.drawable.indonesian_flag,R.drawable.malaysia_flag};
    String[] negara = {"Indonesia","Malaysia"};
    String[] ibuKota = {"Jakarta","Kuala Lumpur"};
    String[] bahasa = {"Indonesia","Melayu"};
    String[] luas = {"1.904.570","303.803"};
    String[] populasi = {"275.273.774","32.730.000"};
    String [] ideologi = {"Pancasila","Rukun Negara"};
    String[] kode = {"+62","+60"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        //memunculkan back button
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //set title action bar
        setTitle("Applikasi List");

        //create item
        final ListView list =  findViewById(R.id.dataListItem);
        ArrayList <String> itemList = new ArrayList<>();
        itemList.add("Indonesia");
        itemList.add("Malaysia");
        itemList.add("Singapore");
        itemList.add("Italia");
        itemList.add("Inggris");
        itemList.add("Belanda");
        itemList.add("Argentina");
        itemList.add("Chile");
        itemList.add("Mesir");
        itemList.add("Uganda");
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,itemList);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent detail = new Intent(List_View.this , Detail_List.class);

                //mengirim data berdasarkan item yang dipilih
                    detail.putExtra("flag", imageId[i]);
                    detail.putExtra("negara",negara[i]);
                    detail.putExtra("ibuKotaNegara", ibuKota[i]);
                    detail.putExtra("bhsResmi", bahasa[i]);
                    detail.putExtra("luasNegara",luas[i]);
                    detail.putExtra("populasiNegara", populasi[i]);
                    detail.putExtra("ideologiNegara", ideologi[i]);
                    detail.putExtra("kodeTelepon", kode[i]);


                  startActivity(detail);
            }
        });
    }
}