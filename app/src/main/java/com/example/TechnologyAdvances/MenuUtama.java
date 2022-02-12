package com.example.TechnologyAdvances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuUtama extends AppCompatActivity {
    //Set Variable
    ImageButton ojol, ecom, mitra, tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button Ojol
        ojol = (ImageButton)findViewById(R.id.ojol_btn);
        ojol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ojek = new Intent(MenuUtama.this, Ojol.class);
                startActivity(ojek);
            }
        });

        //Button ecom
        ecom = (ImageButton)findViewById(R.id.ecom_btn);
        ecom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ecom = new Intent(MenuUtama.this, Ecom.class);
                startActivity(ecom);
            }
        });

        //Button mitra
        mitra = (ImageButton)findViewById(R.id.mitra_btn);
        mitra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mitra = new Intent(MenuUtama.this, mitra.class);
                startActivity(mitra);
            }
        });

        //Button ecom
        ecom = (ImageButton)findViewById(R.id.ecom_btn);
        ecom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ecom = new Intent(MenuUtama.this, Ecom.class);
                startActivity(ecom);
            }
        });

        //Button tentang
        tentang = (ImageButton)findViewById(R.id.tentang_btn);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tentang = new Intent(MenuUtama.this, tentang.class);
                startActivity(tentang);
            }
        });

    }
}
