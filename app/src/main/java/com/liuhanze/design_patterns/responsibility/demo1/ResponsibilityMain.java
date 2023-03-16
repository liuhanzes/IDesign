package com.liuhanze.design_patterns.responsibility.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 责任链模式/职责链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系，将这个对象连成一条链，并沿着这条链传递该请求，
 * 直到有一个请求处理它为止
 * 当客户提交一个请求时，请求是沿链传递直至有一个ConcreteHandler对象负责处理它
 * 接收者和发送者都没有对方的明确信息，且链中的对象自己也并不知道链的结构。结果是职责链可简化对象的相互连接，它们仅需保持
 * 一个指向其后继者的引用，而不需保持它所有的候选接受者的引用
 * 客户端来定义链的结构 随时地增加或修改处理一个请求的结构。增强了给对象指派职责的灵活性[
 *
 */
public class ResponsibilityMain {

    public void main(){
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        for(int i=0;i<5;i++){
            int random = (int)(Math.random()*30);
            ILog.LogDebug("random = "+random);
            handlerA.handlerRequest(random);
        }
    }
}
