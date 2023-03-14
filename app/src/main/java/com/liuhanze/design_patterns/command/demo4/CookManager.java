package com.liuhanze.design_patterns.command.demo4;

public class CookManager {

    private static boolean runFlag = false;

    public static void runCookManager(){
        if(!runFlag){
            HotCook hotCook = new HotCook("张三");
            HotCook hotCook1 = new HotCook("李四");
            CoolCook coolCook = new CoolCook("王五");
            new Thread(hotCook1).start();
            new Thread(hotCook).start();
            new Thread(coolCook).start();


        }
    }
}
