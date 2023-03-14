package com.liuhanze.design_patterns.factory.abstracts.car;

/**
 * 抽象工厂模式 demo1
 */
public class CarMain {

    public void main(){
        IFactory factory = new BMWFactory();
        IEngine engine = factory.madeEngine();
        ISpeedBox speedBox = factory.madSpeedBox();
        engine.run();
        speedBox.changeSpeed();
        speedBox.changeSpeed();

        IFactory factory1 = new BYDFactory();
        IEngine engine1 = factory1.madeEngine();
        ISpeedBox speedBox1 = factory1.madSpeedBox();
        engine1.run();
        speedBox1.changeSpeed();
        speedBox1.changeSpeed();

        IFactory factory2 = new BenCiFactory();
        IEngine engine2 = factory2.madeEngine();
        ISpeedBox speedBox2 = factory2.madSpeedBox();
        engine2.run();
        speedBox2.changeSpeed();




    }
}
