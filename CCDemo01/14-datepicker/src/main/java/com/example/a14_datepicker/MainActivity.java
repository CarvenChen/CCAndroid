package com.example.a14_datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends Activity {

    int year;
    int month;
    int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker datePicker = findViewById(R.id.datePicker);

        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);

        int date = calendar.get(Calendar.DATE);
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                MainActivity.this.year = year;
                MainActivity.this.month = monthOfYear;
                MainActivity.this.day = dayOfMonth;

                MainActivity.this.show(year, month, day);
            }
        });
    }

    private void show(int year, int month, int day) {
        String text = year + "年" + (month + 1) + "月" + day + "日";
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
