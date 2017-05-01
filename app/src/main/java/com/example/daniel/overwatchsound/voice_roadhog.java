package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_roadhog extends AppCompatActivity {

    MediaPlayer roadhog1;
    MediaPlayer roadhog2;
    MediaPlayer roadhog3;
    MediaPlayer roadhog4;
    MediaPlayer roadhog5;
    MediaPlayer roadhog6;
    MediaPlayer roadhog7;
    MediaPlayer roadhog8;
    MediaPlayer roadhog9;
    MediaPlayer roadhog10;
    MediaPlayer roadhog11;
    MediaPlayer roadhog12;
    MediaPlayer roadhog0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roadhog_voice_menu);

        //Roadhog links
        roadhog1 = MediaPlayer.create(this, R.raw.roadhog_got_something_to_say);
        roadhog2 = MediaPlayer.create(this, R.raw.roadhog_hook_line_and_sinker);
        roadhog3 = MediaPlayer.create(this, R.raw.roadhog_life_is_pain_so_is_death);
        roadhog4 = MediaPlayer.create(this, R.raw.roadhog_like_taking_candy_from_a_baby);
        roadhog5 = MediaPlayer.create(this, R.raw.roadhog_muahahaha_yeah);
        roadhog6 = MediaPlayer.create(this, R.raw.roadhog_piece_of_cake);
        roadhog7 = MediaPlayer.create(this, R.raw.roadhog_push_off);
        roadhog8 = MediaPlayer.create(this, R.raw.roadhog_say_bacon_one_more_time);
        roadhog9 = MediaPlayer.create(this, R.raw.roadhog_violence_is_usually_the_answer);
        roadhog10 = MediaPlayer.create(this, R.raw.roadhog_want_some_candy);
        roadhog11 = MediaPlayer.create(this, R.raw.roadhog_welcome_to_the_apocalypse);
        roadhog12 = MediaPlayer.create(this, R.raw.roadhog_were_all_animals);
        roadhog0 = MediaPlayer.create(this, R.raw.roadhog_whats_mine_is_mine_2);
    }

    public void roadhog1(View view) {
        roadhog1.start();
    }

    public void roadhog2(View view) {
        roadhog2.start();
    }

    public void roadhog3(View view) {
        roadhog3.start();
    }

    public void roadhog4(View view) {
        roadhog4.start();
    }

    public void roadhog5(View view) {
        roadhog5.start();
    }

    public void roadhog6(View view) {
        roadhog6.start();
    }

    public void roadhog7(View view) {
        roadhog7.start();
    }

    public void roadhog8(View view) {
        roadhog8.start();
    }

    public void roadhog9(View view) {
        roadhog9.start();
    }

    public void roadhog10(View view) {
        roadhog10.start();
    }

    public void roadhog11(View view) {
        roadhog11.start();
    }

    public void roadhog12(View view) {
        roadhog12.start();
    }

    public void roadhog0(View view) {
        roadhog0.start();
    }
}