package com.liuhanze.design_patterns.decorator.demo1;

abstract class Decorator implements Component{

    protected Component component;

    /**
     * 装饰模式是利用SetComponent来对对象进行包装的。这样每个装饰对象的实现就和如何使用这个对象分离开了，
     * 每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链当中[
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
