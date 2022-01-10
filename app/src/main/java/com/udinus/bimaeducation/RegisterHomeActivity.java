package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterHomeActivity extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextPassword;
    EditText editUsername;
    EditText editConfirmPassword;
    EditText editEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_home);

        // Binding EditText
        editTextPassword = findViewById(R.id.new_pass);
        editEmail = findViewById(R.id.new_email);
        editConfirmPassword = findViewById(R.id.confirm_pass);
        editUsername = findViewById(R.id.new_username);
    }

    public void btn_register(View view) {
        // Validasi kosong
        if (TextUtils.isEmpty(editEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email harus diisi!", Toast.LENGTH_LONG).show();
        } else if (!isValidEmail(editEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email tidak valid!", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(editUsername.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Isi Username Baru Anda!", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Isi Password Baru Anda!", Toast.LENGTH_LONG).show();
        } else if (editTextPassword.getText().length() < 6) {
            Toast.makeText(view.getContext(), "Password minimal 6!", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(editConfirmPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Konfirmasi Password Baru Anda!", Toast.LENGTH_LONG).show();
        }
        // cek inputan new dan confirm
        else if (!editTextPassword.getText().toString().equals(editConfirmPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Password harus sama", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(RegisterHomeActivity.this, SuccessRegister.class);
            startActivity(i);
        }
    }

    // Email validation
    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}