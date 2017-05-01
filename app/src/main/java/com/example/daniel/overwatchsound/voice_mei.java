package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_mei extends AppCompatActivity {

    MediaPlayer mei1;
    MediaPlayer mei2;
    MediaPlayer mei3;
    MediaPlayer mei4;
    MediaPlayer mei5;
    MediaPlayer mei6;
    MediaPlayer mei7;
    MediaPlayer mei8;
    MediaPlayer mei9;
    MediaPlayer mei10;
    MediaPlayer mei11;
    MediaPlayer mei12;
    MediaPlayer mei0;
    MediaPlayer mei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mei_voice_menu);

        //Linkups for mei
        mei1 = MediaPlayer.create(this, R.raw.mei_ameizing);
        mei2 = MediaPlayer.create(this, R.raw.mei_fight_for_our_world);
        mei3 = MediaPlayer.create(this, R.raw.mei_hang_in_there);
        mei4 = MediaPlayer.create(this, R.raw.mei_hey_chill_out);
        mei5 = MediaPlayer.create(this, R.raw.mei_i_hope_you_learned_your_lesson);
        mei6 = MediaPlayer.create(this, R.raw.mei_okay_1);
        mei7 = MediaPlayer.create(this, R.raw.mei_ouch_are_you_okay);
        mei8 = MediaPlayer.create(this, R.raw.mei_overcome_all_obstacles);
        mei9 = MediaPlayer.create(this, R.raw.mei_sorry_sorry_im_sorry_sorry);
        mei10 = MediaPlayer.create(this, R.raw.mei_that_was_great);
        mei11 = MediaPlayer.create(this, R.raw.mei_yay_1);
        mei12 = MediaPlayer.create(this, R.raw.mei_you_have_to_let_it_go);
        mei0 = MediaPlayer.create(this, R.raw.mei_ultimate);
    }

    public void mei1(View view) {
        mei1.start();
    }

    public void mei2(View view) {
        mei2.start();
    }

    public void mei3(View view) {
        mei3.start();
    }

    public void mei4(View view) {
        mei4.start();
    }

    public void mei5(View view) {
        mei5.start();
    }

    public void mei6(View view) {
        mei6.start();
    }

    public void mei7(View view) {
        mei7.start();
    }

    public void mei8(View view) {
        mei8.start();
    }

    public void mei9(View view) {
        mei9.start();
    }

    public void mei10(View view) {
        mei10.start();
    }

    public void mei11(View view) {
        mei11.start();
    }

    public void mei12(View view) {
        mei12.start();
    }

    public void mei0(View view) {
        mei0.start();
    }
}