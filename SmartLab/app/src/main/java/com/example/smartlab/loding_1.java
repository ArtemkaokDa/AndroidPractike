package com.example.smartlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class loding_1 extends AppCompatActivity {
    int i = 0;
    int[] r = {R.layout.activity_loding1, R.layout.activity_loding2, R.layout.activity_loding3};
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loding1);

        gestureDetector = new GestureDetector(this, new MyGestureListener());

    }
    public void propusk1(View view) {
        Intent in = new Intent(loding_1.this, avtorizacia.class);
        startActivity(in);
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    public class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1,MotionEvent e2, float velocityX, float velocityY) {
            if (e2.getX()> e1.getX() && i !=0) {
                i--;
                setContentView(r[i]);

            }
            if (e2.getX()< e1.getX() && i !=2){
                i++;
                setContentView(r[i]);
            }
            return false;
        }

    }

}