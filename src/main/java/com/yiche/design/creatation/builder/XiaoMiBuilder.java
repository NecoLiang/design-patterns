package com.yiche.design.creatation.builder;

/**
 * @author liangyt
 * @create 2021-03-11 16:09
 */
public class XiaoMiBuilder  extends AbstractBuilder{

    public XiaoMiBuilder(){
         //phone = new Phone();
        phone = Phone.builder().build();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }
}
