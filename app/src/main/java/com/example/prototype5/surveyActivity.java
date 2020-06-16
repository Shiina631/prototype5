package com.example.prototype5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class surveyActivity extends AppCompatActivity {

    Button btn_bodyPartSelect;
    ImageButton btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        btn_bodyPartSelect=(Button) findViewById(R.id.bodyPartSelectBtn);
        btn_back=(ImageButton) findViewById(R.id.backBtn3);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_bodyPartSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( surveyActivity.this,bodyPartSelectActivity.class);
                startActivity(intent);
            }
        });
    }
}