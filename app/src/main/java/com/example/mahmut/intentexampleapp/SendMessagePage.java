package com.example.mahmut.intentexampleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessagePage extends AppCompatActivity {

    Button btn1;
    EditText edittext1,edittext2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message_page);

        btn1=(Button)findViewById(R.id.send_button);
        edittext1=(EditText)findViewById(R.id.textview_message);
        edittext2=(EditText)findViewById(R.id.textview_sendto);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+edittext2.getText().toString()));
                n.putExtra("sms_body",edittext1.getText().toString());
                startActivity(n);
            }
        });

    }
}
