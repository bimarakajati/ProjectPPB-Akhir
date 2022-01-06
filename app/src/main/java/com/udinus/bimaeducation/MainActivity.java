package com.udinus.bimaeducation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo_view);

        logo.setTranslationY(1200);

        logo.setAlpha(v);

        logo.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
            finish();
        }, 3000);

    }
}