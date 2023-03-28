package com.liuhanze.design_patterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.liuhanze.design_patterns.decorator.demo2.DecoratorMain;
import com.liuhanze.design_patterns.flyweight.demo2.FlyweightMain;
import com.liuhanze.design_patterns.interpreter.demo3.InterpreterMain;
import com.liuhanze.design_patterns.responsibility.demo1.ResponsibilityMain;
import com.liuhanze.design_patterns.visitor.demo3.VisitorMain;
import com.liuhanze.iutil.log.ILog;

public class MainActivity extends AppCompatActivity {

    private volatile int temp = 0;
    private  volatile  boolean  flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DecoratorMain().main();
    }

    private String  testFor(){
        for(int i=0;i<5;i++){
            if(i==3){
                return "123";
            }
        }

        return "bcd";
    }

    private void test(){
        try {
            ILog.LogDebug("111111111111");
            return ;

        }finally {
            ILog.LogDebug("2222222222");

        }
    }

    private void addTemp(){

        for(int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    for (int j=0;j<1000;j++){
                        temp++;
                    }
                }
            }.start();
        }

        while (Thread.activeCount() > 1)
            Thread.yield();

    }
}