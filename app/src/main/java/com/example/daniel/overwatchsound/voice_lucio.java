package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_lucio extends AppCompatActivity {

    MediaPlayer andTheBeatGoesOn;
    MediaPlayer iCouldDoThisAllDay;
    MediaPlayer iHopeNobodySawThat;
    MediaPlayer imNotHearingThatNoise;
    MediaPlayer niceOne;
    MediaPlayer ohYeah;
    MediaPlayer ultimateLucio;
    MediaPlayer whyAreYouSoAngry;
    MediaPlayer youGottaBelieve;
    MediaPlayer imNotHearingThatNoise1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lucio_voice_menu);

        andTheBeatGoesOn = MediaPlayer.create(this, R.raw.lucio_and_the_beat_goes_on);
        iCouldDoThisAllDay = MediaPlayer.create(this, R.raw.lucio_i_could_do_this_all_day);
        iHopeNobodySawThat = MediaPlayer.create(this, R.raw.lucio_i_hope_nobody_saw_that);
        imNotHearingThatNoise = MediaPlayer.create(this, R.raw.lucio_im_not_hearing_that_noise);
        niceOne = MediaPlayer.create(this, R.raw.lucio_nice_one);
        ohYeah = MediaPlayer.create(this, R.raw.lucio_oh_yeah);
        ultimateLucio = MediaPlayer.create(this, R.raw.lucio_ultimate);
        whyAreYouSoAngry = MediaPlayer.create(this, R.raw.lucio_why_are_you_so_angry);
        youGottaBelieve = MediaPlayer.create(this, R.raw.lucio_you_gotta_believe);
        imNotHearingThatNoise1 = MediaPlayer.create(this, R.raw.lucio_im_not_hearing_that_noise1);

    }

    public void andTheBeatGoesOn(View view) {
        andTheBeatGoesOn.start();
    }

    public void iCouldDoThisAllDay(View view) {
        iCouldDoThisAllDay.start();
    }

    public void iHopeNobodySawThat(View view) {
        iHopeNobodySawThat.start();
    }

    public void imNotHearingThatNoist(View view) {
        imNotHearingThatNoise.start();
    }

    public void niceOne(View view) {
        niceOne.start();
    }

    public void ohYeah(View view) {
        ohYeah.start();
    }

    public void ultimateLucio(View view) {
        ultimateLucio.start();
    }

    public void whyAreYouSoAngry(View view) {
        whyAreYouSoAngry.start();
    }

    public void youGottaBelieve(View view) {
        youGottaBelieve.start();
    }

    public void imNotHearingThatNoise2(View view) {
        imNotHearingThatNoise1.start();
    }
}