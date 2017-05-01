package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_pharah extends AppCompatActivity {

    MediaPlayer pharah1;
    MediaPlayer pharah2;
    MediaPlayer pharah3;
    MediaPlayer pharah4;
    MediaPlayer pharah5;
    MediaPlayer pharah6;
    MediaPlayer pharah7;
    MediaPlayer pharah8;
    MediaPlayer pharah9;
    MediaPlayer pharah10;
    MediaPlayer pharah11;
    MediaPlayer pharah12;
    MediaPlayer pharah0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharah_voice_menu);

        //Pharah links
        pharah1 = MediaPlayer.create(this, R.raw.pharah_aerial_superiority_achieved);
        pharah2 = MediaPlayer.create(this, R.raw.pharah_fly_like_an_egyptian);
        pharah3 = MediaPlayer.create(this, R.raw.pharah_flying_the_friendly_skies);
        pharah4 = MediaPlayer.create(this, R.raw.pharah_ive_got_you_on_my_radar);
        pharah5 = MediaPlayer.create(this, R.raw.pharah_leave_this_to_a_professional);
        pharah6 = MediaPlayer.create(this, R.raw.pharah_not_a_chance);
        pharah7 = MediaPlayer.create(this, R.raw.pharah_play_nice_play_pharah);
        pharah8 = MediaPlayer.create(this, R.raw.pharah_put_your_security_in_my_hands);
        pharah9 = MediaPlayer.create(this, R.raw.pharah_rocket_jump_that_sounds_dangerous);
        pharah10 = MediaPlayer.create(this, R.raw.pharah_shot_down);
        pharah11 = MediaPlayer.create(this, R.raw.pharah_sorry_but_i_need_to_jet);
        pharah12 = MediaPlayer.create(this, R.raw.pharah_we_are_in_this_together);
        pharah0 = MediaPlayer.create(this, R.raw.pharah_ultimate);
    }

    public void pharah1(View view) {
        pharah1.start();
    }

    public void pharah2(View view) {
        pharah2.start();
    }

    public void pharah3(View view) {
        pharah3.start();
    }

    public void pharah4(View view) {
        pharah4.start();
    }

    public void pharah5(View view) {
        pharah5.start();
    }

    public void pharah6(View view) {
        pharah6.start();
    }

    public void pharah7(View view) {
        pharah7.start();
    }

    public void pharah8(View view) {
        pharah8.start();
    }

    public void pharah9(View view) {
        pharah9.start();
    }

    public void pharah10(View view) {
        pharah10.start();
    }

    public void pharah11(View view) {
        pharah11.start();
    }

    public void pharah12(View view) {
        pharah12.start();
    }

    public void pharah0(View view) {
        pharah0.start();
    }
}