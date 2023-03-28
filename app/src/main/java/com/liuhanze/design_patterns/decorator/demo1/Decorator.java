package com.liuhanze.design_patterns.decorator.demo1;

/**
 * 一般是一个抽象类，做什么用呢？实现接口或者抽象方法，它里面可不一定有抽象的方法呀，
 * 在它的属性里必然有一个private变量指向Component抽象构件。
 */
abstract class Decorator implements Component{

    protected Component component;

    /**
     * 装饰模式是利用SetComponent来对对象进行包装的。这样每个装饰对象的实现就和如何使用这个对象分离开了，
     * 每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链当中
     * @param component
     */
    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
