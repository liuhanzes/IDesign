package com.liuhanze.design_patterns.visitor.demo2;

public class VisitorMain {

    public void main(){

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Action visitorA = new SuccessAction();
        Action visitorB = new Marriage();

        objectStructure.display(visitorA);
        objectStructure.display(visitorB);

    }
}
