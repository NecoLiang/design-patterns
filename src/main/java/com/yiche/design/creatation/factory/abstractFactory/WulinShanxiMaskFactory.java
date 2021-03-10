package com.yiche.design.creatation.factory.abstractFactory;

/**
 * @author liangyt
 * @create 2021-03-10 16:33
 */
public class WulinShanxiMaskFactory extends WulinMaskFactory {
    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }

}
