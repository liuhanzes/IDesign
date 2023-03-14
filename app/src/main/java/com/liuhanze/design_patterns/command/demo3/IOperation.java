package com.liuhanze.design_patterns.command.demo3;

public interface IOperation {

    int getResult();

    void setResult(int result);

    void add(int num);

    void substract(int num);
}
