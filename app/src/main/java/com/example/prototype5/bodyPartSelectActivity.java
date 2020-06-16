package com.example.prototype5;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class bodyPartSelectActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_select);

        Button btn_takePhoto=(Button) findViewById(R.id.takePhotoBtn);
        ImageButton btn_back=(ImageButton) findViewById(R.id.backBtn4);

        btn_takePhoto.setOnClickListener(this);
        btn_back.setOnClickListener(this);

//        btn_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//
//        btn_takePhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent( bodyPartSelectActivity.this,takePhotoActivity.class);
//                startActivity(intent);
//            }
//        });

    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.takePhotoBtn:
                Intent intent=new Intent( bodyPartSelectActivity.this,takePhotoActivity.class);
                startActivity(intent);
                break;
            case R.id.backBtn4:
                finish();
                break;
            default:
                break;

        }
    }


}