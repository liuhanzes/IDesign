package com.liuhanze.design_patterns.observer.demo2;
import java.util.Observable;

public class Product extends Observable {

    private String name;//产品名称
    private float price; // 产品价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        setChanged();
        notifyObservers(new Float(price));
    }
}
