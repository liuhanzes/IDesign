package com.liuhanze.design_patterns.factory.method;

import com.liuhanze.design_patterns.factory.OperationSub;
import com.liuhanze.design_patterns.factory.simple.Operation;

public class OperationSubFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
