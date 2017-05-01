package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_zenyatta extends AppCompatActivity {

    MediaPlayer zenyatta1;
    MediaPlayer zenyatta2;
    MediaPlayer zenyatta3;
    MediaPlayer zenyatta4;
    MediaPlayer zenyatta5;
    MediaPlayer zenyatta6;
    MediaPlayer zenyatta7;
    MediaPlayer zenyatta8;
    MediaPlayer zenyatta9;
    MediaPlayer zenyatta10;
    MediaPlayer zenyatta11;
    MediaPlayer zenyatta0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zenyatta_voice_menu);

        //Zenyatta Mediaplayer code
        zenyatta1 = MediaPlayer.create(this, R.raw.zenyatta_be_one_with_the_universe);
        zenyatta2 = MediaPlayer.create(this, R.raw.zenyatta_darkness_falls);
        zenyatta3 = MediaPlayer.create(this, R.raw.zenyatta_embrace_tranquility);
        zenyatta4 = MediaPlayer.create(this, R.raw.zenyatta_even_the_teacher_can_learn_from_his_student);
        zenyatta5 = MediaPlayer.create(this, R.raw.zenyatta_open_your_mind);
        zenyatta6 = MediaPlayer.create(this, R.raw.zenyatta_the_iris_embraces_you);
        zenyatta7 = MediaPlayer.create(this, R.raw.zenyatta_there_is_disquiet_in_your_soul);
        zenyatta8 = MediaPlayer.create(this, R.raw.zenyatta_to_us_all_i_miss_him_greatly);
        zenyatta9 = MediaPlayer.create(this, R.raw.zenyatta_true_self_is_without_form);
        zenyatta10 = MediaPlayer.create(this, R.raw.zenyatta_walk_in_harmony);
        zenyatta11 = MediaPlayer.create(this, R.raw.zenyatta_we_are_in_harmony);
        zenyatta0 = MediaPlayer.create(this, R.raw.zenyatta_ultimate);
    }

    public void zenyatta1(View view) {
        zenyatta1.start();
    }
    public void zenyatta2(View view) {
        zenyatta2.start();
    }
    public void zenyatta3(View view) {
        zenyatta3.start();
    }
    public void zenyatta4(View view) {
        zenyatta4.start();
    }
    public void zenyatta5(View view) {
        zenyatta5.start();
    }
    public void zenyatta6(View view) {
        zenyatta6.start();
    }
    public void zenyatta7(View view) {
        zenyatta7.start();
    }
    public void zenyatta8(View view) {
        zenyatta8.start();
    }
    public void zenyatta9(View view) {
        zenyatta9.start();
    }
    public void zenyatta10(View view) {
        zenyatta10.start();
    }
    public void zenyatta11(View view) {
        zenyatta11.start();
    }
    public void zenyatta0(View view) {
        zenyatta0.start();
    }
}