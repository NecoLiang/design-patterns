package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:28
 */

/**
 * 五菱总厂规范
 */
public abstract class WulinFactory {

    abstract AbstractMask newMask();

    abstract AbstractCar newCar();
}
