package com.liuhanze.design_patterns.component.demo2;

/**
 * 组合模式
 * 安全模式实现
 */
public class ComponentMain {

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
