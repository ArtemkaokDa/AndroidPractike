package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;

public class codeEmail extends AppCompatActivity {

int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_email2);


        EditText numeral1 = findViewById(R.id.code_input_1);
        EditText numeral2 = findViewById(R.id.code_input_2);
        EditText numeral3 = findViewById(R.id.code_input_3);
        EditText numeral4 = findViewById(R.id.code_input_4);
        TextView timerSMS = findViewById(R.id.timer_sms);






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


        numeral4.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1){
                    Intent int1 = new Intent(codeEmail.this, CreatePassword.class);
                    startActivity(int1);
                    finish();
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




    public void start(View view)


    {
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String value = extras.getString("new_variable");

        }



        TextView timerSMS = findViewById(R.id.timer_sms);
     new CountDownTimer(10000, 1000) {


        @Override
        public void onTick(long l)

        {
            timerSMS.setText("Отправить код повторно можно \n будет через: "+(l/1000));
            timerSMS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.setClickable(false);
                }
            });

        }

        @Override
        public void onFinish()
        {
            timerSMS.setText("Отправить код повторно");

            timerSMS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    view.setClickable(true);
                }
            });
        }


    }.start();
    }


}