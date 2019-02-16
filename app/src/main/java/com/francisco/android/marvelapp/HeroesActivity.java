package com.francisco.android.marvelapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HeroesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);


        ArrayList<CategoryItem> hero = new ArrayList<>();
        hero.add(new CategoryItem("Black Panther", R.drawable.blackpanther000));
        hero.add(new CategoryItem("Black Widow", R.drawable.blackwidow000));
        hero.add(new CategoryItem("Captain America", R.drawable.captainamerica000));
        hero.add(new CategoryItem("Captain Marvel", R.drawable.captainmarvel000));
        hero.add(new CategoryItem("Colossus", R.drawable.colossus));
        hero.add(new CategoryItem("Hulk", R.drawable.hulk000));
        hero.add(new CategoryItem("Iron Man", R.drawable.ironman000));
        hero.add(new CategoryItem("Professor X", R.drawable.professorx000));
        hero.add(new CategoryItem("Rogue", R.drawable.rogue000));
        hero.add(new CategoryItem("Spiderman", R.drawable.spiderman000));
        hero.add(new CategoryItem("Storm", R.drawable.storm000));
        hero.add(new CategoryItem("Thor", R.drawable.thor000));
        hero.add(new CategoryItem("Wolverine", R.drawable.wolverine000));

        CategoryAdapter adapterHero = new CategoryAdapter(this, hero);

        ListView listView = findViewById(R.id.hero_list);
        listView.setAdapter(adapterHero);

    }
}
