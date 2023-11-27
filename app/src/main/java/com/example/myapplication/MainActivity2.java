package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    Button bt,bc,br;
    TextView tc,tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt = findViewById(R.id.btn_Toast);
        bc = findViewById(R.id.btn_Count);
        br = findViewById(R.id.btn_Random);
        tc = findViewById(R.id.txt_Count);
        tr = findViewById(R.id.txt_Random);
    }
    public void Toast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }
    Integer s1 = 0;
    public void Count(View view) {
        s1++;
        tc.setText(s1.toString());
    }
    Integer s2 = 0;
    public void Random(View view) {
        Random r1 = new Random();
        s2 = r1.nextInt(15)+0;
        tr.setText(s2.toString());
    }
}