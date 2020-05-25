package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    int default_size = 40;
    int size = default_size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text1.setTextSize(size);
    }

    public void bigger(View v){
        text1.setTextSize(size = size + 10);
    }
    public void smaller(View v){
        text1.setTextSize(size = size - 10);
    }

    public void default_size(View v){
        size = default_size;
        text1.setTextSize(size);
    }
}
