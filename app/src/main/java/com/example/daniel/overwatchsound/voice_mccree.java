package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_mccree extends AppCompatActivity {

    MediaPlayer happensToTheBestOfUs;
    MediaPlayer iDontMuchLikeLosin;
    MediaPlayer iTriedBeingReasonableDidntTakeToIt;
    MediaPlayer imNotGoodNotBadButISureAsHellAintUgly;
    MediaPlayer imTheQuickYoureTheDead;
    MediaPlayer imYourHuckleberry;
    MediaPlayer iveGotABulletWithYourNameOnIt;
    MediaPlayer reachForTheSky;
    MediaPlayer ultimateMccree;
    MediaPlayer wantedDeadOrAlive;
    MediaPlayer watchAndLearn;
    MediaPlayer youSeemFamiliarAintIKilledYouBefore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mccree_voice_menu);

        //Mccree MediaPlayer linkups
        happensToTheBestOfUs = MediaPlayer.create(this, R.raw.mccree_happens_to_the_best_of_us);
        iDontMuchLikeLosin = MediaPlayer.create(this, R.raw.mccree_i_dont_much_like_losin);
        iTriedBeingReasonableDidntTakeToIt = MediaPlayer.create(this, R.raw.mccree_i_tried_being_reasonable_didnt_take_to_it);
        imNotGoodNotBadButISureAsHellAintUgly = MediaPlayer.create(this, R.raw.mccree_im_not_good_not_bad_but_i_sure_as_hell_aint_ugly);
        imTheQuickYoureTheDead = MediaPlayer.create(this, R.raw.mccree_im_the_quick_youre_the_dead);
        imYourHuckleberry = MediaPlayer.create(this, R.raw.mccree_im_your_huckleberry);
        iveGotABulletWithYourNameOnIt = MediaPlayer.create(this, R.raw.mccree_ive_got_a_bullet_with_your_name_on_it);
        reachForTheSky = MediaPlayer.create(this, R.raw.mccree_reach_for_the_sky);
        ultimateMccree = MediaPlayer.create(this, R.raw.mccree_ultimate);
        wantedDeadOrAlive = MediaPlayer.create(this, R.raw.mccree_wanted_dead_or_alive);
        watchAndLearn = MediaPlayer.create(this, R.raw.mccree_watch_and_learn);
        youSeemFamiliarAintIKilledYouBefore = MediaPlayer.create(this, R.raw.mccree_you_seem_familiar_aint_i_killed_you_before);
    }

    public void happensToTheBestOfUs(View view) {
        happensToTheBestOfUs.start();
    }

    public void iDontMuchLikeLosin(View view) {
        iDontMuchLikeLosin.start();
    }

    public void iTriedBeingReasonableDidntTakeToIt(View view) {
        iTriedBeingReasonableDidntTakeToIt.start();
    }

    public void imNotGoodNotBadButISureAsHellAintUgly(View view) {
        imNotGoodNotBadButISureAsHellAintUgly.start();
    }

    public void imTheQuickYoureTheDead(View view) {
        imTheQuickYoureTheDead.start();
    }

    public void imYourHuckleberry(View view) {
        imYourHuckleberry.start();
    }

    public void iveGotABulletWithYourNameOnIt(View view) {
        iveGotABulletWithYourNameOnIt.start();
    }

    public void reachForTheSky(View view) {
        reachForTheSky.start();
    }

    public void wantedDeadOrAlive(View view) {
        wantedDeadOrAlive.start();
    }

    public void watchAndLearn(View view) {
        watchAndLearn.start();
    }

    public void youSeemFamiliarAintIKilledYouBefore(View view) {
        youSeemFamiliarAintIKilledYouBefore.start();
    }

    public void ultimateMccree(View view) {
        ultimateMccree.start();
    }
}