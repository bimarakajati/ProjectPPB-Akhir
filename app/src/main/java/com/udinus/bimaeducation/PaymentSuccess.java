package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class PaymentSuccess extends AppCompatActivity {

    TextView pym;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);

        pym = findViewById(R.id.payment_text);

        pym.setTranslationY(1200);

        pym.setAlpha(v);

        pym.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(PaymentSuccess.this, MainMenuActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}