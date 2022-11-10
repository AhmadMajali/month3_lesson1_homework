package com.example.month3_lesson1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sign = findViewById(R.id.btn_sign);
        EditText phoneNum = findViewById(R.id.phone_num);
        sign.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class );
            intent.putExtra("Result", phoneNum.getText().toString());
            startActivity(intent);
        });
    }
}