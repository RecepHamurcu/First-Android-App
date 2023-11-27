package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {
    Integer s1 = 0;
    TextView tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        tr = findViewById(R.id.txt_Random);
        Random r1 = new Random();
        s1 = r1.nextInt(15)+0;
        tr.setText(s1.toString());
    }

    public void Previous(View view) {
        Intent pb = new Intent(RandomActivity.this,MainActivity2.class);
        startActivity(pb);
    }
}