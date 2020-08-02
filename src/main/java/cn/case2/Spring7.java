package cn.case2;

import cn.case2.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring7 {
    public static void main(String[] args) {
        //基于注解的AOP配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanCase2Anno.xml");
        AccountService accountService = (AccountService) ac.getBean("accountServiceImpl");
        int i = accountService.findAll();
        System.out.println("i = " + i);
    }
}
