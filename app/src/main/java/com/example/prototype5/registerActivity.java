package com.example.prototype5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class registerActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_register=(Button) findViewById(R.id.registerBtn);
        Button btn_loginBtn=(Button) findViewById(R.id.loginBtn);
        ImageButton btn_back=(ImageButton) findViewById(R.id.backBtn2);

        btn_register.setOnClickListener(this);
        btn_loginBtn.setOnClickListener(this);
        btn_back.setOnClickListener(this);

//        btn_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//
//        btn_register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent( registerActivity.this,registerActivity.class);
//                startActivity(intent);
//            }
//        });
//
//
//        btn_loginAcc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent( registerActivity.this,loginActivity.class);
//                startActivity(intent);
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.registerBtn:
                Intent intent=new Intent( registerActivity.this,registerActivity.class);
                startActivity(intent);
                break;
            case R.id.loginBtn:
                Intent intent2=new Intent( registerActivity.this,loginActivity.class);
                startActivity(intent2);
                break;
            case R.id.backBtn2:
                finish();
                break;
            default:
                break;

        }
    }
}