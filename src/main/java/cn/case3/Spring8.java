package cn.case3;

import cn.case3.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring8 {
    public static void main(String[] args) {
        //基于XML声明式事务配置
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("beanCase3XML.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.transfer(2, 1, 100);*/

        //基于注解声明式事务配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanCase3Anno.xml");
        AccountService accountService = ac.getBean("accountServiceAnno", AccountService.class);
        accountService.transfer(2, 1, 100);
    }
}
