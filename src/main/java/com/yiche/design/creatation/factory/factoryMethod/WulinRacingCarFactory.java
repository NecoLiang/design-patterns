package com.yiche.design.creatation.factory.factoryMethod;

/**
 * @author liangyt
 * @create 2021-03-10 15:57
 */
public class WulinRacingCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
