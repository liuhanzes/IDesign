package com.liuhanze.design_patterns.flyweight.demo4;

/**
 *
 * 使用对象作为外部状态
 * 比使用java基本类型String，int等效率要低一些
 *
 * 虽然可以使用享元模式可以实现对象池，但是这两者还是有比较大的差异，对象池着重在对象的复用上，池中的每个对象是可替换的，
 * 从同一个池中获得A对象和B对象对客户端来说是完全相同的，它主要解决复用，而享元模式在主要解决的对象的共享问题，
 * 如何建立多个可共享的细粒度对象则是其关注的重点。
 */
public class FlyweightMain {

    public void main(){
        ExtendState extendState1 = new ExtendState();
        extendState1.setSubject("科目1");
        extendState1.setLocation("上海");

        SignInfo signInfo1 = SignInfoFactory.getSignInfo(extendState1);

        ExtendState extendState2 = new ExtendState();
        extendState2.setSubject("科目2");
        extendState2.setLocation("北京");

        SignInfo signInfo2 = SignInfoFactory.getSignInfo(extendState2);

    }
}




