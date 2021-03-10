package com.yiche.design.creatation.factory.factoryMethod;

/**
 * @author liangyt
 * @create 2021-03-10 15:50
 */
public class MainTest {
    public static void main(String[] args) {
        WulinRacingCarFactory wulinRacingCarFactory = new WulinRacingCarFactory();
        AbstractCar racingCar = wulinRacingCarFactory.newCar();
        racingCar.run();

        WulinMiniCarFactory wulinMiniCarFactory = new WulinMiniCarFactory();
        AbstractCar miniCar = wulinMiniCarFactory.newCar();
        miniCar.run();

    }
}
