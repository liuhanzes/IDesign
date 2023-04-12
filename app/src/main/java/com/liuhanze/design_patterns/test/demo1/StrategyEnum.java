package com.liuhanze.design_patterns.test.demo1;

public enum StrategyEnum {

    SteadyDeduction("com.liuhanze.design_patterns.test.demo1.SteadyDeduction"),
    FreeDeduction("com.liuhanze.design_patterns.test.demo1.FreeDeduction");


    private String value;

    StrategyEnum(String value){
        this.value = value;
    }


    public String getValue(){
        return value;
    }
}
