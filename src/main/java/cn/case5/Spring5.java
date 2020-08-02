package cn.case5;

import cn.case5.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spring5 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanCase1.xml");
        /*AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.transfer(1,2,100);*/

        AccountService accountServiceProxy = (AccountService) ac.getBean("accountServiceProxy");
        accountServiceProxy.transferProxy(1,2,100);
    }
}
