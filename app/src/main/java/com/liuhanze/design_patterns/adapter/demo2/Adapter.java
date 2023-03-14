package com.liuhanze.design_patterns.adapter.demo2;

/**
 * 类适配器
 * 通过继承来实现，由于java不支持多重继承，只能继承一个类，因此遇到需要关联多个对象时
 * 要使用对象适配器，在实际开发中对象适配器是使用的较多
 */
public class Adapter extends NeedAdapter implements Target{

    @Override
    public void request() {
        super.dosomething();
    }
}
