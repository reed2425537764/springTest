package cn.case12;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/28 11:04
 */
@Aspect
@Component
public class Audience {


    @Pointcut("execution(void cn.case12.Performance.*(..))")
    public void performance() {

    }

    @Before("performance()")
    public void silenceCellPhone() {
        System.out.println("silence cellphone");
    }

    @Before("performance()")
    public void takeSeat() {
        System.out.println("take seat");
    }

    @After("performance()")
    public void takeAway() {
        System.out.println("take away");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("applause");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("demand refund");
    }
}
