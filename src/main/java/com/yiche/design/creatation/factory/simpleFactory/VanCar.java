package com.yiche.design.creatation.factory.simpleFactory;

/**
 * @author liangyt
 * @create 2021-03-10 14:37
 */
public class VanCar extends AbstractCar {
    public VanCar(){
        this.engine = "单缸发动机";
    }
    @Override
    public void run() {
        System.out.println(engine+"dadada");
    }
}
