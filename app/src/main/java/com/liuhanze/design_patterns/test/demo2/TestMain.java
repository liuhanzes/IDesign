package com.liuhanze.design_patterns.test.demo2;

public class TestMain {


    public void main(){

        EventDispatch eventDispatch = EventDispatch.getDispatch();
        eventDispatch.registerCustomer(new Beggar());
        eventDispatch.registerCustomer(new Commoner());
        eventDispatch.registerCustomer(new NobleMan());

        ProductManager productManager = new ProductManager();
        Product product = productManager.createProduct("小男孩");
        productManager.editProduct(product,"小胖孩");
        productManager.clone(product);

        productManager.abandonProduct(product);


    }
}
