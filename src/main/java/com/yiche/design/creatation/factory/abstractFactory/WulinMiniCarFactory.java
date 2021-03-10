package com.yiche.design.creatation.factory.abstractFactory;

import com.yiche.design.creatation.factory.simpleFactory.VanCar;

/**
 * @author liangyt
 * @create 2021-03-10 16:32
 */
public class WulinMiniCarFactory extends WulinCarFactory{

    @Override
    AbstractCar newCar() {
        return new MiniCar();
    }
}
