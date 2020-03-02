package com.example.iiissss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class page8 extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
        toolbar=findViewById(R.id.toolber);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("             Praising Allah");
        toolbar.setTitleTextColor(getResources().getColor(R.color.ffff));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
