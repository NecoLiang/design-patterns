package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:36
 */


/**
 * 抽象出来
 *      可以抽象成接口（只有方法），可以抽象成抽象类（有些属性也需要用）
 */
public class MainTest {
    public static void main(String[] args) {
        WulinWuhanMaskFactory wulinWuhanMaskFactory = new WulinWuhanMaskFactory();
        AbstractCar abstractCar = wulinWuhanMaskFactory.newCar();
        AbstractMask abstractMask = wulinWuhanMaskFactory.newMask();
        abstractMask.protectMe();

        WulinMiniCarFactory wulinMiniCarFactory = new WulinMiniCarFactory();
        AbstractCar abstractCar1 = wulinMiniCarFactory.newCar();
        AbstractMask abstractMask1 = wulinMiniCarFactory.newMask();
        abstractCar1.run();

    }
}
