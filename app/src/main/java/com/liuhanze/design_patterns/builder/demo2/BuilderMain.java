package com.liuhanze.design_patterns.builder.demo2;

/**
 * 在以下情况下可以考虑使用建造者模式：
 *
 *     需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性。
 *     需要生成的产品对象的属性相互依赖，需要指定其生成顺序。
 *     对象的创建过程独立于创建该对象的类。在建造者模式中通过引入了指挥者类，将创建过程封装在指挥者类中，而不在建造者类和客户类中。
 *     隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品。
 *
 * 作者：竖起大拇指
 * 链接：https://www.jianshu.com/p/c6c33026b6be
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class BuilderMain {

    public void main(){
        CarBuilder carBuilder = new JeepBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        Car car = carDirector.makeCar();

    }
}
