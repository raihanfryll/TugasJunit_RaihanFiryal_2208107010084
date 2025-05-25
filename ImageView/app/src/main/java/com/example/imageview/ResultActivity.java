package com.example.imageview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView tvName, tvNpm, tvInterest;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rraihanesult);

        tvName = findViewById(R.id.tvName);
        tvNpm = findViewById(R.id.tvNpm);
        tvInterest = findViewById(R.id.tvInterest);
        btnOk = findViewById(R.id.btnOk);

        // Ambil data dari intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String npm = intent.getStringExtra("NPM");
        String interest = intent.getStringExtra("INTEREST");

        // Tampilkan hasil input
        tvName.setText("Nama: " + name);
        tvNpm.setText("NPM: " + npm);
        tvInterest.setText("Bidang Minat: " + interest);

        // Tombol OK untuk menutup aplikasi
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity(); // Menutup semua aktivitas dalam aplikasi
            }
        });
    }
}
