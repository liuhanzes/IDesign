package com.liuhanze.design_patterns.interpreter.demo3;

abstract class SymbolExpression extends Expression{

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }
}
