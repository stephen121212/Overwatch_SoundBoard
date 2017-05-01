package com.example.daniel.overwatchsound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yellowButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_button);

        ////////////////////////////////////////////////////////////////////////////////////
        // CODE FOR SUPPORT CHARACTER MENU BUTTON SETUP ////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////

        //Call for CharacterActivity Buttons
        Button ana = (Button)findViewById(R.id.char_ana);
        Button lucio = (Button)findViewById(R.id.char_lucio);
        Button mercy = (Button)findViewById(R.id.char_mercy);
        Button symmetra = (Button)findViewById(R.id.char_symmetra);
        Button zenyatta = (Button)findViewById(R.id.char_zenyatta);

        //Intents of CharacterActivity Buttons
        ana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anaMenu = new Intent(yellowButton.this,voice_ana.class);
                startActivity(anaMenu);
            }
        });

        lucio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lucioMenu = new Intent(yellowButton.this,voice_lucio.class);
                startActivity(lucioMenu);
            }
        });

        mercy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mercyMenu = new Intent(yellowButton.this,voice_mercy.class);
                startActivity(mercyMenu);
            }
        });

        symmetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent symmetraMenu = new Intent(yellowButton.this,voice_symmetra.class);
                startActivity(symmetraMenu);
            }
        });

        zenyatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zenyattaMenu = new Intent(yellowButton.this,voice_zenyatta.class);
                startActivity(zenyattaMenu);
            }
        });
    }
}
