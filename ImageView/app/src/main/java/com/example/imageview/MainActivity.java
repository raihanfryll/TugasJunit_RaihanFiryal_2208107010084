package com.example.imageview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etName, etNpm, etInterest;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etNpm = findViewById(R.id.etNpm);
        etInterest = findViewById(R.id.etInterest);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String npm = etNpm.getText().toString();
            String interest = etInterest.getText().toString();

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("NAME", name);
            intent.putExtra("NPM", npm);
            intent.putExtra("INTEREST", interest);
            startActivity(intent);
        });
    }
}
