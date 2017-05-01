package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_junkrat extends AppCompatActivity {

    MediaPlayer anyoneWantSomeBbq;
    MediaPlayer blowItUpAgain2;
    MediaPlayer brrring;
    MediaPlayer comingUpExplodey;
    MediaPlayer happyBirthday;
    MediaPlayer happyHalloween;
    MediaPlayer haveANiceDay;
    MediaPlayer iGiveItATen;
    MediaPlayer itsTheLittleThings;
    MediaPlayer kaboom;
    MediaPlayer shiny;
    MediaPlayer smile;
    MediaPlayer tickTock;
    MediaPlayer ultimateJunkrat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.junkrat_voice_menu);


        anyoneWantSomeBbq = MediaPlayer.create(this, R.raw.junkrat_anyone_want_some_bbq);
        blowItUpAgain2 = MediaPlayer.create(this, R.raw.junkrat_blow_it_up_again2);
        brrring = MediaPlayer.create(this, R.raw.junkrat_brrring);
        comingUpExplodey = MediaPlayer.create(this, R.raw.junkrat_coming_up_explodey);
        happyBirthday = MediaPlayer.create(this, R.raw.junkrat_happy_birthday);
        happyHalloween = MediaPlayer.create(this, R.raw.junkrat_happy_halloween);
        haveANiceDay = MediaPlayer.create(this, R.raw.junkrat_have_a_nice_day);
        iGiveItATen = MediaPlayer.create(this, R.raw.junkrat_i_give_it_a_ten);
        itsTheLittleThings = MediaPlayer.create(this, R.raw.junkrat_its_the_little_things);
        kaboom = MediaPlayer.create(this, R.raw.junkrat_kaboom);
        shiny = MediaPlayer.create(this, R.raw.junkrat_shiny);
        smile = MediaPlayer.create(this, R.raw.junkrat_smile);
        tickTock = MediaPlayer.create(this, R.raw.junkrat_tick_tock_tick_tock_tick_tock);
        ultimateJunkrat = MediaPlayer.create(this, R.raw.junkrat_ultimate);


    }

    public void anyoneWantSomeBbq(View view) {
        anyoneWantSomeBbq.start();
    }

    public void blowItUpAgain2(View view) {
        blowItUpAgain2.start();
    }

    public void brrring(View view) {
        brrring.start();
    }

    public void comingUpExplodey(View view) {
        comingUpExplodey.start();
    }

    public void happyBirthday(View view) {
        happyBirthday.start();
    }

    public void happyHalloween(View view) {
        happyHalloween.start();
    }

    public void haveANiceDay(View view) {
        haveANiceDay.start();
    }

    public void iGiveItATen(View view) {
        iGiveItATen.start();
    }

    public void itsTheLittleThings(View view) {
        itsTheLittleThings.start();
    }

    public void kaboom(View view) {
        kaboom.start();
    }

    public void shiny(View view) {
        shiny.start();
    }

    public void smile(View view) {
        smile.start();
    }

    public void tickTock(View view) {
        tickTock.start();
    }

    public void ultimateJunkrat(View view) {
        ultimateJunkrat.start();
    }
}