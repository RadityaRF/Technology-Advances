package com.example.TechnologyAdvances;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Ojol extends AppCompatActivity {
    TextView detailgojek, detailgrab;
    LinearLayout gojek_layout, grab_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojol);
        //GOJEK ID
        detailgojek = findViewById(R.id.detailgojek);
        gojek_layout = findViewById(R.id.gojek_layout);
        gojek_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //GRAB ID
        detailgrab = findViewById(R.id.detailgrab);
        grab_layout = findViewById(R.id.grab_layout);
        grab_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }
    //GOJEK FUNCTION CARDVIEW
    public void gojek(View view) {
        int v = (detailgojek.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(gojek_layout, new AutoTransition());
        detailgojek.setVisibility(v);
    }
    //GRAB FUNCTION CARDVIEW
    public void grab(View view) {
        int v = (detailgrab.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(grab_layout, new AutoTransition());
        detailgrab.setVisibility(v);
    }
}
