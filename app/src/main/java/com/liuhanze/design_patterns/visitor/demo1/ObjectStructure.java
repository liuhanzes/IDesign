package com.liuhanze.design_patterns.visitor.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure类，能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素。
 */
class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();


    public void attach(Element element){
        elementList.add(element);
    }

    public void detach(Element element){
        elementList.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element e:elementList) {
            e.accept(visitor);
        }
    }

}
