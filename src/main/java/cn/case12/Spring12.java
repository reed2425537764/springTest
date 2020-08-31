package cn.case12;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/28 11:03
 */
@Configuration
@EnableAspectJAutoProxy //需要@Configuration才能正常启用  因为该注解本质是@Import 而@Import为引入配置文件(需加@Configuration生效)
public class Spring12 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.case12");
        Performance performance = applicationContext.getBean(Performance.class);
        //增强方法
        performance.perform();
        //新增方法
        ((Encoreable) performance).performEncore();
        applicationContext.close();
    }
}
