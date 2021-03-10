package com.yiche.design.creatation.prototype;

/**
 * @author liangyt
 * @create 2021-03-10 12:02
 */
public class MainTest {
    public static void main(String[] args) throws  Exception{
        yicheMybatis yicheMybatis = new yicheMybatis();
        User zhangsan1 = yicheMybatis.getUser("zhangsan");
        zhangsan1.setName("李四");
        System.out.println(zhangsan1);
        User zhangsan2 = yicheMybatis.getUser("zhangsan");
        System.out.println(zhangsan2);
        User zhangsan3 = yicheMybatis.getUser("zhangsan");
        System.out.println(zhangsan3);
        User zhangsan4 = yicheMybatis.getUser("zhangsan");
        System.out.println(zhangsan4);
    }
}
