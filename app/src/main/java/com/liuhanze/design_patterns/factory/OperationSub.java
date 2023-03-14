package com.liuhanze.design_patterns.factory;

import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 减法运算
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return number1 - number2;
    }
}
