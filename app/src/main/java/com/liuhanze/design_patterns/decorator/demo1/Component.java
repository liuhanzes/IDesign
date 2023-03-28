package com.liuhanze.design_patterns.decorator.demo1;

/**
 * Component是定义一个对象接口，可以给这些对象动态地添加职责。
 * Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对象，如上面的成绩单。
 */
interface Component {
    void operation();
}
