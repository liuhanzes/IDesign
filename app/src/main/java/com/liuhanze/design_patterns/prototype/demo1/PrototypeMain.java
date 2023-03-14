package com.liuhanze.design_patterns.prototype.demo1;

import com.liuhanze.iutil.log.ILog;

/**
 * 原型模式
 * 用原型实例指定创建对象的类型，并且通过拷贝这些原型创建新对象。
 * 原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需知道任何创建的细节。
 * 一般在初始化的信息不发生变化的情况下，克隆是最好的办法。这既隐藏了对象创建的细节，又对性能是大大的提高。
 * 原型模式是对内存二进制流的拷贝，不需要重新new一个对象，不用重新初始化对象，构造函数也不会执行，而是动态地获得对象运行时的状态
 * 浅复制/浅拷贝，被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象(包含对象和数组)的引用都仍然指向原来的对象。
 * 使用原型模式时，引用的成员变量必须满足两个条件才不会被拷贝：一是类的成员变量，而不是方法内变量；二是必须是一个可变的引用对象，
 * 而不是一个原始类型或不可变对象，所以要想使用clone方法，在类的成员变量上不要加final关键字。
 * 但我们可能更需要这样的一种需求，把要复制的对象所引用的对象都复制一遍。
 * 深复制/深拷贝，深复制把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。
 */
public class PrototypeMain {

    public void main(){
        Prototype prototype = new ConcretePrototype("1");
        Prototype prototype1 = prototype.cloneObj();
        ILog.LogDebug("prototype id = "+prototype.getID());
        ILog.LogDebug("prototype1 id = "+prototype1.getID());
    }

}
