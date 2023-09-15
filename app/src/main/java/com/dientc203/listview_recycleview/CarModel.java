package com.dientc203.listview_recycleview;

import java.io.Serializable;

public class CarModel implements Serializable {
    private String name;
    private String color;
    private String year;
    private String img;

    public CarModel(String name, String color, String year, String img) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
