package com.example.proiectandroid.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proiectandroid.R;
import com.example.proiectandroid.recipes.Descrieri.Descriere10;
import com.example.proiectandroid.recipes.Descrieri.Descriere11;
import com.example.proiectandroid.recipes.Descrieri.Descriere12;

public class BauturiActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bauturi);

        tv=(TextView) findViewById(R.id.textView3);
        tv2=(TextView) findViewById(R.id.textView8);
        tv3=(TextView) findViewById(R.id.textView9);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere10.class);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere11.class);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere12.class);
                startActivity(intent);
            }
        });
    }
}