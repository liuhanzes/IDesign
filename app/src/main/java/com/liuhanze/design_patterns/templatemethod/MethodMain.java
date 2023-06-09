package com.liuhanze.design_patterns.templatemethod;

/**
 * 模板方法模式
 * 当我们要完成在某一细节层次一致的一个过程或一系列步骤，
 * 但其个别步骤在更详细的层次上的实现可能不同时，我们通常考虑用模板方法模式来处理。
 *
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变一个算法的结构
 * 即可重定义该算法的某些特定步骤。
 */
public class MethodMain {

    public void main(){
        AnimalSwimming cat  = new CatSwim();
        cat.show();
        AnimalSwimming dog = new DogSwim();
        dog.show();
    }

}
