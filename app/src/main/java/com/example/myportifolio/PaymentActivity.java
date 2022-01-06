package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void btn_payment(View view) {
        Intent payment = new Intent(PaymentActivity.this, ListPaymentActivitiy.class);
        startActivity(payment);
    }

    public void btn_claim(View view) {
        Intent claim = new Intent(PaymentActivity.this, ClaimSertifikatActivity.class);
        startActivity(claim);
    }
}