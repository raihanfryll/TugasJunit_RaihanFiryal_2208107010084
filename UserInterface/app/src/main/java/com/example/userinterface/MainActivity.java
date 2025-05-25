package com.example.userinterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewName;

    private EditText editTextPersonName, editTextNPM, editTextProdi;

    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        editTextPersonName = findViewById(R.id.etNama);
        editTextNPM = findViewById(R.id.etNPM);
        editTextProdi = findViewById(R.id.etJurusan);
        buttonSubmit = findViewById(R.id.btnSimpan);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editTextPersonName.getText().toString();
                String npm = editTextNPM.getText().toString();
                String prodi = editTextProdi.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("tv_nama", nama);
                intent.putExtra("tv_npm", npm);
                intent.putExtra("tv_prodi", prodi);
                startActivity(intent);


            }

        });
    }

}