package com.yiche.design.creatation.factory.FactoryMethod;

/**
 * @author liangyt
 * @create 2021-03-10 14:37
 */

/**
 * 把功能提升一个层次，定义抽象（抽象类或者抽象接口）
 * 抽象类、接口就意味着多实现，多实现就意味着多功能
 */
public abstract class AbstractCar {

    String engine;

    public abstract void run();
}
