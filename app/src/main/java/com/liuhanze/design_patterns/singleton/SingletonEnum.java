package com.liuhanze.design_patterns.singleton;

/**
 * 枚举实现的单例
 * 单元素的枚举已经成为实现singleton的最佳方法
 * java的枚举类型实质上是功能齐全的类，因此可以有自己的属性和方法。java枚举类型的基本思想是通过
 * 公有的静态final域为每个枚举常量导出实例的类。
 */
public enum SingletonEnum {

    INSTANCE;

    /**
     * 示意方法，单例可以有自己的方法
     */
    public void singletonOperation(){
        //
    }
}
