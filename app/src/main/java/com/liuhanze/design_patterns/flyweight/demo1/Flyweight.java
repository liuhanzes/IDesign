package com.liuhanze.design_patterns.flyweight.demo1;

/**
 * Flyweight类，它是所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态。
 */
public interface Flyweight {
    void operation(String extendState);
}
