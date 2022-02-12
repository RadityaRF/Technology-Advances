package com.example.TechnologyAdvances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {
    TextView judulsplash;
    LottieAnimationView logo_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //define variable
        judulsplash = findViewById(R.id.judulsplash);
        logo_splash = findViewById(R.id.logo_splash);
        //animation
        judulsplash.animate().translationY(-1400).setDuration(2700).setStartDelay(0);
        logo_splash.animate().translationX(2000).setDuration(2700).setStartDelay(2900);
        //function postdelay

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MenuUtama.class);
                startActivity(i);
            }
        }, 4000);
    }
}
