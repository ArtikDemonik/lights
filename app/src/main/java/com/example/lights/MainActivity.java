package com.example.lights;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    static private final String TAG_COLOR = "color";
    private int current_color = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TAG_COLOR, current_color);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int color = savedInstanceState.getInt(TAG_COLOR);
        switch (color){
            case 0: // green
                setGreen();
                break;
            case 1: // yellow
                setYellow();
                break;
            case 2: // red
                setRed();
                break;
        }
    }

    public void setGreen(View view) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.screen);
        layout.setBackgroundColor(Color.parseColor("#00ff00"));
        current_color = 0;
    }
    public void setGreen() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.screen);
        layout.setBackgroundColor(Color.parseColor("#00ff00"));
        current_color = 0;
    }
    public void setYellow(View view) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.screen);
        layout.setBackgroundColor(Color.parseColor("#ffff00"));
        current_color = 1;
    }
    public void setYellow() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.screen);
        layout.setBackgroundColor(Color.parseColor("#ffff00"));
        current_color = 1;
    }
    public void setRed(View view) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.screen);
        layout.setBackgroundColor(Color.parseColor("#ff0000"));
        current_color = 2;
    }
    public void setRed() {
        LinearLayout layout = (LinearLayout) findViewById(R.id.screen);
        layout.setBackgroundColor(Color.parseColor("#ff0000"));
        current_color = 2;
    }
}