package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class GeBortKlader extends AppCompatActivity {

    Button tillkassa1;
    Spinner typeSpinner;
    Spinner sizeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ge_bort_klader);

        tillkassa1 = findViewById(R.id.tillkassa);
        typeSpinner = findViewById(R.id.newSpinner);
        sizeSpinner = findViewById(R.id.storlek);

        tillkassa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                byttillSista();
            }
        });

    }
    private void byttillSista(){
        //start VisaUtvalada activity and pass clothes and size to it
        Intent intent = new Intent (this, VisaUtvalada.class);
        intent.putExtra("CLOTHES", typeSpinner.getSelectedItem().toString());
        intent.putExtra("SIZE", sizeSpinner.getSelectedItem().toString());
        startActivity(intent);
    }

}