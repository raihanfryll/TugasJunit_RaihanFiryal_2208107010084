package com.example.userinterface;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textViewName = findViewById(R.id.textViewName);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("tv_nama");
        String npm = intent.getStringExtra("tv_npm");
        String prodi = intent.getStringExtra("tv_prodi");

        String hasil = "Nama:" + nama + "\nNPM: " + npm + "\nProdi: " + prodi;
        textViewName.setText(hasil);


    }
}