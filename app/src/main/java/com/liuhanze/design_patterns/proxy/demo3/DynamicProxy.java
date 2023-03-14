package com.liuhanze.design_patterns.proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;



public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?> []interfaces, InvocationHandler handler){

        //寻找JoinPoint连接点，AOP框架使用元数据定义
         if(true){
            //执行一个前置通知
            new BeforeAdvice().advice();
        }

        /**
         *  Proxy类的设计用到代理模式的设计思想，Proxy类对象实现了代理目标的所有接口，并代替目标对象进行实际的操作。
         *  但这种替代不是一种简单的替代，这样没有任何意义，代理的目的是在目标对象方法的基础上作增强，这种增强的本质
         *  常就是对目标对象的方法进行拦截。所以，Proxy应该包括一个方法拦截器，来指示当拦截到方法调用时作何种处理。
         *  InvocationHandler就是拦截器的接口。
         */
        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
