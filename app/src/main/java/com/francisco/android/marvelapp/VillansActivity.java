package com.francisco.android.marvelapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VillansActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villans);


        ArrayList<CategoryItem> villain = new ArrayList<>();
        villain.add(new CategoryItem("Apocalypse", R.drawable.apocalypse000));
        villain.add(new CategoryItem("Green Goblin", R.drawable.greengoblin));
        villain.add(new CategoryItem("Lady Deathstike", R.drawable.ladydeathstrike000));
        villain.add(new CategoryItem("Magneto", R.drawable.magneto000));
        villain.add(new CategoryItem("Mystique", R.drawable.mystique));
        villain.add(new CategoryItem("Red Skull", R.drawable.redskull000));
        villain.add(new CategoryItem("Sabretooth", R.drawable.sabretooth));
        villain.add(new CategoryItem("Sandman", R.drawable.sandman));
        villain.add(new CategoryItem("Thanos", R.drawable.thanos000));
        villain.add(new CategoryItem("Ultron", R.drawable.ultron));

        CategoryAdapter adapterVillan = new CategoryAdapter(this, villain);

        ListView listView = findViewById(R.id.villan_list);
        listView.setAdapter(adapterVillan);

    }
}
