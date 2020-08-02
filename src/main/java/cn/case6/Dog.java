package cn.case6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/1 19:03
 */
public class Dog {
    @PostConstruct
    public void init() {
        System.out.println("====init"+this+"====");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("====destroy"+this+"====");
    }
}
