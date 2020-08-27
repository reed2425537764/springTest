package cn.case11;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/26 10:35
 */
public class Spring11 {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.case11");
        //bean的作用域
        System.out.println(applicationContext.getBean("bean1"));
        System.out.println(applicationContext.getBean("bean1"));
        System.out.println(applicationContext.getBean("bean1"));

        //注入值(使用属性占位符)
        Case11Config config = applicationContext.getBean(Case11Config.class);
        config.getConfig();
        System.out.println(config.count);

        //注入值(使用SpEL表达式)
        Case11Config1 config1 = applicationContext.getBean(Case11Config1.class);
        System.out.println(config1.field1);
        System.out.println(config1.field2);
        System.out.println(config1.field3);
        System.out.println(config1.field4);
        System.out.println(config1.field5);
        System.out.println(config1.field6);
        System.out.println(config1.field7);
        System.out.println(config1.field8);
        System.out.println(config1.field9);
        System.out.println(config1.field10);
        System.out.println(config1.field11);
        applicationContext.close();
    }
}
