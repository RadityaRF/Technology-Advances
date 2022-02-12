package com.example.TechnologyAdvances;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class mitra extends AppCompatActivity {
    TextView detailmitrashopee, detailmitratoped, detailmitragojek, detailmitragrab;
    LinearLayout mitratoped_layout, mitrashopee_layout, mitragojek_layout, mitragrab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitra);
        //SHOPEE ID
        detailmitrashopee = findViewById(R.id.detailmitrashopee);
        mitrashopee_layout = findViewById(R.id.mitrashopee_layout);
        mitrashopee_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //TOKOPEDIA ID
        detailmitratoped = findViewById(R.id.detailmitratoped);
        mitratoped_layout = findViewById(R.id.mitratoped_layout);
        mitratoped_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //GOJEK ID
        detailmitragojek = findViewById(R.id.detailmitragojek);
        mitragojek_layout = findViewById(R.id.mitragojek_layout);
        mitragojek_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //GOJEK ID
        detailmitragrab = findViewById(R.id.detailmitragrab);
        mitragrab_layout = findViewById(R.id.mitragrab_layout);
        mitragrab_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }

    //SHOPEE FUNCTION
    public void mitrashopee(View view) {
        int v = (detailmitrashopee.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(mitrashopee_layout, new AutoTransition());
        detailmitrashopee.setVisibility(v);
    }

    //TOKOPEDIA FUNCTION
    public void mitratoped(View view) {
        int v = (detailmitratoped.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(mitratoped_layout, new AutoTransition());
        detailmitratoped.setVisibility(v);
    }

    //GRAB FUNCTION
    public void mitragrab(View view) {
        int v = (detailmitragrab.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(mitragrab_layout, new AutoTransition());
        detailmitragrab.setVisibility(v);
    }

    //GOJEK FUNCTION
    public void mitragojek(View view) {
        int v = (detailmitragojek.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(mitragojek_layout, new AutoTransition());
        detailmitragojek.setVisibility(v);
    }
}
