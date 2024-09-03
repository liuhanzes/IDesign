package com.liuhanze.design_patterns.test.demo2;

public class ProductManager {

    private boolean isPermittedCreate = false;

    public Product createProduct(String name){
        isPermittedCreate = true;
        Product p = new Product(this,name);
        new ProductEvent(p,ProductEventType.NEW_PRODUCT);
        return p;
    }

    public void abandonProduct(Product product){
        new ProductEvent(product,ProductEventType.DEL_PRODUCT);
        product = null;
    }

    public void editProduct(Product product,String name){
        product.setName(name);
        new ProductEvent(product,ProductEventType.EDIT_PRODUCT);
    }

    public boolean canCreateProduct(){
        return isPermittedCreate;
    }

    public Product clone(Product product){
        new ProductEvent(product,ProductEventType.CLONE_PRODUCT);
        return (Product) product.clone();
    }
}
