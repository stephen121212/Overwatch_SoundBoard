package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_bastion extends AppCompatActivity {

    MediaPlayer beeple;
    MediaPlayer booBooDooDeDoo;
    MediaPlayer bweee;
    MediaPlayer chirrChirrChirr;
    MediaPlayer dahDahWee;
    MediaPlayer dooWoo;
    MediaPlayer dundunBoopBoop;
    MediaPlayer dweetDweetDweet;
    MediaPlayer heeHooHoo;
    MediaPlayer shshshDwee;
    MediaPlayer zwee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bastion_voice_menu);

        //MediaPlayer Linkups
        beeple = MediaPlayer.create(this, R.raw.bastion_beeple);
        booBooDooDeDoo = MediaPlayer.create(this, R.raw.bastion_boo_boo_doo_de_doo);
        bweee = MediaPlayer.create(this, R.raw.bastion_bweeeeeeeeeee);
        chirrChirrChirr = MediaPlayer.create(this, R.raw.bastion_chirr_chirr_chirr);
        dahDahWee = MediaPlayer.create(this, R.raw.bastion_dahdah_weeeee);
        dooWoo = MediaPlayer.create(this, R.raw.bastion_doowoo);
        dundunBoopBoop = MediaPlayer.create(this, R.raw.bastion_dun_dun_boop_boop);
        dweetDweetDweet = MediaPlayer.create(this, R.raw.bastion_dweet_dweet_dweet);
        heeHooHoo = MediaPlayer.create(this, R.raw.bastion_hee_hoo_hoo);
        shshshDwee = MediaPlayer.create(this, R.raw.bastion_shshsh_dwee);
        zwee = MediaPlayer.create(this, R.raw.bastion_zwee);
    }

    public void beeple(View view) {
        beeple.start();
    }

    public void booBooDooDeDoo(View view) {
        booBooDooDeDoo.start();
    }

    public void bweee(View view) {
        bweee.start();
    }

    public void chirrChirrChirr(View view) {
        chirrChirrChirr.start();
    }

    public void dahDahWee(View view) {
        dahDahWee.start();
    }

    public void dooWoo(View view) {
        dooWoo.start();
    }

    public void dundunBoopBoop(View view) {
        dundunBoopBoop.start();
    }

    public void dweetDweetDweet(View view) {
        dweetDweetDweet.start();
    }

    public void heeHooHoo(View view) {
        heeHooHoo.start();
    }

    public void shshshDwee(View view) {
        shshshDwee.start();
    }

    public void zwee(View view) {
        zwee.start();
    }
}