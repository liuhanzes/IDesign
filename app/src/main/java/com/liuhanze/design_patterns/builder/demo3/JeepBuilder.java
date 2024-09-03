package com.liuhanze.design_patterns.builder.demo3;

public class JeepBuilder implements CarBuilder {

    private Car car = new Car();

    private CarDirector carDirector;

    public JeepBuilder(){
        carDirector = new CarDirector(this);
    }

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
    public Car build() {
        carDirector.makeCar();
        return car;
    }
}
