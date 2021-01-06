package cn.case13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2021/1/4 16:51
 */
@Component
public class Bean13 {

    @Value("${test}")
    String test;

    @AnnoTest
    public void fun() {
        System.out.println("Bean13.fun");
    }

    public String getTest() {
        return test;
    }
}
