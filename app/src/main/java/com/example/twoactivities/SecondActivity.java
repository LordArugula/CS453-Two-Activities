package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.twoactivities.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int textIndex = intent.getIntExtra(MainActivity.EXTRA_TEXT_INDEX, -1);

        TextView textView = findViewById(R.id.text);
        switch (textIndex) {

            case 0:
                textView.setText(R.string.text_one);
                break;
            case 1:
                textView.setText(R.string.text_two);
                break;
            case 2:
                textView.setText(R.string.text_three);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + textIndex);
        }
    }
}