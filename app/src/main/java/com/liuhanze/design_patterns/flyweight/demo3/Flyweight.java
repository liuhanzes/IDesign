package com.liuhanze.design_patterns.flyweight.demo3;

/**
 * Flyweight类，它是所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态。
 */
public abstract class Flyweight {
    /**
     * 内部状态
     */
    protected String  innerState;
    /**
     * 外部状态
     * 注意，我们在抽象享元中对外部状态加上了final关键字，防止意外产生，什么意外？获得了一个外部状态，
     * 然后无意修改了一下，池就混乱了
     */
    protected final String extendState ;

    public Flyweight(String extendState){
        this.extendState = extendState;
    }

    /**
     * 要求享元角色必须接收外部状态
     * @param extendState
     */
    public abstract void operation(String extendState);
}
