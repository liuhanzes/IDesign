package com.liuhanze.design_patterns.interpreter.demo3;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left,Expression right){
        super(left, right);
    }

    @Override
    int interpreter(HashMap<String, Integer> map) {
        return left.interpreter(map) - right.interpreter(map);
    }
}
