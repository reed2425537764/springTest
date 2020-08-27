package cn.case11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/26 10:52
 */
@Component
@PropertySource(value = {"classpath:case11.properties"})
public class Case11Config {

    List<String> list = Arrays.asList("str1", "str2", "str3", "str4");

    @Autowired
    Environment environment;

    //:后可设置默认值
    //使用属性占位符(property placeholder)   借助environment实现
    @Value("${count1:0}")
    Integer count;

    Integer count2 = 22;

    //environment的使用
    public void getConfig() {
        System.out.println(environment.getProperty("count", Integer.class, 0));
        System.out.println(environment.getProperty("count1", Integer.class, 0));


        System.out.println(environment.getRequiredProperty("count", Integer.class));
        try {
            System.out.println(environment.getRequiredProperty("count1", Integer.class));
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
        }

        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

    }

    //属性注入
    public Case11Config(@Value("${count}") Integer count1) {
        System.out.println("在构造器中： " + count1);
    }

    public Integer getCount2() {
        return count2;
    }

    public List<String> getList() {
        return list;
    }
}
