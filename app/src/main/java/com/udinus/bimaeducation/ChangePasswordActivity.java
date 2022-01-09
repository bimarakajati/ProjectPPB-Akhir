package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePasswordActivity extends AppCompatActivity {

    EditText newPass, confirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        newPass = findViewById(R.id.edt_newPass);
        confirmPass = findViewById(R.id.edt_conPass);
    }

    public void updatePassword(View view) {
        if (TextUtils.isEmpty(newPass.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Isi Password Baru Anda!", Toast.LENGTH_LONG).show();
        } else if (newPass.getText().length() < 6) {
            Toast.makeText(view.getContext(), "Password minimal 6!", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(confirmPass.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Konfirmasi Password Baru Anda!", Toast.LENGTH_LONG).show();
        }
        // cek inputan new dan confirm
        else if (!newPass.getText().toString().equals(confirmPass.getText().toString())) {
            Toast.makeText(view.getContext(), "Password harus sama", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(ChangePasswordActivity.this, SuccessPassword.class);
            startActivity(i);
        }
    }
}