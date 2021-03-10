package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:49
 */
public abstract class WulinMaskFactory extends WulinFactory {

    abstract AbstractMask newMask();

    @Override
    AbstractCar newCar() {
        return null;
    }
}
