package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class iEducation extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1, s2, s3;
    int[] images = {
            R.drawable.img_python,
            R.drawable.img_cpp,
            R.drawable.img_java,
            R.drawable.img_html,
            R.drawable.img_php,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.mata_pelajaran);
        s2 = getResources().getStringArray(R.array.kode);
        s3 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}