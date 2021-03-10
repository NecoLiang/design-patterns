package com.yiche.design.creatation.factory.simpleFactory;

import javax.sound.midi.Soundbank;

/**
 * @author liangyt
 * @create 2021-03-10 14:37
 */
public class MiniCar extends AbstractCar {
    public MiniCar(){
        this.engine = "四缸发动机";
    }
    @Override
    public void run() {
        System.out.println(engine+"tututu");
    }
}
