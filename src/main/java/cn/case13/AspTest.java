package cn.case13;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2021/1/4 16:32
 */
@Aspect
@Component
public class AspTest {

    @Pointcut("@annotation(cn.case13.AnnoTest)")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
    }
}
