package com.example.mahmut.intentexampleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallingPage extends AppCompatActivity {

    Button btn1;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_page);


       edittext=(EditText)findViewById(R.id.editText);

        btn1=(Button)findViewById(R.id.call_button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n=new Intent(Intent.ACTION_DIAL);
                n.setData(Uri.parse("tel:"+edittext.getText().toString()));

                startActivity(n);
            }
        });


    }
}
