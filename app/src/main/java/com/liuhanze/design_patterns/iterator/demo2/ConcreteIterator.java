package com.liuhanze.design_patterns.iterator.demo2;

import java.util.Iterator;

public class ConcreteIterator implements Iterator {

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
