package com.yiche.design.creatation.factory.simpleFactory;

/**
 * @author liangyt
 * @create 2021-03-10 14:37
 */

/**
 * 简单工厂
 * 传入class来创建car，通过反射无参构造car但是没有解决实际的问题
 */
public class WulinSimpleFactory {
    public AbstractCar newCar(String type){
        //一切从简原则
        if ("van".equals(type)){
            return new VanCar();
        }else if ("mini".equals(type)){
            return new MiniCar();
        }
        //更多的产品违背了开闭原则，应该直接扩展一个类。简单工厂的缺点
        return null;
    }
}
