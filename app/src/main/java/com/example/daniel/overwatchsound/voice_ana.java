package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_ana extends AppCompatActivity {

    MediaPlayer areYouScared;
    MediaPlayer childrenBehave;
    MediaPlayer everyoneDies;
    MediaPlayer itTakesAWomanToKnowIt;
    MediaPlayer justiceDelivered;
    MediaPlayer learnFromThePain;
    MediaPlayer motherKnowsBest;
    MediaPlayer needSomeoneToTuckYouIn;
    MediaPlayer noScopeNeeded;
    MediaPlayer whatAreYouThinking;
    MediaPlayer witnessMe;
    MediaPlayer youKnowNothing;
    MediaPlayer justiceRainsFromAbove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_voice_menu);

        //MediaPlayer Linkups
        areYouScared = MediaPlayer.create(this, R.raw.ana_are_you_scared);
        childrenBehave = MediaPlayer.create(this, R.raw.ana_children_behave);
        everyoneDies = MediaPlayer.create(this, R.raw.ana_everyone_dies);
        itTakesAWomanToKnowIt = MediaPlayer.create(this, R.raw.ana_it_takes_a_woman_to_know_it);
        justiceDelivered = MediaPlayer.create(this, R.raw.ana_justice_delivered);
        learnFromThePain = MediaPlayer.create(this, R.raw.ana_learn_from_the_pain);
        motherKnowsBest  = MediaPlayer.create(this, R.raw.ana_mother_knows_best);
        needSomeoneToTuckYouIn = MediaPlayer.create(this, R.raw.ana_need_someone_to_tuck_you_in);
        noScopeNeeded = MediaPlayer.create(this, R.raw.ana_no_scope_needed);
        whatAreYouThinking = MediaPlayer.create(this, R.raw.ana_what_are_you_thinking);
        witnessMe = MediaPlayer.create(this, R.raw.ana_witness_me);
        youKnowNothing = MediaPlayer.create(this, R.raw.ana_you_know_nothing);
        justiceRainsFromAbove = MediaPlayer.create(this, R.raw.ana_justicerainsfromabove);
    }

    public void areYouScared(View view) {
        areYouScared.start();
    }

    public void childrenBehave(View view) {
        childrenBehave.start();
    }

    public void everyoneDies(View view) {
        everyoneDies.start();
    }

    public void itTakesAWomanToKnowIt(View view) {
        itTakesAWomanToKnowIt.start();
    }

    public void justiceDelivered(View view) {
        justiceDelivered.start();
    }

    public void learnFromThePain(View view) {
        learnFromThePain.start();
    }

    public void motherKnowsBest(View view) {
        motherKnowsBest.start();
    }

    public void needSomeoneToTuckYouIn(View view) {
        needSomeoneToTuckYouIn.start();
    }

    public void noScopeNeeded(View view) {
        noScopeNeeded.start();
    }

    public void whatAreYouThinking(View view) {
        whatAreYouThinking.start();
    }

    public void witnessMe(View view) {
        witnessMe.start();
    }

    public void youKnowNothing(View view) {
        youKnowNothing.start();
    }

    public void justiceRainsFromAbove(View view) {
        justiceRainsFromAbove.start();
    }
}