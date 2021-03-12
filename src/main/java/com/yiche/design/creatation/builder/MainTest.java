package com.yiche.design.creatation.builder;

/**
 * @author liangyt
 * @create 2021-03-11 16:15
 */
public class MainTest {
    public static void main(String[] args) {
        XiaoMiBuilder xiaoMiBuilder = new XiaoMiBuilder();

        //建造手机
//        xiaoMiBuilder.customCam("1亿摄像头");
//        xiaoMiBuilder.customCpu("八核处理");
//        xiaoMiBuilder.customDisk("12G");
//        xiaoMiBuilder.customMem("32G");
//        Phone product = xiaoMiBuilder.getProduct();

        //自定义链式调用，抽象建造者返回本体，继续调用
        Phone product = xiaoMiBuilder.customMem("12G").customCpu("八核处理").customCam("1亿摄像头").customDisk("12G").getProduct();

        //注解定义链式调用
        Phone p2 = Phone.builder().cam("1").cpu("2").disk("3").mem("4").build();

        System.out.println(p2);
    }
}
