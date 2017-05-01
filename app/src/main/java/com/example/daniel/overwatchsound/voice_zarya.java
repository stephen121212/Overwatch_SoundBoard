package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_zarya extends AppCompatActivity {

    MediaPlayer zarya1;
    MediaPlayer zarya2;
    MediaPlayer zarya3;
    MediaPlayer zarya4;
    MediaPlayer zarya5;
    MediaPlayer zarya6;
    MediaPlayer zarya7;
    MediaPlayer zarya8;
    MediaPlayer zarya9;
    MediaPlayer zarya0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zarya_voice_menu);

        //Zarya Mediaplayer Links
        zarya1 = MediaPlayer.create(this,  R.raw.zarya_dont_hold_back);
        zarya2 = MediaPlayer.create(this,  R.raw.zarya_give_me_your_best_shot);
        zarya3 = MediaPlayer.create(this,  R.raw.zarya_gravity_kills);
        zarya4 = MediaPlayer.create(this,  R.raw.zarya_i_will_break_you);
        zarya5 = MediaPlayer.create(this,  R.raw.zarya_ready_for_battle);
        zarya6 = MediaPlayer.create(this,  R.raw.zarya_thank_you);
        zarya7 = MediaPlayer.create(this,  R.raw.zarya_the_humans_who_live_here_are_fools_to_trust_the_omnics);
        zarya8 = MediaPlayer.create(this,  R.raw.zarya_together_we_are_strong);
        zarya9 = MediaPlayer.create(this,  R.raw.zarya_unacceptable);
        zarya0 = MediaPlayer.create(this,  R.raw.zarya_ultimate);
    }

    public void zarya1(View view) {
        zarya1.start();
    }
    public void zarya2(View view) {
        zarya2.start();
    }
    public void zarya3(View view) {
        zarya3.start();
    }
    public void zarya4(View view) {
        zarya4.start();
    }
    public void zarya5(View view) {
        zarya5.start();
    }
    public void zarya6(View view) {
        zarya6.start();
    }
    public void zarya7(View view) {
        zarya7.start();
    }
    public void zarya8(View view) {
        zarya8.start();
    }
    public void zarya9(View view) {
        zarya9.start();
    }
    public void zarya0(View view) {
        zarya0.start();
    }
}