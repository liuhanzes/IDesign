package com.liuhanze.design_patterns.factory.method;

import com.liuhanze.design_patterns.factory.OperationAdd;
import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 加法工厂
 */
public class OperationAddFactory  implements  IFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
