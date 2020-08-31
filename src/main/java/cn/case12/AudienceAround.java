package cn.case12;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/28 13:47
 */
//@Aspect
@Component
public class AudienceAround {

    @Pointcut("execution(void cn.case12.Performance.*(..))")
    public void performance() {

    }

    @Around("performance()")
    public void around(ProceedingJoinPoint jp) {
        try {
            System.out.println("before");
            jp.proceed();
            System.out.println("after");
            System.out.println("after return");
        } catch (Throwable throwable) {
            System.out.println("after");
            System.out.println("after throwing");
        }
    }
}
