package com.example.prototype5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_register;
    Button btn_loginAcc;
    Button btn_freeTrial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_register=(Button) findViewById(R.id.registerBtn);
        btn_loginAcc=(Button) findViewById(R.id.loginAccBtn);
        btn_freeTrial=(Button) findViewById(R.id.freeTrialBtn);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( MainActivity.this,registerActivity.class);
                startActivity(intent);
            }
        });


        btn_loginAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( MainActivity.this,loginActivity.class);
                startActivity(intent);
            }
        });

        btn_freeTrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( MainActivity.this,surveyActivity.class);
                startActivity(intent);
            }
        });
    }


}
