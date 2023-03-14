package com.liuhanze.design_patterns.observer.demo2;

import java.util.Observer;

/**
 * 使用java sdk实现的接口创建
 */
public class ObserverMain {

    public void main(){
        Observer nameObs = new NameObserver();
        Observer priceObs = new PriceObserver();

        Product product = new Product();
        product.addObserver(nameObs);
        product.addObserver(priceObs);

        product.setName("aaa");
        product.setPrice(1.2f);


    }
}
