package cn.case7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 13:59
 */
public class Spring7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.case7");
        User user = context.getBean(User.class);
        System.out.println(user);
        System.out.println(user.getProperty01());

        System.out.println(Phone.APPLICATION_CONTEXT);
        context.close();
    }
}
