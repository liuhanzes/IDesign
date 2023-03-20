package com.liuhanze.design_patterns.flyweight.demo1;

import java.util.HashMap;

/**
 * FlyweightFactory，是一个享元工厂，用来创建并管理Flyweight对象。它主要是用来确保合理地共享Flyweight，
 * 当用户请求一个Flyweight时，FlyweightFactory对象提供一个已创建的实例或者创建一个（如果不存在的话）。
 */
class FlyweightFactory {

    private HashMap<String,Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory(){
        flyweightMap.put("X",new ConcreteFlyweight());
        flyweightMap.put("Y",new ConcreteFlyweight());
        flyweightMap.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweightMap.get(key);
    }
}
