package com.liuhanze.design_patterns.factory.method;

import com.liuhanze.design_patterns.factory.OperationDiv;
import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 除法工厂
 */
public class OperationDivFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
