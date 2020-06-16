package com.example.prototype5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class loginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_register=(Button) findViewById(R.id.registerBtn);
        Button btn_loginAcc=(Button) findViewById(R.id.loginAccBtn);
        ImageButton btn_back=(ImageButton) findViewById(R.id.backBtn);

        btn_register.setOnClickListener(this);
        btn_loginAcc.setOnClickListener(this);
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
//                Intent intent=new Intent( loginActivity.this,registerActivity.class);
//                startActivity(intent);
//            }
//        });
//
//
//        btn_loginAcc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent( loginActivity.this,loginActivity.class);
//                startActivity(intent);
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.registerBtn:
                Intent intent=new Intent( loginActivity.this,registerActivity.class);
                startActivity(intent);
                break;
            case R.id.loginAccBtn:
                Intent intent2=new Intent( loginActivity.this,loginActivity.class);
                startActivity(intent2);
                break;
            case R.id.backBtn:
                finish();
                break;
            default:
                break;

        }
    }
}