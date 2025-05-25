package com.example.noteapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Agar tidak menabrak status/navigation bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Ambil komponen UI dari layout
        val inputNote = findViewById<EditText>(R.id.inputNote)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val txtResult = findViewById<TextView>(R.id.txtNoteResult)
        val btnDelete = findViewById<Button>(R.id.btnDelete) // Tambahkan ini

        // Logika tombol Tambah
        btnAdd.setOnClickListener {
            val note = inputNote.text.toString()
            if (note.isNotEmpty()) {
                txtResult.text = note
                inputNote.text.clear()
            } else {
                txtResult.text = "Catatan kosong!"
            }
        }

        // Logika tombol Hapus
        btnDelete.setOnClickListener {
            txtResult.text = "Belum ada catatan"
            inputNote.text.clear()
        }
    }
}
