package com.example.daniel.overwatchsound;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class redButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_button);

        ////////////////////////////////////////////////////////////////////////////////////
        // CODE FOR OFFENSE CHARACTER MENU BUTTON SETUP ////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////

        //Call for CharacterActivity Buttons
        Button genji = (Button)findViewById(R.id.char_genji);
        Button mccree = (Button)findViewById(R.id.char_mccree);
        Button pharah = (Button)findViewById(R.id.char_pharah);
        Button reaper = (Button)findViewById(R.id.char_reaper);
        Button s76 = (Button)findViewById(R.id.char_s76);
        Button sombra = (Button)findViewById(R.id.char_sombra);
        Button tracer = (Button)findViewById(R.id.char_tracer);

        //Intents of CharacterActivity Buttons
        genji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genjiMenu = new Intent(redButton.this,voice_genji.class);
                startActivity(genjiMenu);
            }
        });

        mccree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mccreeMenu = new Intent(redButton.this,voice_mccree.class);
                startActivity(mccreeMenu);
            }
        });

        pharah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pharahMenu = new Intent(redButton.this,voice_pharah.class);
                startActivity(pharahMenu);
            }
        });

        reaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reaperMenu = new Intent(redButton.this,voice_reaper.class);
                startActivity(reaperMenu);
            }
        });

        s76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s76Menu = new Intent(redButton.this,voice_s76.class);
                startActivity(s76Menu);
            }
        });

        sombra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sombraMenu = new Intent(redButton.this,voice_sombra.class);
                startActivity(sombraMenu);
            }
        });

       tracer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracerMenu = new Intent(redButton.this,voice_tracer.class);
                startActivity(tracerMenu);
            }
        });
    }
}
