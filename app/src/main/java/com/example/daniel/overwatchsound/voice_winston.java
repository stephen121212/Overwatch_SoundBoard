package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_winston extends AppCompatActivity {

    MediaPlayer winston1;
    MediaPlayer winston2;
    MediaPlayer winston3;
    MediaPlayer winston4;
    MediaPlayer winston5;
    MediaPlayer winston6;
    MediaPlayer winston7;
    MediaPlayer winston8;
    MediaPlayer winston9;
    MediaPlayer winston10;
    MediaPlayer winston11;
    MediaPlayer winston12;
    MediaPlayer winston13;
    MediaPlayer winston14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winston_voice_menu);

        //Winston Linkage
        winston1 = MediaPlayer.create(this, R.raw.winston_curious);
        winston2 = MediaPlayer.create(this, R.raw.winston_did_someone_say_peanut_butter);
        winston3 = MediaPlayer.create(this, R.raw.winston_dont_get_me_angry);
        winston4 = MediaPlayer.create(this, R.raw.winston_houston_we_have_a_problem);
        winston5 = MediaPlayer.create(this, R.raw.winston_how_embarrassing);
        winston6 = MediaPlayer.create(this, R.raw.winston_i_uh_got_you_something);
        winston7 = MediaPlayer.create(this, R.raw.winston_natural_selection);
        winston8 = MediaPlayer.create(this, R.raw.winston_no_i_do_not_want_a_banana);
        winston9 = MediaPlayer.create(this, R.raw.winston_no_monkey_business);
        winston10 = MediaPlayer.create(this, R.raw.winston_playtimes_over);
        winston11 = MediaPlayer.create(this, R.raw.winston_sorry_about_that);
        winston12 = MediaPlayer.create(this, R.raw.winston_that_was_awesome);
        winston13 = MediaPlayer.create(this, R.raw.winston_the_power_of_science);
        winston14 = MediaPlayer.create(this, R.raw.winston_this_is_not_a_costume);
    }

    public void winston1(View view) {
        winston1.start();
    }
    public void winston2(View view) {
        winston2.start();
    }
    public void winston3(View view) {
        winston3.start();
    }
    public void winston4(View view) {
        winston4.start();
    }
    public void winston5(View view) {
        winston5.start();
    }
    public void winston6(View view) {
        winston6.start();
    }
    public void winston7(View view) {
        winston7.start();
    }
    public void winston8(View view) {
        winston8.start();
    }
    public void winston9(View view) {
        winston9.start();
    }
    public void winston10(View view) {
        winston10.start();
    }
    public void winston11(View view) {
        winston11.start();
    }
    public void winston12(View view) {
        winston12.start();
    }
    public void winston13(View view) {
        winston13.start();
    }
    public void winston14(View view) {
        winston14.start();
    }
}