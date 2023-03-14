package com.liuhanze.design_patterns.component.demo1;

/**
 * 组合模式
 * 将对象组合成树形结构以表示 “部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的
 * 使用具有一致性。
 * 当发现需求中是体现部分与整体层次的结构时，以及希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，
 * 就应该考虑用组合模式了。或者从一个整体中能够独立出部分模块或功能的场景。
 * 使用了组合模式后，我们可以看看，如果想增加一个树枝节点、树叶节点是不是都很容易，只要找到它的父节点就成，非常容易扩展，
 * 符合开闭原则，对以后的维护非常有利。
 *
 * 组合模式有两种不同的实现 透明模式和安全模式，这个例子就是透明模式 Leaf也实现了Component接口里面也有add和remove方法，
 * 但是没有实现，安全模式则相反
 */
class ComponentMain {

    public void main(){
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("composite XX");
        comp2.add(new Leaf("Leaf XXA"));
        comp2.add(new Leaf("Leaf XXB"));

        comp.add(comp2);

        root.add(new Leaf("Leaf C"));
        Leaf leafD = new Leaf("Leaf D");
        root.add(leafD);
        root.remove(leafD);

        root.display(1);
    }

}
