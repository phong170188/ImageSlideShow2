package com.example.quangviet.imageslideshow2;

/**
 * Created by HV on 2/2/2018.
 */

public class Image {
    int id;
    String description;

    public Image(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
