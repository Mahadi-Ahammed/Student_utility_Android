package com.example.mainscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    ImageView btn_addNotes, btn_viewNotes, btn_cgpaConter, btn_tuitionfeeCalculator;
    Button btnadddata, btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Four image buttons are




        btn_addNotes = (ImageView) findViewById(R.id.btn_addNotes);

        btn_addNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), adddata.class);
                startActivity(intent);
            }
        });

        btn_viewNotes = (ImageView) findViewById(R.id.btn_viewNotes);

        btn_viewNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), viewNotes.class);
                startActivity(intent);
            }
        });


        btn_cgpaConter = (ImageView) findViewById(R.id.btn_cgpaConter);

        btn_cgpaConter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), cgpaCounter.class);
                startActivity(intent);
            }
        });

        btn_tuitionfeeCalculator = (ImageView) findViewById(R.id.btn_tuitionfeeCalculator);

        btn_tuitionfeeCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), tuitionfeeCalculator.class);
                startActivity(intent);
            }
        });




    }
}