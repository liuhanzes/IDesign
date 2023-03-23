package com.liuhanze.design_patterns.interpreter.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式
 * <br/>
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 * <br/>
 * 解释器模式需要解决的是：如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实
 * 例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。
 * <br/>
 * 当有一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可使用解释器模式。
 * 用了解释器模式，就意味着可以很容易地改变和扩展文法，因为该模式使用类来表示文法规则，你可使用
 * 继承来改变或扩展该文法。也比较容易实现文法，因为定义抽象语法树中各个节点的类的实现大体类似，这些类都易于直接编写。
 */
public class InterpreterMain {

    public void main(){

        MContext mContext = new MContext();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new UnterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for(AbstractExpression expression : list){
            expression.interpret(mContext);
        }


    }

}
