package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class CreatePassword extends AppCompatActivity {

    int i = 0;
    int[] r = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);


        Button button0 = findViewById(R.id.Code0);
        Button button1 = findViewById(R.id.Code1);
        Button button2 = findViewById(R.id.Code2);
        Button button3 = findViewById(R.id.Code3);
        Button button4 = findViewById(R.id.Code4);
        Button button5 = findViewById(R.id.Code5);
        Button button6 = findViewById(R.id.Code6);
        Button button7 = findViewById(R.id.Code7);
        Button button8 = findViewById(R.id.Code8);
        Button button9 = findViewById(R.id.Code9);






/*        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                button0.setBackgroundResource(R.drawable.buttonCircleBlue);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button0.setBackgroundResource(R.style.buttonCircle);
                    }
                }, 1000);
            }
        });*/


    }
}