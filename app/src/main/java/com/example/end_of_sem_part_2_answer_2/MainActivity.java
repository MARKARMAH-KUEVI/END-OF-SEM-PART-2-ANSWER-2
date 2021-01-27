package com.example.end_of_sem_part_2_answer_2;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView label;
    int buttonOnPressed = 0;
    String[] trafficColor = {"#ff0000", "#008000", "#ffff00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.label);

        label.setBackgroundColor(Color.parseColor(trafficColor[buttonOnPressed]));
    }

    public void changeTrafficLightColor(View v){
        buttonOnPressed += 1;
        buttonOnPressed = buttonOnPressed % 3;
        label.setBackgroundColor(Color.parseColor(trafficColor[buttonOnPressed]));
    }
}