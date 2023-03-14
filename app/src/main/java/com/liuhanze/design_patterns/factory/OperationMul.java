package com.liuhanze.design_patterns.factory;

import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 乘法运算
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return number1*number2;
    }
}
