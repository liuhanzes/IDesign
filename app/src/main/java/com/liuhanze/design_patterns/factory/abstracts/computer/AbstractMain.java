package com.liuhanze.design_patterns.factory.abstracts.computer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * 抽象工厂模式  demo2
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
 */
public class AbstractMain {


    public void installComputer(IFactory factory){
        ICPU cpu = factory.createCPU();
        IBoard board = factory.createBoard();
        cpu.calculate();
        board.installCpu();
    }


    public void main() {
        IFactory factory = new IntelFactory();
        installComputer(factory);

        IFactory factory1 = new AmdFactory();
        installComputer(factory1);
    }


}
