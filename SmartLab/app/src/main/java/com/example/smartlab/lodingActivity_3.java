package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lodingActivity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loding3);


    }
    public void propusk1(View view) {
        Intent in3 = new Intent(lodingActivity_3.this, avtorizacia.class);
        startActivity(in3);
        finish();
    }
}