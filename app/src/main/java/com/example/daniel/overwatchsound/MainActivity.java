package com.example.daniel.overwatchsound;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ////////////////////////////////////////////////////////////////////////////////////
        // CODE FOR MENU BUTTON SETUP //////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////


        //Call for menu buttons
        Button redOffense = (Button)findViewById(R.id.offense);
        Button blueDefense = (Button)findViewById(R.id.defense);
        Button greenTank = (Button)findViewById(R.id.tank);
        Button yellowSupport = (Button)findViewById(R.id.Support);

        redOffense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu1 = new Intent(MainActivity.this,redButton.class);
                startActivity(menu1);
            }
        });

        blueDefense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu2 = new Intent(MainActivity.this,blueButton.class);
                startActivity(menu2);
            }
        });

        greenTank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu3 = new Intent(MainActivity.this,greenButton.class);
                startActivity(menu3);
            }
        });

        yellowSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu4 = new Intent(MainActivity.this,yellowButton.class);
                startActivity(menu4);
            }
        });
    }
}
