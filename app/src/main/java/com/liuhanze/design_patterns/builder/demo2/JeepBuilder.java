package com.liuhanze.design_patterns.builder.demo2;

public class JeepBuilder implements CarBuilder{

    private Car car = new Car();

    @Override
    public void makeHead() {
        car.setHead("jeep head");
    }

    @Override
    public void makeBody() {
        car.setBody("jeep body");
    }

    @Override
    public void makeTail() {
        car.setTail("jeep tail");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
