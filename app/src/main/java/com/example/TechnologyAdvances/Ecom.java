package com.example.TechnologyAdvances;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Ecom extends AppCompatActivity {
    TextView detailshopee, detailtoped;
    LinearLayout toped_layout, shopee_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecom);
        //SHOPEE ID
        detailshopee = findViewById(R.id.detailshopee);
        shopee_layout = findViewById(R.id.shopee_layout);
        shopee_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //TOKOPEDIA ID
        detailtoped = findViewById(R.id.detailtoped);
        toped_layout = findViewById(R.id.toped_layout);
        toped_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
    }

    //SHOPEE FUNCTION
    public void shopee(View view) {
        int v = (detailshopee.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(shopee_layout, new AutoTransition());
        detailshopee.setVisibility(v);
    }

    //TOKOPEDIA FUNCTION
    public void toped(View view) {
        int v = (detailtoped.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(toped_layout, new AutoTransition());
        detailtoped.setVisibility(v);
    }
}
