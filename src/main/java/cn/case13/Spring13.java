package cn.case13;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: shiyuqin
 * @Date: 2021/1/4 16:50
 */
@EnableAspectJAutoProxy
@Configuration//spring boot 会把启动类当成配置类 而spring不会
public class Spring13 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.case13");
        Bean13 bean13 = applicationContext.getBean(Bean13.class);
        //bean13.fun();
        System.out.println(bean13.test);  //由于代理 此处打印null
        System.out.println(bean13.getTest());

        System.out.println(bean13.getTest());
        System.out.println(bean13.test);
        applicationContext.close();
    }
}
