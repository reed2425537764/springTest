package cn.case6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/1 14:27
 */
@Configuration
public class Config {

    @Bean(name = "myBean")
    @Scope("prototype")
    public MyBean createMyBean() {
        return new MyBean();
    }

    @Bean
    public RunnableFactoryBean runnableFactoryBean() {
        return new RunnableFactoryBean();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Cat cat() {
        return new Cat();
    }



    @Bean
    //@Primary //byType注入的情况下，优先注入此bean
    public User anotherUserBean() {
        return new User();
    }
}
