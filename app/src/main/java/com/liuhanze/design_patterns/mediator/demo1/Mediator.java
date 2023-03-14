package com.liuhanze.design_patterns.mediator.demo1;

/**
 * 抽象中介者角色定义统一的接口，用于各同事角色之间的通信。
 */
interface Mediator {
    void sendMessage(String message,Colleague colleague);
}
