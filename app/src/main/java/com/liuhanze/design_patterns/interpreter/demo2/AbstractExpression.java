package com.liuhanze.design_patterns.interpreter.demo2;

abstract class AbstractExpression {

    public void interpret(PlayContext context){
        if(context.getText().length() == 0){
            return ;
        }else{
            String playKey = context.getText().substring(0,1);
            context.setText(context.getText().substring(2));
            double playValue = Double.parseDouble(context.getText().substring(0,context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" "+1)));
            excute(playKey,playValue);
        }
    }

    /**
     * 抽象文法执行不同的文法子类，有不同的执行处理
     * @param key
     * @param value
     */
    public abstract void excute(String key,double value);
}
