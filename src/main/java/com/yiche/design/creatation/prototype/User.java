package com.yiche.design.creatation.prototype;

/**
 * @author liangyt
 * @create 2021-03-10 12:16
 */
public class User implements Cloneable{

    private String name;
    private Integer age;

    public User(){
        System.out.println("创建了user对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        return user;
    }
}
