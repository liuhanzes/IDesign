package com.liuhanze.design_patterns.factory.simple;

import com.liuhanze.design_patterns.factory.OperationAdd;
import com.liuhanze.design_patterns.factory.OperationDiv;
import com.liuhanze.design_patterns.factory.OperationMul;
import com.liuhanze.design_patterns.factory.OperationSub;

/**
 * 简单工厂模式
 *
 */
public class SimpleFactory {

    public static Operation createOperation(String type){
        Operation operation = null;

        switch (type){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}
