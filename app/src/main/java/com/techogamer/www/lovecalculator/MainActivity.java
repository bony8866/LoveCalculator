package com.techogamer.www.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cal = findViewById(R.id.btn_click);
        final TextView percent = findViewById(R.id.percent_tv);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int per = r.nextInt(100);
                percent.setText(String.valueOf(per)+"%");
            }
        });
    }
}
