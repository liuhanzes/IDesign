package com.liuhanze.design_patterns.proxy.demo1;

public class ProxySubject implements ISubject{

    RealSubject realSubject;

    public ProxySubject(){
        realSubject = new RealSubject();
    }

    @Override
    public void request() {
        before();
        realSubject.request();
        after();
    }

    //预处理
    private void before(){
        //do something
    }


    //善后处理
    private void after(){
        //do something
    }

}
