package com.liuhanze.design_patterns.builder.demo3;

/**
 * 也可以做成builder的内部类实现，也可以做成一个通用接口，JeepCarDirector继承此接口
 */
public class CarDirector {
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
