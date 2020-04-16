package com.example.a13_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    CheckBox checkbox1, checkbox2, checkbox3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login);
        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checkedString = "";
                if (checkbox1.isChecked()) {
                    checkedString += checkbox1.getText().toString();
                }
                if (checkbox2.isChecked()) {
                    checkedString += checkbox2.getText().toString();
                }
                if (checkbox3.isChecked()) {
                    checkedString += checkbox3.getText().toString();
                }

                Toast.makeText(MainActivity.this, checkedString, Toast.LENGTH_LONG).show();
            }
        });
    }
}
