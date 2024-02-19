package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class TaEmotKleder extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ge_bort_klader);

        Spinner typeSpinner = findViewById(R.id.newSpinner);

        Spinner sizeSpinner = findViewById(R.id.storlek);
        Button tillkassa1 = findViewById(R.id.tillkassa);

        tillkassa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaEmotKleder.this, VisaUtvaldaKlader.class);
                intent.putExtra("CLOTHES", typeSpinner.getSelectedItem().toString());
                intent.putExtra("SIZE", sizeSpinner.getSelectedItem().toString());
                startActivity(intent);
            }
        });

    }

}