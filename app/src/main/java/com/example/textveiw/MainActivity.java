package com.example.textveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.Text1);
        tv1 = findViewById(R.id.Text2);
        tv.setText("avital");
        tv1.setText("7.7.2007");
        tv.setTextColor(Color.GREEN);
        tv1.setTextColor(Color.CYAN);
        tv.setTextSize(50);
        tv1.setTextSize(50);
        tv.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.VISIBLE);
    }
}