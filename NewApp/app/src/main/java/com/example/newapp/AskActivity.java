package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);

        Button nextPage = findViewById(R.id.butt1);
        Button nextActivity = findViewById(R.id.butt2);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AskActivity.this, TaEmotKleder.class);
                startActivity(intent);
            }
        });



    }
    public void openActivity(){
         Intent intent = new Intent(AskActivity.this, GeBortKlader.class);
         startActivity(intent);

    }







}