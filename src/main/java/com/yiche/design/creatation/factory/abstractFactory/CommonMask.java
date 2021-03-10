package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:25
 */
public class CommonMask extends AbstractMask{
    public CommonMask(){
        this.price = 1;
    }
    @Override
    public void protectMe() {
        System.out.println("简单医用外科口罩");
    }
}
