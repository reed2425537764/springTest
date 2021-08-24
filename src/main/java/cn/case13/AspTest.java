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

    //匹配 包里的任意类
    @Pointcut("within(cn.case13.*)")
    public void pointcut1() {

    }

    //匹配 包里的任意类和所有子包里的任意类
    @Pointcut("within(cn.case13..*)")
    public void pointcut2() {

    }

    //带有 @AnnoTest标注的所有类的任意方法
    @Pointcut("@within(cn.case13.AnnoTest)")
    public void pointcut3() {

    }

    //带有 实现了IBean13_1接口的任何方法
    @Pointcut("target(cn.case13.case13_1.IBean13_1)")
    public void pointcut4() {

    }

    //带有 类上有AnnoTest的所有方法
    @Pointcut("@target(cn.case13.AnnoTest)")
    public void pointcut5() {

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
    }

    @Before("pointcut1()")
    public void before1() {
        System.out.println("within(cn.case13.*)");
    }

    @Before("pointcut2()")
    public void before2() {
        System.out.println("within(cn.case13..*)");
    }

    @Before("pointcut3()")
    public void before3() {
        System.out.println("@within(cn.case13.AnnoTest)");
    }

    @Before("pointcut4()")
    public void before4() {
        System.out.println("target(cn.case13.case13_1.IBean13_1)");
    }

    @Before("pointcut5()")
    public void before5() {
        System.out.println("@target(cn.case13.AnnoTest)");
    }
}
