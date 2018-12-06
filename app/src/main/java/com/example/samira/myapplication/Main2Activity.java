package com.example.samira.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        TextView textView=findViewById(R.id.edtname);
        textView.setText( intent.getStringExtra("Name"));
        TextView textView1=findViewById(R.id.edtemail);
        textView1.setText( intent.getStringExtra("Email"));
        TextView textView2=findViewById(R.id.edtage);
        textView2.setText( intent.getStringExtra("Age"));
        TextView textView3=findViewById(R.id.edtphone);
        textView3.setText( intent.getStringExtra("Phone"));
    }
}
