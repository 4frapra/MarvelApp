package com.francisco.android.marvelapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AntiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti);

        ArrayList<CategoryItem> Anti = new ArrayList<>();
        Anti.add(new CategoryItem("Daredevil", R.drawable.daredevil));
        Anti.add(new CategoryItem("Deadpool", R.drawable.deadpool000));
        Anti.add(new CategoryItem("Elektra", R.drawable.elektra000));
        Anti.add(new CategoryItem("Ghost Rider", R.drawable.ghostrider000));
        Anti.add(new CategoryItem("The Punisher", R.drawable.punisher001));
        Anti.add(new CategoryItem("Venom", R.drawable.venom000));
        Anti.add(new CategoryItem("Winter Soldier", R.drawable.winter000));

        CategoryAdapter adapterAnti = new CategoryAdapter(this, Anti);

        ListView listView = findViewById(R.id.anti_list);
        listView.setAdapter(adapterAnti);
    }
}
