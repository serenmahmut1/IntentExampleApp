package com.example.mahmut.intentexampleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4;

    Intent n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=(Button)findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n=new Intent(getApplication(),CallingPage.class);
                startActivity(n);
            }
        });



        btn2=(Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n=new Intent(Intent.ACTION_VIEW);
                n.setData(Uri.parse("https://www.linkedin.com/feed/?trk="));

                startActivity(n);
            }
        });



        btn3=(Button)findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n=new Intent(getApplication(),SendMessagePage.class);
                startActivity(n);
            }
        });


    }
}
