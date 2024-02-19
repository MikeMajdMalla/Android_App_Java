package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }


    public void loggaInClick(View view) {

        EditText minTextView = findViewById(R.id.userName);
        String username = minTextView.getText().toString();
        EditText minTextView2 = findViewById(R.id.password);
        String pass = minTextView2.getText().toString();

        if (username.equals("Mike") && pass.equals("admin")) {
            Intent nySida = new Intent(this, AskActivity.class);
            startActivity(nySida);
        } else {
            TextView messageView = findViewById(R.id.erormessage);
            messageView.setText("Fel inlogning");
        }


    }


}





