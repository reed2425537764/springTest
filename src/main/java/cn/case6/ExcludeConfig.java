package cn.case6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 10:55
 */
@Configuration
public class ExcludeConfig {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
