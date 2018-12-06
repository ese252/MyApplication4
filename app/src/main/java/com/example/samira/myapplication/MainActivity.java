package com.example.samira.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText=(EditText)findViewById(R.id.edtname);
                EditText editText1=(EditText)findViewById(R.id.edtemail);
                EditText editText2=(EditText)findViewById(R.id.edtage);
                EditText editText3=(EditText)findViewById(R.id.edtphone);


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Name",editText.getText().toString());
                intent.putExtra("Email",editText1.getText().toString());
                intent.putExtra("Age",editText2.getText().toString());
                intent.putExtra("Phone",editText3.getText().toString());
                startActivity(intent);

            }
        });
    }
}
