package com.liuhanze.design_patterns.command.demo4;

import com.liuhanze.iutil.log.ILog;

public class CoolCook implements ICookie, Runnable{

    private String cookieName;

    public CoolCook(String name){
        cookieName = name;
    }

    @Override
    public void cookie(int tableNum,String name) {
        int cookTime = (int)(20*Math.random());
        ILog.LogDebug("冷菜厨师"+cookieName+"正在为"+tableNum+"号桌做"+name);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
       while (true){
           ICommand command = CommandQueue.getOneCommand();
           if(command != null){
               command.setCookie(this);
               command.execute();
           }
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }


       }


    }
}
