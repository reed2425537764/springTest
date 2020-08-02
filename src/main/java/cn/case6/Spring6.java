package cn.case6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/1 14:26
 */
public class Spring6 {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.case6");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class, User.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("myBean"));

        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("runnableFactoryBean"));
        System.out.println(context.getBean("&runnableFactoryBean"));//&获取工厂本身 而不是工厂生产出来的bean
        System.out.println(context.getBean(RunnableFactoryBean.class));

        System.out.println(context.getBean("cat"));
        System.out.println(context.getBean("dog"));


        System.out.println(context.getBean("user"));
//        System.out.println(context.getBean(User.class));
        System.out.println(context.getBeansOfType(User.class));

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getUser());
        context.close();
    }
}
