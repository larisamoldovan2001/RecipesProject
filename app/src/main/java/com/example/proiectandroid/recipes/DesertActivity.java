package com.example.proiectandroid.recipes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proiectandroid.R;
import com.example.proiectandroid.recipes.Descrieri.Descriere9;

public class DesertActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        tv=(TextView) findViewById(R.id.textView5);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Descriere9.class);
                startActivity(intent);
            }
        });



        
    }
}