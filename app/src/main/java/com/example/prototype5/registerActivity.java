package com.example.prototype5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class registerActivity extends AppCompatActivity {

    Button btn_register;
    Button btn_loginAcc;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_register=(Button) findViewById(R.id.registerBtn);
        btn_loginAcc=(Button) findViewById(R.id.loginAccBtn);
        btn_back=(ImageButton) findViewById(R.id.backBtn2);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( registerActivity.this,registerActivity.class);
                startActivity(intent);
            }
        });


        btn_loginAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( registerActivity.this,loginActivity.class);
                startActivity(intent);
            }
        });
    }
}