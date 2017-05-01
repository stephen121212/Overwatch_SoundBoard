package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_sombra extends AppCompatActivity {

    MediaPlayer sombra1;
    MediaPlayer sombra2;
    MediaPlayer sombra3;
    MediaPlayer sombra4;
    MediaPlayer sombra5;
    MediaPlayer sombra6;
    MediaPlayer sombra7;
    MediaPlayer sombra8;
    MediaPlayer sombra9;
    MediaPlayer sombra10;
    MediaPlayer sombra11;
    MediaPlayer sombra12;
    MediaPlayer sombra13;
    MediaPlayer sombra0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sombra_voice_menu);

        //Sombra links
        sombra1 = MediaPlayer.create(this, R.raw.sombra_boop);
        sombra2 = MediaPlayer.create(this, R.raw.sombra_cool);
        sombra3 = MediaPlayer.create(this, R.raw.sombra_did_you_mean_to_do_that);
        sombra4 = MediaPlayer.create(this, R.raw.sombra_good_one);
        sombra5 = MediaPlayer.create(this, R.raw.sombra_hack_the_planet);
        sombra6 = MediaPlayer.create(this, R.raw.sombra_i_know_whos_been_naughty);
        sombra7 = MediaPlayer.create(this, R.raw.sombra_i_think_youre_in_over_your_head);
        sombra8 = MediaPlayer.create(this, R.raw.sombra_just_squishing_a_bug);
        sombra9 = MediaPlayer.create(this, R.raw.sombra_mess_with_the_best_and_die_like_the_rest);
        sombra10 = MediaPlayer.create(this, R.raw.sombra_show_me_what_you_got);
        sombra11 = MediaPlayer.create(this, R.raw.sombra_wheres_the_fun_in_playing_fair);
        sombra12 = MediaPlayer.create(this, R.raw.sombra_youre_just_a_glitch_in_the_system);
        sombra13 = MediaPlayer.create(this, R.raw.sombra_youre_taking_this_very_seriously);
        sombra0 = MediaPlayer.create(this, R.raw.sombra_ultimate);
    }

    public void sombra1(View view) {
        sombra1.start();
    }
    public void sombra2(View view) {
        sombra2.start();
    }
    public void sombra3(View view) {
        sombra3.start();
    }
    public void sombra4(View view) {
        sombra4.start();
    }
    public void sombra5(View view) {
        sombra5.start();
    }
    public void sombra6(View view) {
        sombra6.start();
    }
    public void sombra7(View view) {
        sombra7.start();
    }
    public void sombra8(View view) {
        sombra8.start();
    }
    public void sombra9(View view) {
        sombra9.start();
    }
    public void sombra10(View view) {
        sombra10.start();
    }
    public void sombra11(View view) {
        sombra11.start();
    }
    public void sombra12(View view) {
        sombra12.start();
    }
    public void sombra13(View view) {
        sombra13.start();
    }
    public void sombra0(View view) {
        sombra0.start();
    }
}