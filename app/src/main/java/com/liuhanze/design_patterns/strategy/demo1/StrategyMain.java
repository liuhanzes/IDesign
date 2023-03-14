package com.liuhanze.design_patterns.strategy.demo1;

/**
 * 策略模式
 * 策略模式定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。
 *
 * 1、策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同
 * 的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合[DPE]。
 *
 * 2、策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。继承有助于析取出这些算法中的公共功能[DP]。
 *
 * 3、当不同的行为堆砌在一个类中时，就很难避免使用条件语句来选择合适的行为。将这些行为封装在一个个独立的Strategy类中，
 * 可以在使用这些行为的类中消除条件语句[DP]。
 *
 * 4、策略模式封装了变化。策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过
 * 程中听到需要在不同时间应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性[DPE]。
 */
public class StrategyMain {

    public void main(){
        //使用算法A
        StrategyContext context = new StrategyContext(new ConcreteStrategyA());
        context.execAlgorithm();

        //使用算法B
        context = new StrategyContext(new ConcreteStrategyB());
        context.execAlgorithm();

        //使用算法C
        context = new StrategyContext(new ConcreteStrategyC());
        context.execAlgorithm();
    }

}
