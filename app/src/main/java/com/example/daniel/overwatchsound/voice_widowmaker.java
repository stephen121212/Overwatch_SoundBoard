package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_widowmaker extends AppCompatActivity {

    MediaPlayer widowmaker1;
    MediaPlayer widowmaker2;
    MediaPlayer widowmaker3;
    MediaPlayer widowmaker4;
    MediaPlayer widowmaker5;
    MediaPlayer widowmaker6;
    MediaPlayer widowmaker7;
    MediaPlayer widowmaker8;
    MediaPlayer widowmaker9;
    MediaPlayer widowmaker10;
    MediaPlayer widowmaker0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widowmaker_voice_menu);

        //Widowmaker code
        widowmaker1 = MediaPlayer.create(this, R.raw.widowmaker_a_single_death_can_change_everything);
        widowmaker2 = MediaPlayer.create(this, R.raw.widowmaker_encore);
        widowmaker3 = MediaPlayer.create(this, R.raw.widowmaker_let_them_eat_cake);
        widowmaker4 = MediaPlayer.create(this, R.raw.widowmaker_look_for_the_woman);
        widowmaker5 = MediaPlayer.create(this, R.raw.widowmaker_magnifique);
        widowmaker6 = MediaPlayer.create(this, R.raw.widowmaker_one_shot_one_kill);
        widowmaker7 = MediaPlayer.create(this, R.raw.widowmaker_ouh_la_la);
        widowmaker8 = MediaPlayer.create(this, R.raw.widowmaker_pathetic);
        widowmaker9 = MediaPlayer.create(this, R.raw.widowmaker_step_into_my_parlor_said_the_spider_to_the_fly);
        widowmaker10 = MediaPlayer.create(this, R.raw.widowmaker_whats_an_aimbot);
        widowmaker0 = MediaPlayer.create(this, R.raw.widowmaker_ultimate);

    }

    public void widowmaker1(View view) {
        widowmaker1.start();
    }
    public void widowmaker2(View view) {
        widowmaker2.start();
    }
    public void widowmaker3(View view) {
        widowmaker3.start();
    }
    public void widowmaker4(View view) {
        widowmaker4.start();
    }
    public void widowmaker5(View view) {
        widowmaker5.start();
    }
    public void widowmaker6(View view) {
        widowmaker6.start();
    }
    public void widowmaker7(View view) {
        widowmaker7.start();
    }
    public void widowmaker8(View view) {
        widowmaker8.start();
    }
    public void widowmaker9(View view) {
        widowmaker9.start();
    }
    public void widowmaker10(View view) {
        widowmaker10.start();
    }
    public void widowmaker0(View view) {
        widowmaker0.start();
    }
}