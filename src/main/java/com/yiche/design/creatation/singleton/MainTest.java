package com.yiche.design.creatation.singleton;

/**
 * @author liangyt
 * @create 2021-03-09 18:54
 */
public class MainTest {
    public static void main(String[] args) {
        Person boss1 = Person.getboss();
        Person boss2 = Person.getboss();

        System.out.println(boss1 == boss2);

    }
}
