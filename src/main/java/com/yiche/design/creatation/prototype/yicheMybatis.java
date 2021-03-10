package com.yiche.design.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangyt
 * @create 2021-03-10 12:16
 */
public class yicheMybatis {
    //缓存user
    private Map<String,User> userCach = new HashMap<>();

    /**
     * 模拟从数据库查数据
     */
    public User getUser(String userName) throws  Exception{
        User user = null;
        if (userCach.containsKey(userName)){
            //缓存中直接拿容易出现脏缓存的问题
            //原型已经拿到但不能直接给
           //从这个对象中快速得到一个克隆体==原型模式
           user = userCach.get(userName);
        }else {
           user = getUserFromDb(userName);
        }
        return user;
    }
    private User getUserFromDb(String userName) throws Exception{
        System.out.println("从数据库查"+userName+"并创建对象");
        User user = new User();
        user.setAge(18);
        user.setName("张三");
        userCach.put(userName,(User)user.clone());
        return user;
    }
}
