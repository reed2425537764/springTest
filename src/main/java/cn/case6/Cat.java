package cn.case6;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/1 18:44
 */
public class Cat {

    @Autowired
//    @Qualifier("anotherUserBean")
//    @Resource(name = "anotherUserBean")
    private User anotherUserBean;

    public User getUser() {
        return anotherUserBean;
    }

    public void init() {
        System.out.println("====init"+this+"====");
    }

    public void destroy() {
        System.out.println("====destroy"+this+"====");
    }
}
