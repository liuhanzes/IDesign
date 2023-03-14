package com.liuhanze.design_patterns.proxy.demo3;

import com.liuhanze.iutil.log.ILog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理handler类
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 被代理实例
     */
    Subject obj = null;

    public MyInvocationHandler(Subject o){
        obj = o;
    }


    /**
     *
     * @param proxy 代理实例
     * @param method 被拦截的方法
     * @param args 方法的参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equalsIgnoreCase("doSomething")){
            ILog.LogDebug("invoke doSomething is exec...");
        }

        if(proxy instanceof Subject){

            //会打印
            ILog.LogDebug("invoke proxy is subject");
        }

        if(proxy instanceof RealSubject){

            //不会打印
            ILog.LogDebug("invoke proxy is RealSubject");
        }

        //执行被代理实例方法
        Object result = method.invoke(obj,args);
        return result;
    }



}
