package com.example.proiectandroid.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proiectandroid.R;
import com.example.proiectandroid.recipes.Descrieri.Descriere7;
import com.example.proiectandroid.recipes.Descrieri.Descriere8;
import com.example.proiectandroid.recipes.Descrieri.Descriere9;

public class DesertActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        tv=(TextView) findViewById(R.id.textView5);
        tv2=(TextView) findViewById(R.id.textView10);
        tv3=(TextView) findViewById(R.id.textView11);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere7.class);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere8.class);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere9.class);
                startActivity(intent);
            }
        });


        
    }
}