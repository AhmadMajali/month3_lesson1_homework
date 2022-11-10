package com.example.month3_lesson1_homework;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView numbershow;
    ImageButton anon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView numbershow = findViewById(R.id.numbershow);
        String result = getIntent().getStringExtra("Result2");
        numbershow.setText("Номер телефона:" + " " + result);
        


    }
}