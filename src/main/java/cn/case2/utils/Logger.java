package cn.case2.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

    @Pointcut("execution(* cn.case2.service.impl.*.*(..))")
    public void pt1() {
    }

    @Before("pt1()")
    public void beforePrintLog() {
        System.out.println("beforePrintLog log");
    }

    @AfterReturning("pt1()")
    public void afterReturingPrintLog(JoinPoint joinPoint) {
        System.out.println("afterReturingPrintLog log");
        //System.out.println(joinPoint.getSignature().getName());
    }

    @AfterThrowing("pt1()")
    public void afterThrowingPrintLog() {
        System.out.println("afterThrowingPrintLog log");
    }

    @After(("pt1()"))
    public void afterPrintLog() {
        System.out.println("afterPrintLog log");
    }

    public Object roundPrintLog(ProceedingJoinPoint pjp) {
        System.out.println("beforePrintLog log round");
        try {
            Object[] args = pjp.getArgs();
            Object o = pjp.proceed(args);
            System.out.println("afterReturingPrintLog log round");
            return o;
        } catch (Throwable throwable) {
            System.out.println("afterThrowingPrintLog log round");
            throwable.printStackTrace();
        }finally {
            System.out.println("afterPrintLog log round" );
        }
        return null;
    }
}
