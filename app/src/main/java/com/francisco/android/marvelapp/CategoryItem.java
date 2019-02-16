package com.francisco.android.marvelapp;

public class CategoryItem {

    String categoryText;
    int categoryImage;
    String description;

    public CategoryItem(String categoryText, int categoryImage) {
        this.categoryText = categoryText;
        this.categoryImage = categoryImage;
        this.description = description;
    }



    public String getCategoryText() {
        return categoryText;
    }

    public int getCategoryImage() {
        return categoryImage;
    }

    public String getDescription() { return description; }
}
