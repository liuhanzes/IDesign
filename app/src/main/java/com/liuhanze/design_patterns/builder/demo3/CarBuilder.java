package com.liuhanze.design_patterns.builder.demo3;

interface CarBuilder {
    void makeHead();
    void makeBody();
    void makeTail();
    Car build();

}
