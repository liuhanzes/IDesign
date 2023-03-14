package com.liuhanze.design_patterns.builder.demo1;

class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void makeCar(){
        carBuilder.makeHead();
        carBuilder.makeBody();
        carBuilder.makeTail();
    }

}
