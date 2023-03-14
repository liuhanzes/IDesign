package com.liuhanze.design_patterns.factory.method;

import com.liuhanze.design_patterns.factory.OperationMul;
import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 乘法工厂
 */
public class OperationMulFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
