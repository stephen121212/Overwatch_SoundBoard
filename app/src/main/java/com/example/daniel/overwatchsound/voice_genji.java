package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class voice_genji extends AppCompatActivity {

    MediaPlayer letsFight;
    MediaPlayer aSteadyBlade;
    MediaPlayer hahSimple;
    MediaPlayer aChallenge;
    MediaPlayer iAmPrepared;
    MediaPlayer measure;
    MediaPlayer myHalloween;
    MediaPlayer mySoul;
    MediaPlayer notGood;
    MediaPlayer toKnow;
    MediaPlayer ultimate;
    MediaPlayer yeah;
    MediaPlayer youAreOnly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genji_voice_menu);

        //MediaPlayer Linkups
        letsFight = MediaPlayer.create(this, R.raw.gengi_lets_fight);
        aSteadyBlade = MediaPlayer.create(this, R.raw.genji_a_steady_blade_balances_the_soul);
        hahSimple = MediaPlayer.create(this, R.raw.genji_hah_simple);
        aChallenge = MediaPlayer.create(this, R.raw.genji_i_was_hoping_for_a_challenge);
        iAmPrepared = MediaPlayer.create(this, R.raw.genji_iamprepared);
        measure = MediaPlayer.create(this, R.raw.genji_measure_twice_cut_once);
        myHalloween  = MediaPlayer.create(this, R.raw.genji_my_halloween_costume_cyborg_ninja);
        mySoul = MediaPlayer.create(this, R.raw.genji_my_soul_seeks_balance);
        notGood = MediaPlayer.create(this, R.raw.genji_not_good_enough);
        toKnow = MediaPlayer.create(this, R.raw.genji_to_know_yourself_is_to_be_at_peace);
        ultimate = MediaPlayer.create(this, R.raw.genji_ultimate);
        yeah = MediaPlayer.create(this, R.raw.genji_yeah);
        youAreOnly = MediaPlayer.create(this, R.raw.genji_you_are_only_human);
    }

    public void letsFight(View view) {
        letsFight.start();
    }

    public void aSteadyBlade(View view) {
        aSteadyBlade.start();
    }

    public void hahSimple(View view) {
        hahSimple.start();
    }

    public void aChallenge(View view) {
        aChallenge.start();
    }

    public void iAmPrepared(View view) {
        iAmPrepared.start();
    }

    public void measure(View view) {
        measure.start();
    }

    public void myHalloween(View view) {
        myHalloween.start();
    }

    public void mySoul(View view) {
        mySoul.start();
    }

    public void notGood(View view) {
        notGood.start();
    }

    public void toKnow(View view) {
        toKnow.start();
    }

    public void ultimate(View view) {
        ultimate.start();
    }

    public void yeah(View view) {
        yeah.start();
    }

    public void youAreOnly(View view) {
        youAreOnly.start();
    }
}
