package com.example.daniel.overwatchsound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class blueButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_button);

        ////////////////////////////////////////////////////////////////////////////////////
        // CODE FOR DEFENSE CHARACTER MENU BUTTON SETUP ////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////

        //Call for CharacterActivity Buttons
        Button bastion = (Button)findViewById(R.id.char_bastion);
        Button hanzo = (Button)findViewById(R.id.char_hanzo);
        Button junkrat = (Button)findViewById(R.id.char_junkrat);
        Button mei = (Button)findViewById(R.id.char_mei);
        Button torbjorn = (Button)findViewById(R.id.char_torbjorn);
        Button widowmaker = (Button)findViewById(R.id.char_widowmaker);

        //Intents of CharacterActivity Buttons
       bastion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bastionMenu = new Intent(blueButton.this,voice_bastion.class);
                startActivity(bastionMenu);
            }
        });

        hanzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  hanzoMenu = new Intent(blueButton.this,voice_hanzo.class);
                startActivity( hanzoMenu);
            }
        });

        junkrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent junkratMenu = new Intent(blueButton.this,voice_junkrat.class);
                startActivity(junkratMenu);
            }
        });

        mei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meiMenu = new Intent(blueButton.this,voice_mei.class);
                startActivity(meiMenu);
            }
        });

        torbjorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent torbjornMenu = new Intent(blueButton.this,voice_torbjorn.class);
                startActivity(torbjornMenu);
            }
        });

        widowmaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent widowmakerMenu = new Intent(blueButton.this,voice_widowmaker.class);
                startActivity(widowmakerMenu);
            }
        });
    }
}
