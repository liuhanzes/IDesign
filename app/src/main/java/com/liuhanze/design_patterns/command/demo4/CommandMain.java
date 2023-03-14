package com.liuhanze.design_patterns.command.demo4;

public class CommandMain {

    public void main(){

        CookManager.runCookManager();

        for(int i=0;i<5;i++){
            Water water = new Water();

            ChopCommand chopCommand = new ChopCommand(1);
            DuckCommand duckCommand = new DuckCommand(2);

            water.orderDish(chopCommand);
            water.orderDish(duckCommand);

            water.orderOver();
        }




    }
}
