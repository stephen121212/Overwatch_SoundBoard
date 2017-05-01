package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_dva extends AppCompatActivity {

    MediaPlayer afk;
    MediaPlayer awYouShouldntHave;
    MediaPlayer awYeah;
    MediaPlayer dva1BadGuys0;
    MediaPlayer easyMode;
    MediaPlayer gg;
    MediaPlayer haepiHallowin;
    MediaPlayer hereComesANewChallenger;
    MediaPlayer iPlayToWinKorean;
    MediaPlayer imBackInTheFight;
    MediaPlayer imNumberOne;
    MediaPlayer lol;
    MediaPlayer loveDva;
    MediaPlayer noHacksRequired;
    MediaPlayer winkyFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dva_voice_menu);

        //MediaPlayer Linkups again
        afk = MediaPlayer.create(this, R.raw.dva_afk);
        awYouShouldntHave = MediaPlayer.create(this, R.raw.dva_aw_you_shouldnt_have);
        awYeah = MediaPlayer.create(this, R.raw.dva_aw_yeah);
        dva1BadGuys0 = MediaPlayer.create(this, R.raw.dva_dva_1_bad_guys_0);
        easyMode = MediaPlayer.create(this, R.raw.dva_easy_mode);
        gg = MediaPlayer.create(this, R.raw.dva_gg);
        haepiHallowin = MediaPlayer.create(this, R.raw.dva_haepi_hallowin);
        hereComesANewChallenger = MediaPlayer.create(this, R.raw.dva_here_comes_a_new_challenger);
        iPlayToWinKorean = MediaPlayer.create(this, R.raw.dva_i_play_to_win_korean);
        imBackInTheFight = MediaPlayer.create(this, R.raw.dva_im_back_in_the_fight);
        imNumberOne = MediaPlayer.create(this, R.raw.dva_im_number_one);
        lol = MediaPlayer.create(this, R.raw.dva_lol);
        loveDva = MediaPlayer.create(this, R.raw.dva_love_dva);
        noHacksRequired = MediaPlayer.create(this, R.raw.dva_no_hacks_required);
        winkyFace = MediaPlayer.create(this, R.raw.dva_winky_face);



    }

    public void afk(View view) {
        afk.start();
    }

    public void awYeah(View view) {
        awYeah.start();
    }

    public void awYouShouldntHave(View view) {
        awYouShouldntHave.start();
    }

    public void dva1BadGuys0(View view) {
        dva1BadGuys0.start();
    }

    public void easyMode(View view) {
        easyMode.start();
    }

    public void gg(View view) {
        gg.start();
    }

    public void haepiHallowin(View view) {
        haepiHallowin.start();
    }

    public void hereComesANewChallenger(View view) {
        hereComesANewChallenger.start();
    }

    public void iPlayToWinKorean(View view) {
        iPlayToWinKorean.start();
    }

    public void imBackInTheFight(View view) {
        imBackInTheFight.start();
    }

    public void imNumberOne(View view) {
        imNumberOne.start();
    }

    public void lol(View view) {
        lol.start();
    }

    public void loveDva(View view) {
        loveDva.start();
    }

    public void noHacksRequired(View view) {
        noHacksRequired.start();
    }

    public void winkyFace(View view) {
        winkyFace.start();
    }
}