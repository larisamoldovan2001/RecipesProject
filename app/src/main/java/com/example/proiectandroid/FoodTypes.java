package com.example.proiectandroid;

public class FoodTypes {

    private String category;
    private int itemImage;

    public FoodTypes(String category, int itemImage) {
        this.category = category;
        this.itemImage = itemImage;
    }

    public String getCategory() {
        return category;
    }

    public int getItemImage() {
        return itemImage;
    }
}
