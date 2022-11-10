package com.example.month3_lesson1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    EditText editCode;
    Button btnCode;
    TextView codeView;
    Button sign;
    TextView numRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button sign = findViewById(R.id.sign2);
        TextView codeView = findViewById(R.id.code_view);
        EditText editCode = findViewById(R.id.view_code);
        Button btnCode = findViewById(R.id.btn_code);
        TextView numRes = findViewById(R.id.num_res);

        String result = getIntent().getStringExtra("Result");
        numRes.setText(result);

        btnCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(999999-100000)+100000;
                codeView.setText(Integer.toString(val));
            }
        });

        sign.setOnClickListener(view -> {
            if (editCode.getText().toString().equals(codeView.getText().toString())){

                Intent intentw = new Intent(MainActivity2.this, MainActivity3.class );
                startActivity(intentw);

                Intent intentx = new Intent(MainActivity2.this, MainActivity3.class );
                intentx.putExtra("Result2", numRes.getText().toString());
                startActivity(intentx);
            }
            else {
                Toast.makeText(getApplicationContext(), "Not correct code, try again", Toast.LENGTH_LONG).show();
            }
        });


    }

}