package com.liuhanze.design_patterns.interpreter.demo2;

import com.liuhanze.iutil.log.ILog;

/**
 * 程序有问题，跑不起来，只能做案例参考学习
 */
public class InterpreterMain {

    public void main(){

        PlayContext playContext = new PlayContext();
        ILog.LogDebug("上海滩");
        playContext.setText(" O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 G 0.5 E 0.5 D 3");

        AbstractExpression expression = null;

        try{
            while (playContext.getText().length() > 0){

                String str = playContext.getText().substring(0,1);
                switch (str){
                    case "O":
                        expression = new Scale();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "A":
                    case "B":
                        expression = new Note();
                        break;
                    default:
                        continue;
                }

                expression.interpret(playContext);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
