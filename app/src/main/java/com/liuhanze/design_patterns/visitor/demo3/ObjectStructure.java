package com.liuhanze.design_patterns.visitor.demo3;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    List<Element> elementList = new ArrayList<>();

    public void addElement(Element element) {
        elementList.add(element);
    }

    public void removeElement(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {

        for(Element element : elementList){
            element.accept(visitor);
        }

    }
}