package com.liuhanze.design_patterns.interpreter.demo3;

import java.util.HashMap;
import java.util.Stack;

class Calculator {

    private Expression expression;

    /**
     * 构造函数传如表达式，并解析
     * @param expStr
     */
    public Calculator(String expStr){
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for(int i = 0 ; i < charArray.length ; i++){
            switch (charArray[i]){
                case '+':{
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                }break;
                case '-':{
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                }break;
                default:{
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                }break;
            }

        }

        this.expression = stack.pop();
    }


    public int run(HashMap<String ,Integer> map){
        return this.expression.interpreter(map);
    }

}
