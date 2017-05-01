package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_symmetra extends AppCompatActivity {

    MediaPlayer symmetra1;
    MediaPlayer symmetra2;
    MediaPlayer symmetra3;
    MediaPlayer symmetra4;
    MediaPlayer symmetra5;
    MediaPlayer symmetra6;
    MediaPlayer symmetra7;
    MediaPlayer symmetra8;
    MediaPlayer symmetra9;
    MediaPlayer symmetra10;
    MediaPlayer symmetra11;
    MediaPlayer symmetra12;
    MediaPlayer symmetra0;
    MediaPlayer symmetra00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symmetra_voice_menu);

        //Symmetra linkage!
        symmetra1 = MediaPlayer.create(this, R.raw.symmetra_everything_by_design);
        symmetra2 = MediaPlayer.create(this, R.raw.symmetra_exquisite);
        symmetra3 = MediaPlayer.create(this, R.raw.symmetra_hard_work_and_dedication_pays_off);
        symmetra4 = MediaPlayer.create(this, R.raw.symmetra_how_unsightly);
        symmetra5 = MediaPlayer.create(this, R.raw.symmetra_i_dont_think_so);
        symmetra6 = MediaPlayer.create(this, R.raw.symmetra_i_will_put_you_in_your_place);
        symmetra7 = MediaPlayer.create(this, R.raw.symmetra_impressive);
        symmetra8 = MediaPlayer.create(this, R.raw.symmetra_perfect_harmony);
        symmetra9 = MediaPlayer.create(this, R.raw.symmetra_precisely);
        symmetra10 = MediaPlayer.create(this, R.raw.symmetra_such_a_lack_of_imagination);
        symmetra11 = MediaPlayer.create(this, R.raw.symmetra_welcome_to_my_reality);
        symmetra12 = MediaPlayer.create(this, R.raw.symmetra_why_do_you_struggle);
        symmetra0 = MediaPlayer.create(this, R.raw.symmetra_ultimate_tele);
        symmetra00 = MediaPlayer.create(this, R.raw.symmetra_ultimate_shield);
    }

    public void symmetra1(View view) {
        symmetra1.start();
    }
    public void symmetra2(View view) {
        symmetra2.start();
    }
    public void symmetra3(View view) {
        symmetra3.start();
    }
    public void symmetra4(View view) {
        symmetra4.start();
    }
    public void symmetra5(View view) {
        symmetra5.start();
    }
    public void symmetra6(View view) {
        symmetra6.start();
    }
    public void symmetra7(View view) {
        symmetra7.start();
    }
    public void symmetra8(View view) {
        symmetra8.start();
    }
    public void symmetra9(View view) {
        symmetra9.start();
    }
    public void symmetra10(View view) {
        symmetra10.start();
    }
    public void symmetra11(View view) {
        symmetra11.start();
    }
    public void symmetra12(View view) {
        symmetra12.start();
    }
    public void symmetra0(View view) {
        symmetra0.start();
    }
    public void symmetra00(View view) {
        symmetra00.start();
    }
}