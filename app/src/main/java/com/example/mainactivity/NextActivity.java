package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}