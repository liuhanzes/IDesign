package com.liuhanze.design_patterns.interpreter.demo3;

import com.liuhanze.iutil.log.ILog;

import java.util.HashMap;

public class InterpreterMain {

    public void main(){

        String expStr = getExpStr();
        HashMap<String,Integer> map = getValue();
        Calculator calculator = new Calculator(expStr);
        ILog.LogDebug(expStr+"= "+calculator.run(map));

    }

    private HashMap<String, Integer> getValue() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        return map;
    }

    public String getExpStr(){
        return "a+b-c";
    }



}
