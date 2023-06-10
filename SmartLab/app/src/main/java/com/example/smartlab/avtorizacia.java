package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class avtorizacia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtorizacia);

    }

    public void goCodeEmail (View V)
    {
        EditText editText = findViewById(R.id.editTextTextEmailAddress);


        if (editText.getText().toString().equals("")){
            Toast.makeText(this, "Заполните поле", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(avtorizacia.this, codeEmail.class);
            startActivity(intent);
            finish();
        }
    }

}