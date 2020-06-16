package com.example.prototype5;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class bodyPartSelectActivity extends AppCompatActivity {

    Button btn_takePhoto;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part_select);

        btn_takePhoto=(Button) findViewById(R.id.takePhotoBtn);
        btn_back=(ImageButton) findViewById(R.id.backBtn4);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( bodyPartSelectActivity.this,takePhotoActivity.class);
                startActivity(intent);
            }
        });




    }


}