package com.liuhanze.design_patterns.bridge.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 被提炼的抽象化角色
 * 它引用实现化角色对抽象化角色进行修正。
 * 抽象角色引用实现角色，或者说抽象角色的部分实现是由实现角色完成的
 */
public class RefinedAbstraction extends Abstraction{

    //覆盖构造函数
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    //修正父类的行为
    @Override
    public void operation() {
        super.operation();
        ILog.LogDebug("RefinedAbstraction operation ...");
    }
}
