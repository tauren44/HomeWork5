package com.mateacademy;

import java.io.Serializable;

public abstract class Flower implements Serializable {
    private int price;
    
    public Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
