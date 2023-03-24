package com.liuhanze.design_patterns.interpreter.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 非终结符表达式
 * 文法中的每条规则对应于一个非终结表达式，具体到我们的例子就是加减法规则分别对应到AddExpression和SubExpression两个类。
 * 非终结符表达式根据逻辑的复杂程度而增加，原则上每个文法规则都对应一个非终结符表达式。
 */
public class UnterminalExpression extends AbstractExpression{

    /**
     * 每个非终结符表达式都会对其他表达式产生依赖
     * @param context
     */
    @Override
    void interpret(MContext context) {
        ILog.LogDebug("非终结表达式");
    }
}
