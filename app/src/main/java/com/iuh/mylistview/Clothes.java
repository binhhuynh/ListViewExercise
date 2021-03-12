package com.iuh.mylistview;

public class Clothes {
    private String name;
    private String price;
    private int imageClothes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageClothes() {
        return imageClothes;
    }

    public void setImageClothes(int imageClothes) {
        this.imageClothes = imageClothes;
    }

    public Clothes(String name, String price, int imageClothes) {
        this.name = name;
        this.price = price;
        this.imageClothes = imageClothes;
    }
}
