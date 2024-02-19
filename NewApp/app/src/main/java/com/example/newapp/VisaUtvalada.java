package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VisaUtvalada extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_utvalada);

        //getting the clothes and size from the previous activity
        String clothes = getIntent().getStringExtra("CLOTHES");
        String size = getIntent().getStringExtra("SIZE");

        //get reference of textViews to show clothes and size from the activity_visa_utvalada.xml
        TextView visaklader = findViewById(R.id.visakläder);
        TextView visaStorlek = findViewById(R.id.visaStrolek);

        // to display the clothes and size on the screen
        visaklader.setText(clothes);
        visaStorlek.setText(size);
    }
}