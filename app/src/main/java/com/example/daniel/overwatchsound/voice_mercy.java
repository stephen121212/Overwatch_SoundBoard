package com.example.daniel.overwatchsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class voice_mercy extends AppCompatActivity {

    MediaPlayer mercy1;
    MediaPlayer mercy2;
    MediaPlayer mercy3;
    MediaPlayer mercy4;
    MediaPlayer mercy5;
    MediaPlayer mercy6;
    MediaPlayer mercy7;
    MediaPlayer mercy8;
    MediaPlayer mercy9;
    MediaPlayer mercy10;
    MediaPlayer mercy11;
    MediaPlayer mercy0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mercy_voice_menu);

        //MediaPlayer mercy links
        mercy1 = MediaPlayer.create(this, R.raw.mercy_doctors_orders);
        mercy2 = MediaPlayer.create(this, R.raw.mercy_how_barbaric);
        mercy3 = MediaPlayer.create(this, R.raw.mercy_i_have_my_eye_on_you);
        mercy4 = MediaPlayer.create(this, R.raw.mercy_ill_send_you_my_consultation_fee);
        mercy5 = MediaPlayer.create(this, R.raw.mercy_im_not_a_miracle_worker_well_not_always);
        mercy6 = MediaPlayer.create(this, R.raw.mercy_need_a_second_opinion);
        mercy7 = MediaPlayer.create(this, R.raw.mercy_on_a_scale_of_one_to_ten_how_is_your_pain);
        mercy8 = MediaPlayer.create(this, R.raw.mercy_sprechstunde_bei_der_frau_doktor);
        mercy9 = MediaPlayer.create(this, R.raw.mercy_super);
        mercy10 = MediaPlayer.create(this, R.raw.mercy_take_two_and_call_me_in_the_morning);
        mercy11 = MediaPlayer.create(this, R.raw.mercy_the_doctor_is_in);
        mercy0 = MediaPlayer.create(this, R.raw.mercy_ultimate);
    }

    public void mercy1(View view) {
        mercy1.start();
    }

    public void mercy2(View view) {
        mercy2.start();
    }

    public void mercy3(View view) {
        mercy3.start();
    }

    public void mercy4(View view) {
        mercy4.start();
    }

    public void mercy5(View view) {
        mercy5.start();
    }

    public void mercy6(View view) {
        mercy6.start();
    }

    public void mercy7(View view) {
        mercy7.start();
    }

    public void mercy8(View view) {
        mercy8.start();
    }

    public void mercy9(View view) {
        mercy9.start();
    }

    public void mercy10(View view) {
        mercy10.start();
    }

    public void mercy11(View view) {
        mercy11.start();
    }

    public void mercy0(View view) {
        mercy0.start();
    }
}