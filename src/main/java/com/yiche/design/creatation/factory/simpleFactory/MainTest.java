package com.yiche.design.creatation.factory.simpleFactory;

/**
 * @author liangyt
 * @create 2021-03-10 14:27
 */
public class MainTest {
    public static void main(String[] args) {
        WulinSimpleFactory wulinSimpleFactory = new WulinSimpleFactory();
        AbstractCar van = wulinSimpleFactory.newCar("van");
        AbstractCar mini = wulinSimpleFactory.newCar("mini");
        AbstractCar yiche = wulinSimpleFactory.newCar("yiche");
        van.run();
        mini.run();
       // yiche.run();
    }
}
