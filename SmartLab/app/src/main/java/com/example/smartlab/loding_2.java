package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loding_2 extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loding2);


        button2 = findViewById(R.id.button2);
    }


    public void propusk1(View view) {
        Intent qwe = new Intent(loding_2.this, avtorizacia.class);
        startActivity(qwe);
        finish();
    }

}