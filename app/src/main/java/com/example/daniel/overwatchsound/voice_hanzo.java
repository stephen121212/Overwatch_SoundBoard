package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_hanzo extends AppCompatActivity {

    MediaPlayer expectNothingLess;
    MediaPlayer flowLikeWater;
    MediaPlayer fromOneThingKnowTenThousandThings;
    MediaPlayer hm;
    MediaPlayer iChooseYouSpiritDragon;
    MediaPlayer iDoWhatIMust;
    MediaPlayer ignoreAllDistractions;
    MediaPlayer neverSecondBest;
    MediaPlayer rememberThisMoment;
    MediaPlayer sake;
    MediaPlayer stepIntoTheDojo;
    MediaPlayer theOutcomeWasNeverInDoubt;
    MediaPlayer youAreAlreadyDead;
    MediaPlayer ultimateHanzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanzo_voice_menu);

        expectNothingLess = MediaPlayer.create(this, R.raw.hanzo_expect_nothing_less);
        flowLikeWater = MediaPlayer.create(this, R.raw.hanzo_flow_like_water);
        fromOneThingKnowTenThousandThings = MediaPlayer.create(this, R.raw.hanzo_from_one_thing_know_ten_thousand_things);
        hm = MediaPlayer.create(this, R.raw.hanzo_hm);
        iChooseYouSpiritDragon = MediaPlayer.create(this, R.raw.hanzo_i_choose_you_spirit_dragon);
        iDoWhatIMust = MediaPlayer.create(this, R.raw.hanzo_i_do_what_i_must);
        ignoreAllDistractions = MediaPlayer.create(this, R.raw.hanzo_ignore_all_distractions);
        neverSecondBest = MediaPlayer.create(this, R.raw.hanzo_never_second_best);
        rememberThisMoment = MediaPlayer.create(this, R.raw.hanzo_remember_this_moment);
        sake = MediaPlayer.create(this, R.raw.hanzo_sake);
        stepIntoTheDojo = MediaPlayer.create(this, R.raw.hanzo_step_into_the_dojo);
        theOutcomeWasNeverInDoubt = MediaPlayer.create(this, R.raw.hanzo_the_outcome_was_never_in_doubt);
        youAreAlreadyDead = MediaPlayer.create(this, R.raw.hanzo_you_are_already_dead);
        ultimateHanzo = MediaPlayer.create(this, R.raw.hanzo_ultimate);
    }

    public void expectNothingLess(View view) {
        expectNothingLess.start();
    }

    public void flowLikeWater(View view) {
        flowLikeWater.start();
    }

    public void fromOneThingKnowTenThousandThings(View view) {
        fromOneThingKnowTenThousandThings.start();
    }

    public void hm(View view) {
        hm.start();
    }

    public void iChooseYouSpiritDragon(View view) {
        iChooseYouSpiritDragon.start();
    }

    public void iDoWhatIMust(View view) {
        iDoWhatIMust.start();
    }

    public void ignoreAllDistractions(View view) {
        ignoreAllDistractions.start();
    }

    public void neverSecondBest(View view) {
        neverSecondBest.start();
    }

    public void rememberThisMoment(View view) {
        rememberThisMoment.start();
    }

    public void sake(View view) {
        sake.start();
    }

    public void stepIntoTheDojo(View view) {
        stepIntoTheDojo.start();
    }

    public void youAreAlreadyDead(View view) {
        youAreAlreadyDead.start();
    }

    public void ultimateHanzo(View view) {
        ultimateHanzo.start();
    }
}