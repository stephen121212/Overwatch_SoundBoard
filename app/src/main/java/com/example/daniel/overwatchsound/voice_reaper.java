package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_reaper extends AppCompatActivity {

    MediaPlayer reaper1;
    MediaPlayer reaper2;
    MediaPlayer reaper3;
    MediaPlayer reaper4;
    MediaPlayer reaper5;
    MediaPlayer reaper6;
    MediaPlayer reaper7;
    MediaPlayer reaper0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reaper_voice_menu);

        //Reaper linkage
        reaper1 = MediaPlayer.create(this, R.raw.reaper_another_one_off_the_list);
        reaper2 = MediaPlayer.create(this, R.raw.reaper_dead_man_walking);
        reaper3 = MediaPlayer.create(this, R.raw.reaper_dead_man_walking1);
        reaper4 = MediaPlayer.create(this, R.raw.reaper_havent_been_back_here_for_a_while);
        reaper5 = MediaPlayer.create(this, R.raw.reaper_ill_do_this_alone_if_i_have_to);
        reaper6 = MediaPlayer.create(this, R.raw.reaper_psychopath);
        reaper7 = MediaPlayer.create(this, R.raw.reaper_what_are_you_looking_at);
        reaper0 = MediaPlayer.create(this, R.raw.reaper_ultimate);
    }

    public void reaper1(View view) {
        reaper1.start();
    }

    public void reaper2(View view) {
        reaper2.start();
    }

    public void reaper3(View view) {
        reaper3.start();
    }

    public void reaper4(View view) {
        reaper4.start();
    }

    public void reaper5(View view) {
        reaper5.start();
    }

    public void reaper6(View view) {
        reaper6.start();
    }

    public void reaper7(View view) {
        reaper7.start();
    }

    public void reaper0(View view) {
        reaper0.start();
    }
}