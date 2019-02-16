package com.francisco.android.marvelapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HVActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_villan);
    }

    public void openHeroesActivity(View view) {
        Intent i = new Intent(this, HeroesActivity.class);
        startActivity(i);

    }

    public void OpenVillansActivity(View view) {
        Intent i = new Intent(this, VillansActivity.class);
        startActivity(i);

    }

    public void OpenAntiActivity(View view) {
        Intent i = new Intent(this, AntiActivity.class);
        startActivity(i);

    }
}
