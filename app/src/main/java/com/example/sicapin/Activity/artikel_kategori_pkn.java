package com.example.sicapin.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sicapin.R;
import com.example.sicapin.itemObjectClass.item_artikel_kat;

public class artikel_kategori_pkn extends AppCompatActivity {

    ListView lv_kat_artikel;
    String[]  tv_lv     = {"Tanpa Judul", "Tanpa Judul", "Tanpa Judul", "Tanpa Judul", "Tanpa Judul", "Tanpa Judul", "Tanpa Judul", "Tanpa Judul"};
    Integer[] ic_lv     = {R.drawable.kataroff, R.drawable.kataroff, R.drawable.kataroff, R.drawable.kataroff, R.drawable.kataroff, R.drawable.kataroff, R.drawable.kataroff, R.drawable.kataroff};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel_kategori_pkn);

        item_artikel_kat adapter = new item_artikel_kat(artikel_kategori_pkn.this, tv_lv, ic_lv);
        lv_kat_artikel = findViewById(R.id.lv_artikel);

        lv_kat_artikel.setAdapter(adapter);
    }
}