package cn.case9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/25 15:53
 */
public class Spring9 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.case9");
        System.out.println(applicationContext.containsBean("cat"));
        applicationContext.close();
    }
}
