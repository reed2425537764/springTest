package cn.case12;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/28 15:14
 */
@Aspect
@Component
public class PerformEncoreIntroducer {

    @DeclareParents(value = "cn.case12.PerformanceImpl+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
