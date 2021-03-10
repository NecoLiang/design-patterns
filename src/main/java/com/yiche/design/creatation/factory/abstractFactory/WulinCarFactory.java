package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:47
 */
public abstract class WulinCarFactory extends WulinFactory {
    @Override
    AbstractMask newMask() {
        return null;
    }

   abstract AbstractCar newCar();
}
