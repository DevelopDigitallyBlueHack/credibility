package com.cooperthecoder.validator;

/**
 * Created by phill on 11/5/2017.
 */

public class DataModel2 {

    String name;
    String price;
    int id_;
    int image;
    String farmer;

    public DataModel2(String name, String price, String farmer, int id_, int image) {
        this.name = name;
        this.price = price;
        this.farmer = farmer;
        this.id_ = id_;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getprice() {
        return price;
    }

    public String getfarmer() {
        return farmer;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
