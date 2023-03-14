package com.liuhanze.design_patterns.proxy.demo3;

public class SubjectDynamicProxy extends DynamicProxy{


    public static Subject getInstance(Subject subject){

        MyInvocationHandler handler = new MyInvocationHandler(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();


        Subject proxy = newProxyInstance(classLoader,classes,handler);
        return proxy;
    }

}
