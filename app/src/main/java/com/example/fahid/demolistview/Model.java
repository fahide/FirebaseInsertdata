package com.example.fahid.demolistview;

/**
 * Created by FAHID on 9/1/2018.
 */

public class Model {

    String name,division;
    int image;

    public Model(String name, String division, int image) {
        this.name = name;
        this.division = division;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDivision() {
        return division;
    }

    public int getImage() {
        return image;
    }
}
