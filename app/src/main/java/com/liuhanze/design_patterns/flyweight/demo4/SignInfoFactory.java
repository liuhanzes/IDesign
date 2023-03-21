package com.liuhanze.design_patterns.flyweight.demo4;

import java.util.HashMap;

public class SignInfoFactory {

    private static HashMap<ExtendState,SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(ExtendState extendState){
        SignInfo result = null;
        if(!pool.containsKey(extendState)){
            result = new SignInfo();
            pool.put(extendState,result);
        }else{
            pool.get(extendState);
        }

        return result;
    }

}
