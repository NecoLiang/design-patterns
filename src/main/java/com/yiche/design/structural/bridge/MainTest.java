package com.yiche.design.structural.bridge;


/**
 * 省去了创建很多类
 */
public class MainTest {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setSale(new StudentSale("学生",1));
        MiPhone miPhone = new MiPhone();
        miPhone.setSale(new OnlineSale("线上",20));

        String phone = iPhone.getPhone();
        String phone1 = miPhone.getPhone();
        System.out.println(phone);
        System.out.println(phone1);

    }
}
