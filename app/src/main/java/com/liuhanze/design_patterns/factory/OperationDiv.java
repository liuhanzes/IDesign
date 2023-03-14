package com.liuhanze.design_patterns.factory;

import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 除法运算
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return number1/number2;
    }

}
