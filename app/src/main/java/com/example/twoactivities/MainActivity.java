package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
     * Challenge: Create an app with three Button elements labeled Text One,
     * Text Two, and Text Three. When any of these Button elements are clicked,
     * launch a second Activity. That second Activity should contain a
     * ScrollView that displays one of three text passages (you can include
     *  your choice of passages). Use an Intent to launch the second Activity
     *  with extras to indicate which of the three passages to display.
     */

    public static final String EXTRA_TEXT_INDEX = "com.example.twoactivities.extra.TEXT_INDEX";
    public static final int TEXT_REQUEST = 1;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(int textIndex) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT_INDEX, textIndex);
        startActivity(intent);
    }

    public void textOne(View view) {
        launchSecondActivity(0);
    }

    public void textTwo(View view) {
        launchSecondActivity(1);
    }

    public void textThree(View view) {
        launchSecondActivity(2);
    }
}