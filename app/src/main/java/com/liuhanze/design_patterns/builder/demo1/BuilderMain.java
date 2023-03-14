package com.liuhanze.design_patterns.builder.demo1;

/**
 * 建造者模式
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化。
 */
public class BuilderMain {

    public void main(){
        JeepBuilder jeepBuilder = new JeepBuilder();
        CarDirector carDirector = new CarDirector(jeepBuilder);
        carDirector.makeCar();
        Car car = jeepBuilder.getCar();

    }
}


