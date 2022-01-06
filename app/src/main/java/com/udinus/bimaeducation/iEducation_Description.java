package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class iEducation_Description extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, alamat, description;

    String data1, data2, data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_description);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);
        alamat = findViewById(R.id.alamat);
        description = findViewById(R.id.description);

        getData();
        setData();

        Button button = (Button) findViewById(R.id.back);
        button.setOnClickListener(view -> openWisataTempat());
    }

    private void getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") &&
                getIntent().hasExtra("data2") && getIntent().hasExtra("data3")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            myImage = getIntent().getIntExtra("myImage", 1);
        } else {
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        title.setText(data1);
        alamat.setText(data2);
        description.setText(data3);
        mainImageView.setImageResource(myImage);
    }

    public void openWisataTempat() {
        Intent intent = new Intent(this, ForumActivity.class);
        startActivity(intent);
    }
}