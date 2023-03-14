package com.liuhanze.design_patterns.builder.demo2;

interface CarBuilder {
    void makeHead();
    void makeBody();
    void makeTail();
    Car getCar();

}
