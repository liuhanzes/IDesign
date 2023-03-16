package com.liuhanze.design_patterns.visitor.demo3;

public class VisitorMain {

    public void main(){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ElementA());
        objectStructure.addElement(new ElementB());

        objectStructure.accept(new VisitorA());
        objectStructure.accept(new VisitorB());


    }
}
