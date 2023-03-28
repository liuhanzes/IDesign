package com.liuhanze.design_patterns.decorator.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * ConcreteComponent是定义了一个具体的对象，也可以给这个对象添加一些职责。
 * ConcreteComponent是最核心、最原始、最基本的接口或抽象类的实现，你要装饰的就是它。
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        ILog.LogDebug("ConcreteComponent operation() exec");
    }
}
