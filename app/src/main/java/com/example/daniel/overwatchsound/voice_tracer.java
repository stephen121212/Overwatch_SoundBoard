package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_tracer extends AppCompatActivity {

    MediaPlayer tracer1;
    MediaPlayer tracer2;
    MediaPlayer tracer3;
    MediaPlayer tracer4;
    MediaPlayer tracer5;
    MediaPlayer tracer6;
    MediaPlayer tracer7;
    MediaPlayer tracer8;
    MediaPlayer tracer9;
    MediaPlayer tracer10;
    MediaPlayer tracer11;
    MediaPlayer tracer12;
    MediaPlayer tracer13;
    MediaPlayer tracer14;
    MediaPlayer tracer0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracer_voice_menu);

        //Tracer linkups
        tracer1 = MediaPlayer.create(this, R.raw.tracer_aww_rubbish);
        tracer2 = MediaPlayer.create(this, R.raw.tracer_be_right_back);
        tracer3 = MediaPlayer.create(this, R.raw.tracer_check_me_out);
        tracer4 = MediaPlayer.create(this, R.raw.tracer_cheers_love_the_cavalrys_here);
        tracer5 = MediaPlayer.create(this, R.raw.tracer_eat_my_dust);
        tracer6 = MediaPlayer.create(this, R.raw.tracer_ever_get_that_feeling_of_deja_vu);
        tracer7 = MediaPlayer.create(this, R.raw.tracer_i_have_this_under_control);
        tracer8 = MediaPlayer.create(this, R.raw.tracer_its_in_the_bag);
        tracer9 = MediaPlayer.create(this, R.raw.tracer_keep_calm_and_tracer_on);
        tracer10 = MediaPlayer.create(this, R.raw.tracer_looks_like_you_need_a_time_out);
        tracer11 = MediaPlayer.create(this, R.raw.tracer_ooh_scary);
        tracer12 = MediaPlayer.create(this, R.raw.tracer_she_shoots_she_scores);
        tracer13 = MediaPlayer.create(this, R.raw.tracer_the_world_could_always_use_more_heroes);
        tracer14 = MediaPlayer.create(this, R.raw.tracer_you_got_whats_coming_to_ya);
        tracer0 = MediaPlayer.create(this, R.raw.tracer_ultimate);
    }

    public void tracer1(View view) {
        tracer1.start();
    }
    public void tracer2(View view) {
        tracer2.start();
    }
    public void tracer3(View view) {
        tracer3.start();
    }
    public void tracer4(View view) {
        tracer4.start();
    }
    public void tracer5(View view) {
        tracer5.start();
    }
    public void tracer6(View view) {
        tracer6.start();
    }
    public void tracer7(View view) {
        tracer7.start();
    }
    public void tracer8(View view) {
        tracer8.start();
    }
    public void tracer9(View view) {
        tracer9.start();
    }
    public void tracer10(View view) {
        tracer10.start();
    }
    public void tracer11(View view) {
        tracer11.start();
    }
    public void tracer12(View view) {
        tracer12.start();
    }
    public void tracer13(View view) {
        tracer13.start();
    }
    public void tracer14(View view) {
        tracer14.start();
    }
    public void tracer0(View view) {
        tracer0.start();
    }
}