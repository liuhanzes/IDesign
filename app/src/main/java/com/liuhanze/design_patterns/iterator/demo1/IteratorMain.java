package com.liuhanze.design_patterns.iterator.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 迭代器模式
 * 提供一个方法顺序访问一个聚合对象中的各个元素，而又不暴漏该对象的内部表示
 * 当你需要访问一个集合对象，而且不管这些对象是什么都需要遍历的时候，你就应该考虑用迭代器模式。
 * 需要对聚集有多种方式遍历时，可以考虑用迭代器模式。
 * 为遍历不同的集合结构提供如开始、下一个、是否结束、当前哪一项等统一的接口。
 * 迭代器（Iterator）模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做
 * 到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。
 */
public class IteratorMain {

    public void main(){
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.set(0,"大鸟0");
        aggregate.set(1,"大鸟1");
        aggregate.set(2,"大鸟2");
        aggregate.set(3,"大鸟3");
        aggregate.set(4,"大鸟4");
        aggregate.set(5,"大鸟5");

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.First();
        while (!iterator.isDone()){
            ILog.LogDebug("请乘客"+iterator.currentItem()+"买票");
            iterator.Next();
        }

    }



}
