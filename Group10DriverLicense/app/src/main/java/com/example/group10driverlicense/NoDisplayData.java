package com.example.group10driverlicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NoDisplayData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_display_data);
    }

    public void back(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}