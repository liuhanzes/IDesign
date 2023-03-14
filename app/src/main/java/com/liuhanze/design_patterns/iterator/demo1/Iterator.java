package com.liuhanze.design_patterns.iterator.demo1;

interface Iterator {

    Object First();
    Object Next();
    boolean isDone();
    Object currentItem();
}
