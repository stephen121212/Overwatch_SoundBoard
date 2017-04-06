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

        //Call for Character Buttons
        Button genji = (Button)findViewById(R.id.char_genji);

        genji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genjiMenu = new Intent(redButton.this,voice_genji.class);
                startActivity(genjiMenu);
            }
        });
    }
}
