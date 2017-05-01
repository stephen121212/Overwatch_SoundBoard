package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_s76 extends AppCompatActivity {

    MediaPlayer s1;
    MediaPlayer s2;
    MediaPlayer s3;
    MediaPlayer s4;
    MediaPlayer s5;
    MediaPlayer s6;
    MediaPlayer s7;
    MediaPlayer s8;
    MediaPlayer s9;
    MediaPlayer s10;
    MediaPlayer s0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s76_voice_menu);

        //Soldier 76 links
        s1 = MediaPlayer.create(this, R.raw.s67_im_an_army_of_one);
        s2 = MediaPlayer.create(this, R.raw.s76__im_the_one_who_does_his_job);
        s3 = MediaPlayer.create(this, R.raw.s76_i_didnt_start_this_war_but_im_damn_well_gonna_finish_it);
        s4 = MediaPlayer.create(this, R.raw.s76_ive_still_got_it);
        s5 = MediaPlayer.create(this, R.raw.s76_knock_knock);
        s6 = MediaPlayer.create(this, R.raw.s76_old_soldiers_never_die_and_they_dont_fade_away);
        s7 = MediaPlayer.create(this, R.raw.s76_thats_sir_to_you);
        s8 = MediaPlayer.create(this, R.raw.s76_you_didnt_make_the_cut);
        s9 = MediaPlayer.create(this, R.raw.s76_you_want_a_medal);
        s10 = MediaPlayer.create(this, R.raw.s76_young_punks_get_of_my_lawn);
        s0 = MediaPlayer.create(this, R.raw.s76_ultimate);
    }

    public void s1(View view) {
        s1.start();
    }
    public void s2(View view) {
        s2.start();
    }
    public void s3(View view) {
        s3.start();
    }
    public void s4(View view) {
        s4.start();
    }
    public void s5(View view) {
        s5.start();
    }
    public void s6(View view) {
        s6.start();
    }
    public void s7(View view) {
        s7.start();
    }
    public void s8(View view) {
        s8.start();
    }
    public void s9(View view) {
        s9.start();
    }
    public void s10(View view) {
        s10.start();
    }
    public void s0(View view) {
        s0.start();
    }
}