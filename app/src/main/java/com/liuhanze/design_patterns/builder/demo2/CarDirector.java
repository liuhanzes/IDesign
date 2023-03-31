package com.liuhanze.design_patterns.builder.demo2;

/**
 * 建造者模式的结构中还有一个指挥者类Director，该类主要有两个作用：一是它隔离了客户与创建过程；二是它控制产品的创建过程，
 * 包括某个buildPartX()方法是否被调用以及多个buildPartX()方法调用的先后次序等。指挥者针对抽象建造者编程，客户端只需
 * 要知道具体建造者的类型，即可通过指挥者类调用建造者的相关方法，返回一个完整的产品对象。在实际生活中也存在类似指挥者一样
 * 的角色，如一个客户去购买电脑，电脑销售人员相当于指挥者，只要客户确定电脑的类型，电脑销售人员可以通知电脑组装人员给客户
 * 组装一台电脑。
 */
public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car makeCar(){
        carBuilder.makeHead();
        carBuilder.makeBody();
        carBuilder.makeTail();
        return carBuilder.getCar();
    }
}
