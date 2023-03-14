package com.liuhanze.design_patterns.builder.demo2;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car makeCar(){
        carBuilder.makeHead();
        carBuilder.makeBody();
        carBuilder.makeTail();
        return carBuilder.getCar();
    }
}
