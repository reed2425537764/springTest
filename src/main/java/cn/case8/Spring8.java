package cn.case8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 17:12
 */
public class Spring8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.case8");
        Map<String, Person> beans = context.getBeansOfType(Person.class);
        System.out.println("beans = " + beans);

        /*
        可以动态注入bean
        context.registerBeanDefinition();*/
        context.close();
    }
}
