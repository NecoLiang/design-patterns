package com.yiche.design.creatation.factory.FactoryMethod;

/**
 * @author liangyt
 * @create 2021-03-10 15:52
 */
public class RacingCar extends AbstractCar{
    public RacingCar (){
        this.engine = "v8发动机";
    }

    @Override
    public void run() {
        System.out.println(engine+"轰隆隆--");
    }
}
