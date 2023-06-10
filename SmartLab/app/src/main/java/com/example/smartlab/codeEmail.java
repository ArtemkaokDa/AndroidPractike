package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class codeEmail extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_email2);

        EditText numeral1 = findViewById(R.id.code_input_1);
        EditText numeral2 = findViewById(R.id.code_input_2);
        EditText numeral3 = findViewById(R.id.code_input_3);
        EditText numeral4 = findViewById(R.id.code_input_4);




       numeral1.addTextChangedListener(new TextWatcher() {
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               if (s.length() == 1){
                   numeral2.requestFocusFromTouch();
               }

           }

           @Override
           public void afterTextChanged(Editable arg0) {
           }
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
           }
       });
        numeral2.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1){
                    numeral3.requestFocusFromTouch();
                }
            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });

        numeral3.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1){
                    numeral4.requestFocusFromTouch();
                }
            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
        });
    }
    public void test1 (View V){
        Intent test1 = new Intent(this,CreatePassword.class);
        startActivity(test1);
        finish();
    }
}