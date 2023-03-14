package com.liuhanze.design_patterns.singleton;

/**
 * 饿汉式 单例模式
 * 先创建对象
 * 早期的java版本中被认为是提前加载，但在最新的java中，类只有在使用时候才会被加载，所以它也是一种延迟加载模式。
 * 另外，类加载的时机主要取决于JVM的实现机制，因而版本之间会有不同。所以进行设计时，要避免与JVM的实现机制进行绑定。
 */
public class SingletonEarly {

    private static SingletonEarly instance = new SingletonEarly();

    private SingletonEarly(){
        //私有的构造方法 阻止了外部创建本类对象
    }

    public static SingletonEarly getInstance(){
        return instance;
    }
}
