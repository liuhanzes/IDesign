package com.liuhanze.design_patterns.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public void set(int index,Object value){
        items.add(index,value);
    }
}
