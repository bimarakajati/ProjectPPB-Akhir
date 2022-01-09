package com.udinus.bimaeducation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class iAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void lokasi(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
//        Toast.makeText(this, "Masuk", Toast.LENGTH_SHORT).show();
    }
}