package com.liuhanze.design_patterns.builder.demo3;

/**
 * 将指挥者封装到建造者中的一个例子
 */
public class BuilderMain {

    public void main(){
        CarBuilder carBuilder = new JeepBuilder();
        Car car = carBuilder.build();

    }
}
