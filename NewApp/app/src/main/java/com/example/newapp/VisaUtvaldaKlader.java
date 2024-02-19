package com.example.newapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VisaUtvaldaKlader extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_utvalda_klader);

        //getting the clothes and size from the previous activity
        String clothes = getIntent().getStringExtra("CLOTHES");
        String size = getIntent().getStringExtra("SIZE");

        //get reference of textViews to show clothes and size from the activity_visa_utvalda_klader.xml
        TextView visaklader = findViewById(R.id.visakläder);
        TextView visaStorlek = findViewById(R.id.visaStrolek);

        // to display the clothes and size on the screen
        visaklader.setText(clothes);
        visaStorlek.setText(size);

        Button bytaSida = findViewById(R.id.reg);
        bytaSida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bytaAct();
            }
        });

    }
    private void bytaAct(){
        Intent intent = new Intent( this, VisaAdress.class);
        startActivity(intent);
    }


}