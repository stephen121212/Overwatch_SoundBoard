package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_reinhardt extends AppCompatActivity {

    MediaPlayer reinhardt1;
    MediaPlayer reinhardt2;
    MediaPlayer reinhardt3;
    MediaPlayer reinhardt4;
    MediaPlayer reinhardt5;
    MediaPlayer reinhardt6;
    MediaPlayer reinhardt7;
    MediaPlayer reinhardt8;
    MediaPlayer reinhardt9;
    MediaPlayer reinhardt10;
    MediaPlayer reinhardt11;
    MediaPlayer reinhardt12;
    MediaPlayer reinhardt13;
    MediaPlayer reinhardt14;
    MediaPlayer reinhardt0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reinhardt_voice_menu);

        //Reinhardts Mediaplayer
        reinhardt1 = MediaPlayer.create(this, R.raw.reinhardt_100_german_power);
        reinhardt2 = MediaPlayer.create(this, R.raw.reinhardt_are_you_afraid);
        reinhardt3 = MediaPlayer.create(this, R.raw.reinhardt_are_you_chicken);
        reinhardt4 = MediaPlayer.create(this, R.raw.reinhardt_catch_phrase);
        reinhardt5 = MediaPlayer.create(this, R.raw.reinhardt_crusader_online);
        reinhardt6 = MediaPlayer.create(this, R.raw.reinhardt_crushing_machine);
        reinhardt7 = MediaPlayer.create(this, R.raw.reinhardt_german_engineering);
        reinhardt8 = MediaPlayer.create(this, R.raw.reinhardt_honor_and_glory);
        reinhardt9 = MediaPlayer.create(this, R.raw.reinhardt_i_salute_you);
        reinhardt10 = MediaPlayer.create(this, R.raw.reinhardt_lets_show_these_kids_how_its_done);
        reinhardt11 = MediaPlayer.create(this, R.raw.reinhardt_respect_your_elders);
        reinhardt12 = MediaPlayer.create(this, R.raw.reinhardt_smashing);
        reinhardt13 = MediaPlayer.create(this, R.raw.reinhardt_this_old_dog);
        reinhardt14 = MediaPlayer.create(this, R.raw.reinhardt_youre_on_my_naughty_list);
        reinhardt0 = MediaPlayer.create(this, R.raw.reinhardt_ultimate);
    }

    public void reinhardt1(View view) {
        reinhardt1.start();
    }

    public void reinhardt2(View view) {
        reinhardt2.start();
    }

    public void reinhardt3(View view) {
        reinhardt3.start();
    }

    public void reinhardt4(View view) {
        reinhardt4.start();
    }

    public void reinhardt5(View view) {
        reinhardt5.start();
    }

    public void reinhardt6(View view) {
        reinhardt6.start();
    }

    public void reinhardt7(View view) {
        reinhardt7.start();
    }

    public void reinhardt8(View view) {
        reinhardt8.start();
    }

    public void reinhardt9(View view) {
        reinhardt9.start();
    }

    public void reinhardt10(View view) {
        reinhardt10.start();
    }

    public void reinhardt11(View view) {
        reinhardt11.start();
    }

    public void reinhardt12(View view) {
        reinhardt12.start();
    }

    public void reinhardt13(View view) {
        reinhardt13.start();
    }

    public void reinhardt14(View view) {
        reinhardt14.start();
    }

    public void reinhardt0(View view) {
        reinhardt0.start();
    }
}