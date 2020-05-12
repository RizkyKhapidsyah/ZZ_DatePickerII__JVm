package com.rk.dpii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker DP_DatePicker_IDJAVA;
    Calendar Kalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DP_DatePicker_IDJAVA = findViewById(R.id.DP_DatePicker_IDXML);

        Kalender = Calendar.getInstance();
        DP_DatePicker_IDJAVA.init(
                Kalender.get(Calendar.YEAR),
                Kalender.get(Calendar.MONTH),
                Kalender.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear = monthOfYear + 1;
                        String Tanggal = dayOfMonth + "/" + monthOfYear + "/" + year;
                        Toast.makeText(getApplicationContext(), Tanggal, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
