package com.example.daniel.overwatchsound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class greenButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_button);

        ////////////////////////////////////////////////////////////////////////////////////
        // CODE FOR TANK CHARACTER MENU BUTTON SETUP ////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////

        //Call for CharacterActivity Buttons
        Button dva = (Button)findViewById(R.id.char_dva);
        Button reinhardt = (Button)findViewById(R.id.char_reinhardt);
        Button roadhog = (Button)findViewById(R.id.char_roadhog);
        Button winston = (Button)findViewById(R.id.char_winston);
        Button zarya = (Button)findViewById(R.id.char_zarya);

        //Intents of CharacterActivity Buttons
       dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dvaMenu = new Intent(greenButton.this,voice_dva.class);
                startActivity(dvaMenu);
            }
        });

        reinhardt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reinhardtMenu = new Intent(greenButton.this,voice_reinhardt.class);
                startActivity(reinhardtMenu);
            }
        });

        roadhog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roadhogMenu = new Intent(greenButton.this,voice_roadhog.class);
                startActivity(roadhogMenu);
            }
        });

        winston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent winstonMenu = new Intent(greenButton.this,voice_winston.class);
                startActivity(winstonMenu);
            }
        });

        zarya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zaryaMenu = new Intent(greenButton.this,voice_zarya.class);
                startActivity(zaryaMenu);
            }
        });
    }
}
