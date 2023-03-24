package com.liuhanze.design_patterns.interpreter.demo1;

/**
 * 抽象解释器
 * 具体的解释任务由各个实现类完成，具体的解释器分别由TerminalExpression和Non-terminalExpression完成。
 */
abstract class AbstractExpression {

    /**
     * 每个表达式必须有一个解析任务
     * @param context
     */
    abstract void interpret(MContext context);
}
