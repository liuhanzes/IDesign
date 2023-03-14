package com.liuhanze.design_patterns.memento.demo3;

public class Originator {

    /**
     * 原发器的状态
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录，保存原发器状态
     * @return
     */
    public Memento createMemento(){
        return new MementoImpl(state);
    }

    /**
     * 恢复保存的状态
     * @param memento
     */
    public void recoveryMemento(Memento memento){
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }


    /**
     * 真正的备忘录对象，实现了备忘录窄接口，实现成内部私有类，不让外部类访问
     *
     *
     *  知识点 普通内部类和静态内部类区别
     *  1、普通内部类持有对外部类的引用，静态内部类没有持有外部类的引用。
     *  2、普通内部类能够访问外部类的静态和非静态成员，静态内部类不能访问外部类的非静态成员，他只能访问外部类的静态成员。
     *  3、一个普通内部类不能脱离外部类实体被创建，且可以访问外部类的数据和方法，因为他就在外部类里面。
     *
     *  例子：
     *  public class OuterClass {
     *
     *     // 普通成员变量
     *     private String outField = "out field";
     *     // 静态成员变量
     *     private static String outStaticField = "out static field";
     *
     *     // 普通内部类
     *     public class InnerClassA{
     *     }
     *     // 静态内部类
     *     public static class InnerStaticClassB{
     *     }
     * }
     *
     * 我们在idea或eclipse编译这个类所在的项目后，这个OuterClass.java会生成三个Class文件：
     *
     * OuterClass.class
     *
     * OuterClass$InnerClassA.class
     *
     * OuterClass$InnerStaticClassB.class
     *
     * 反编译后
     *
     *
     * public class OuterClass {
     *    private String outField = "out field";
     *    private static String outStaticField = "out static field";
     * }
     *
     * public class OuterClass$InnerClassA {
     *
     *    // $FF: synthetic field
     *    final OuterClass this$0;
     *
     *    public OuterClass$InnerClassA(OuterClass this$0) {
     *       this.this$0 = this$0;
     *    }
     *
     * public class OuterClass$InnerStaticClassB {
     *
     * }
     *
     * 我们可以看到普通内部类InnerClassA在编译成class文件后，其自动在class文件中引用了外部类OuterClass，
     * 而内部静态类则没有引用外部类。
     *
     * 这样普通内部类相比外部内部类有个好处——就是可以引用外部类的属性以及方法。但凡事有两面，因为内部类里面持有外
     * 部类的引用，如果内部类一直在执行，则外部类就不会被GC回收，如果外部类中含有大量资源，有可能会导致内存泄漏
     * （安卓中比较常见，比如外部类中有大量图片啥的）。
     */
    private static class MementoImpl implements Memento{

        private String state;

        public MementoImpl(String state){
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

    }

}
