package com.oksareinaldi.abah.servislaptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasilEstimasi extends AppCompatActivity {
    TextView Nama, waktuTer,waktuSel, Kota, Rusak, merk;
    String terjam, tertanggal, seljam, selTanggal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_estimasi);
        Bundle b = getIntent().getExtras();

        Nama = findViewById(R.id.nama);
        Kota = findViewById(R.id.kota);
        merk = findViewById(R.id.merk);
        Rusak = findViewById(R.id.rusak);
        waktuTer = findViewById(R.id.waktuTerima);
        waktuSel = findViewById(R.id.waktuSels);

        terjam = b.getCharSequence("terjam").toString();
        tertanggal = b.getCharSequence("tertanggal").toString();

        seljam = b.getCharSequence("Jam").toString();
        selTanggal = b.getCharSequence("Tanggal").toString();

        Nama.setText(b.getCharSequence("Nama"));
        Kota.setText(b.getCharSequence("kota"));
        merk.setText(b.getCharSequence("brand"));
        Rusak.setText(b.getCharSequence("Rusak"));
        waktuTer.setText(tertanggal + "Pukul : "+ terjam);
        waktuSel.setText(selTanggal + "Pukul : "+seljam);



    }
}
