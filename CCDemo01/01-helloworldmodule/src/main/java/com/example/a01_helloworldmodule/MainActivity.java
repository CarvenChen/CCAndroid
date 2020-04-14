package com.example.a01_helloworldmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout layout = findViewById(R.id.bgLayout);

        final RabbitView rabbitView = new RabbitView(this);
        rabbitView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                rabbitView.positionX = event.getX();
                rabbitView.positionY = event.getY();
                rabbitView.invalidate();
                return true;
            }
        });
        layout.addView(rabbitView);
    }
}
