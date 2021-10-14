package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_Calculate);
        textview = findViewById(R.id.textView_output);
        edittext = findViewById(R.id.editTexttbox_entervalue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Hello Javapoint",Toast.LENGTH_SHORT).show();
                String s = edittext.getText().toString();
               int Kg =   Integer.parseInt(s);
               Double  pound = 2.205 * Kg;
                textview.setText("The corresponding Value in pound is "+ pound);
            }
        });
    }
}
