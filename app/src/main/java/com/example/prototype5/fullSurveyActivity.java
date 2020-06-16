package com.example.prototype5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class fullSurveyActivity extends AppCompatActivity {

    Button btn_mainPage;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_survey);

        btn_back=(ImageButton) findViewById(R.id.backBtn6);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_mainPage=(Button) findViewById(R.id.userMainPageBtn);

        btn_mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( fullSurveyActivity.this,mainPageActivity.class);
                startActivity(intent);
            }
        });
    }
}