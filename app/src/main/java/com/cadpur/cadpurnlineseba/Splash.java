package com.cadpur.cadpurnlineseba;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.cadpur.cadpurnlineseba.R;

public class Splash extends AppCompatActivity {


    ImageView imgSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        imgSplash=findViewById(R.id.imgSplash);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(2500);

                    Intent myintent=new Intent(Splash.this,MainActivity.class);
                    startActivity(myintent);
                    finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        YoYo.with(Techniques.BounceInDown).duration(2500).repeat(1).playOn(imgSplash);


    }
}