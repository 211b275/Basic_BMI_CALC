package com.example.myapplication;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextWeight = findViewById(R.id.Weight);
        EditText editTextHeight = findViewById(R.id.Height);
        Button button = findViewById(R.id.btnSubmit);
        TextView textView = findViewById(R.id.Result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float height = Float.parseFloat(valueOf(editTextHeight.getText())) / 100;
                float weight = Float.parseFloat(valueOf(editTextWeight.getText())) / 100;
                float bmi = weight / (height * height);
                textView.setText(String.valueOf(bmi));
            }
        });
    }
}