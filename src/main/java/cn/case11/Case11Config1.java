package cn.case11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/26 16:41
 */

//使用SpEL表达式
@Configuration
public class Case11Config1 {



    //T()可以访问类作用域的方法和属性 即静态方法和常量
    @Value("#{T(System).currentTimeMillis()}")
    Long field1;

    //装配bean 使用bean ID
    @Value("#{case11Config}")
    Case11Config field2;

    //需要有getCount2()
    @Value("#{case11Config.count2}")
    Integer field3;

    //systemProperties包含了Java应用程序启动时所设置的所有属性（通常通过-D参数）
    @Value("#{systemProperties['whereami']}")
    String field4;

    //包含了应用程序所在机器上的所有环境变量
    //?.可以防止空指针异常
    @Value("#{systemEnvironment['PROCESSOR_ARCHITECTURE']?.toLowerCase()}")
    String field5;

    //?:三元运算符
    @Value("#{'field6' ?: 'field6Right'}")
    String field6;

    @Value("#{'field7' == null ? 'field7Left' : 'field7Right'}")
    String field7;

    @Value("#{${count} == 2}")
    Boolean field8;

    @Value("#{'CA0101.json' matches '^CA.*?json$'}")
    Boolean field9;

    @Value("#{'field10'[0]}")
    Character field10;

    @Value("#{case11Config.list[0]}")
    String field11;

}
