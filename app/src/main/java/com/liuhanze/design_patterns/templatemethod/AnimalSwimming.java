package com.liuhanze.design_patterns.templatemethod;

public abstract class AnimalSwimming {


    /**
     * 模板方法 一般定义成final 防止被重写
     */
    protected final void show(){
        System.out.printf("游泳比赛开始-有请下面选手");
        swimming();
    }

    /**
     * 基本方法，延迟到子类实现
     */
    public abstract void swimming();
}
