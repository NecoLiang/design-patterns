package com.yiche.design.creatation.singleton;

/**
 * @author liangyt
 * @create 2021-03-09 18:55
 */

/**
 * 对象只能有一个
 */
public class Person {

    private String name;

    private String age;

    //懒汉、饿汉
    private volatile static Person instance ;
   // private final static Person instance = new Person() ;饿汉直接创建

    //单例模式构造器私有,外部不能实例化
    private Person(){
        System.out.println("创建了Person");
    }

    //提供给外部的方法
    //处理多线程创建多个对象 public synchronized static Person getboss()锁太大
    //双重检查+内存可见性volatile(避免指令重排)
    public  static Person getboss(){
        //如果没有再去创建,懒汉式
        if (instance == null){
            synchronized(Person.class){
                if (instance == null){
                    Person person = new Person();
                    //避免多线程创建问题
                    instance = person;
                }
            }
        }
        return instance;
    }
}
