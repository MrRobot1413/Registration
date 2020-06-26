package com.hello.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);
        output = findViewById(R.id.output);

        output.setText("Your first name is " + getIntent().getStringExtra("firstName") + ", and your last name is " + getIntent().getStringExtra("lastName") + ". Your age is ");

    }
}
