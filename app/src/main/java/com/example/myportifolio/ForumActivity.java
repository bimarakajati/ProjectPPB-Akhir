package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ForumActivity extends AppCompatActivity {
    EditText nis, nama, pesan;
    Button tblAdd;
    DatabaseReference reff;
    Siswa siswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

//        nis = findViewById(R.id.nis);
//        nama = findViewById(R.id.nama);
//        pesan = findViewById(R.id.pesan);
        tblAdd = findViewById(R.id.tblAdd);
//        siswa = new Siswa();
//        reff = FirebaseDatabase.getInstance().getReference().child("Siswa");
//
//        tblAdd.setOnClickListener(view -> {
//            siswa.setNis(nis.getText().toString().trim());
//            siswa.setNama(nama.getText().toString().trim());
//            siswa.setPesan(pesan.getText().toString().trim());
//            reff.push().setValue(siswa);
//            Toast.makeText(ForumActivity.this, "Data tersimpan", Toast.LENGTH_LONG).show();
//        });

        tblAdd.setOnClickListener(view -> Toast.makeText(ForumActivity.this, "Data tersimpan", Toast.LENGTH_LONG).show());
    }
}