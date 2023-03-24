package com.liuhanze.design_patterns.interpreter.demo3;

import java.util.HashMap;

abstract class Expression {

    /**
     * 解析公式和数值，其中map中的key值是公式中的参数，value值是具体的数字
     * @param map
     * @return
     */
    abstract int interpreter(HashMap<String,Integer> map);
}
