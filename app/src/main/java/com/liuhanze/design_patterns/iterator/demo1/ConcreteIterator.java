package com.liuhanze.design_patterns.iterator.demo1;

public class ConcreteIterator implements Iterator{

    private ConcreteAggregate concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate){
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object First() {
        return concreteAggregate.get(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if(current  < concreteAggregate.count()){
            ret = concreteAggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.get(current);
    }
}
