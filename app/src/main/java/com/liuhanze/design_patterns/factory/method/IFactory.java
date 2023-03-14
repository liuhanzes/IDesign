package com.liuhanze.design_patterns.factory.method;

import com.liuhanze.design_patterns.factory.simple.Operation;

/**
 * 工厂方法模式
 */
public interface IFactory {
    Operation createOperation();
}
