package com.liuhanze.design_patterns.interpreter.demo2;

import com.liuhanze.iutil.log.ILog;

public class Scale extends AbstractExpression{

    @Override
    public void excute(String key, double value) {
        String scale = "";

        switch (Double.toString(value)){
            case "1":
                scale = "低音";
                break;
            case "2":
                scale = "中音";
                break;
            case "3":
                scale = "高音";
                break;
        }

        ILog.LogDebug("scale = "+scale);
    }


}
