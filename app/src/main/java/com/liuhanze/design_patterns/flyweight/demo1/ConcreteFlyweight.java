package com.liuhanze.design_patterns.flyweight.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * ConcreteFlyweight是继承Flyweight超类或实现Flyweight接口，并为内部状态增加存储空间。
 */
class ConcreteFlyweight implements Flyweight{

    @Override
    public void operation(String extendState) {
        ILog.LogDebug("具体的flyweight : "+extendState);
    }


}
