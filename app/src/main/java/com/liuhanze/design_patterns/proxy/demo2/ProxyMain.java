package com.liuhanze.design_patterns.proxy.demo2;

public class ProxyMain {

    public void main(){
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("娇娇");

        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveFlowers();
        proxy.giveDolls();
        proxy.giveChocolate();
    }
}
