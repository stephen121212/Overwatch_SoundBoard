package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_torbjorn extends AppCompatActivity {

    MediaPlayer torbjorn1;
    MediaPlayer torbjorn2;
    MediaPlayer torbjorn3;
    MediaPlayer torbjorn4;
    MediaPlayer torbjorn5;
    MediaPlayer torbjorn6;
    MediaPlayer torbjorn7;
    MediaPlayer torbjorn8;
    MediaPlayer torbjorn0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.torbjorn_voice_menu);

        torbjorn1 = MediaPlayer.create(this, R.raw.torbjorn_armor_come_get_it);
        torbjorn2 = MediaPlayer.create(this, R.raw.torbjorn_armor_here);
        torbjorn3 = MediaPlayer.create(this, R.raw.torbjorn_build_em_up_break_em_down);
        torbjorn4 = MediaPlayer.create(this, R.raw.torbjorn_hehe_theres_something_on_your_dress);
        torbjorn5 = MediaPlayer.create(this, R.raw.torbjorn_i_foresee_great_things_for_you);
        torbjorn6 = MediaPlayer.create(this, R.raw.torbjorn_i_sometimes_wonder_if_all_that_armor_slows_your_brain_down);
        torbjorn7 = MediaPlayer.create(this, R.raw.torbjorn_last_i_checked_i_didnt_ask_for_your_opinion);
        torbjorn8 = MediaPlayer.create(this, R.raw.torbjorn_lets_hear_those_guns);
        torbjorn0 = MediaPlayer.create(this, R.raw.torbjorn_ultimate);
    }

    public void torbjorn1(View view) {
        torbjorn1.start();
    }
    public void torbjorn2(View view) {
        torbjorn2.start();
    }
    public void torbjorn3(View view) {
        torbjorn3.start();
    }
    public void torbjorn4(View view) {
        torbjorn4.start();
    }
    public void torbjorn5(View view) {
        torbjorn5.start();
    }
    public void torbjorn6(View view) {
        torbjorn6.start();
    }
    public void torbjorn7(View view) {
        torbjorn7.start();
    }
    public void torbjorn8(View view) {
        torbjorn8.start();
    }
    public void torbjorn0(View view) {
        torbjorn0.start();
    }
}