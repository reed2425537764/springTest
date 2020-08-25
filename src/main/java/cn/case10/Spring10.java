package cn.case10;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/25 16:23
 */
@Configuration
@PropertySource(value = {"classpath:jdbcConfig.properties"})
public class Spring10 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext("cn.case10");
        String url = applicationContext.getEnvironment().getProperty("url");
        System.out.println("url = " + url);

        System.out.println(applicationContext.getBean(Bean1.class));
        applicationContext.close();
    }

    @Bean
    @Conditional({MyCondition.class})
    public Bean1 bean() {
        return new Bean1();
    }
}
