package com.example.iiissss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView img,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;
    CardView cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window g =getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,WindowManager.LayoutParams.TYPE_STATUS_BAR);

        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolber);

        cardView1=findViewById(R.id.cardview1);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("              DUA'S");
        toolbar.setTitleTextColor(getResources().getColor(R.color.ffff));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img1=findViewById(R.id.img2);
        img2=findViewById(R.id.img3);
        img3=findViewById(R.id.img4);

        img4=findViewById(R.id.img5);
        img5=findViewById(R.id.img6);
        img6=findViewById(R.id.img7);

        img7=findViewById(R.id.img8);
        img8=findViewById(R.id.img9);
        img9=findViewById(R.id.img10);

        img10=findViewById(R.id.img11);
        img11=findViewById(R.id.img12);
        img12=findViewById(R.id.img13);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img1=new Intent(MainActivity.this,page1.class);
                startActivity(img1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img2=new Intent(MainActivity.this,page2.class);
                startActivity(img2);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img3=new Intent(MainActivity.this,page3.class);
                startActivity(img3);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img4=new Intent(MainActivity.this,page4.class);
                startActivity(img4);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img5=new Intent(MainActivity.this,page5.class);
                startActivity(img5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img6=new Intent(MainActivity.this,page6.class);
                startActivity(img6);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img7=new Intent(MainActivity.this,page7.class);
                startActivity(img7);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img8=new Intent(MainActivity.this,page8.class);
                startActivity(img8);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img9=new Intent(MainActivity.this,page9.class);
                startActivity(img9);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img10=new Intent(MainActivity.this,page01.class);
                startActivity(img10);
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img11=new Intent(MainActivity.this,page02.class);
                startActivity(img11);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img12=new Intent(MainActivity.this,page03.class);
                startActivity(img12);
            }
        });



    }
}
