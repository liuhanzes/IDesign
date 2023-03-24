package com.liuhanze.design_patterns.interpreter.demo3;

import java.util.HashMap;

class VarExpression extends Expression{

    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    @Override
    int interpreter(HashMap<String, Integer> map) {
        return map.get(key);
    }
}
