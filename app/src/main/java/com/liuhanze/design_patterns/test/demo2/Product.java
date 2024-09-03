package com.liuhanze.design_patterns.test.demo2;

import androidx.annotation.NonNull;

public class Product implements Cloneable{

    private String name ;
    private boolean canChange = false;

    public Product(ProductManager productManager,String name){
        if(productManager.canCreateProduct()){
            canChange = true;
            this.name = name;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @NonNull
    @Override
    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
