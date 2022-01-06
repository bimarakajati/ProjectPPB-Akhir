package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClaimSertifikatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_sertifikat);
    }

    public void btn_payment(View view) {
        Intent payment = new Intent(ClaimSertifikatActivity.this, ListPaymentActivitiy.class);
        startActivity(payment);
    }
}