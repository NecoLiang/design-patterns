package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:25
 */
public class N95Mask extends AbstractMask {
    public N95Mask(){
        this.price = 5;
    }
    @Override
    public void protectMe() {
        System.out.println("高级的N95口罩刀枪不入");
    }
}
