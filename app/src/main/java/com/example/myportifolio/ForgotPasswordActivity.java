package com.example.myportifolio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText email;
    Button sendCode;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        email = findViewById(R.id.email);
        sendCode = findViewById(R.id.button);

        email.setTranslationX(800);
        sendCode.setTranslationX(800);

        email.setAlpha(v);
        sendCode.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        sendCode.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
    }

    public void btn_code(View view) {
        Intent intent = new Intent(ForgotPasswordActivity.this, SendcodeActivity.class);
        startActivity(intent);
    }

}