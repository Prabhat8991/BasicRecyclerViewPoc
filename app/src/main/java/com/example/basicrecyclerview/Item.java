package com.example.basicrecyclerview;

public class Item {
    private String imageUrl;
    private String description;

    public Item(String imageUrl, String description) {
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}