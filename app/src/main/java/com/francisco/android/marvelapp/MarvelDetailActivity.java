package com.francisco.android.marvelapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MarvelDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel_detail);

        Intent i = getIntent();
        TextView nameTextView = findViewById(R.id.name_text_view);
        nameTextView.setText(i.getStringExtra("name"));

        ImageView nameImageView = findViewById(R.id.item_image_view);
        nameImageView.setImageResource(i.getIntExtra("nameImg", 0));

        TextView nameDescriptionView = findViewById(R.id.name_description_view);
        nameDescriptionView.setText(i.getStringExtra("description"));
    }
}
