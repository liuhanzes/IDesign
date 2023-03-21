package com.liuhanze.design_patterns.flyweight.demo3;

import com.liuhanze.iutil.log.ILog;

/**
 * ConcreteFlyweight是继承Flyweight超类或实现Flyweight接口，并为内部状态增加存储空间。
 * 该角色中需要注意的是内部状态处理应该与环境无关，不应该出现一个操作改变了内部状态，同时修改了外部状态，这是绝对不允许的。
 * 在抽象角色中，一般需要把外部状态和内部状态（当然了，可以没有内部状态，只有行为也是可以的）定义出来，避免子类的随意扩展。
 */
class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String extendState){
        super(extendState);
    }

    @Override
    public void operation(String extendState) {
        ILog.LogDebug("具体的flyweight : "+extendState);
    }


}
