package cn.case2;

import cn.case2.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6 {
    public static void main(String[] args) {
        //测试AOP

        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanCase2");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
}
