package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListStructActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_struct);
    }
    public void btn_confirmation(View view){
        Intent next = new Intent(ListStructActivity.this, PaymentSuccess.class);
        startActivity(next);
    }
}