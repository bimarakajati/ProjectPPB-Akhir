package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    ImageView logo;
    Button btn1, btn2;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        logo = findViewById(R.id.logo_view);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        logo.setTranslationY(1200);
        btn1.setTranslationX(800);
        btn2.setTranslationX(-800);

        logo.setAlpha(v);
        btn1.setAlpha(v);
        btn2.setAlpha(v);

        logo.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(0).start();
        btn1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        btn2.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
    }

    public void btn_login(View view)
    {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void btn_register(View view)
    {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}