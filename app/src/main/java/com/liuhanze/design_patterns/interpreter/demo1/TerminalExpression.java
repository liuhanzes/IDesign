package com.liuhanze.design_patterns.interpreter.demo1;

import com.liuhanze.iutil.log.ILog;

public class TerminalExpression extends AbstractExpression{

    @Override
    void interpret(MContext context) {
        ILog.LogDebug("终结解释器");
    }
}
