package cn.case10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/25 16:31
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();

        String name = Bean.class.getName();
        System.out.println("name = " + name);
        if (metadata.isAnnotated(name)) {
            System.out.println(metadata.getAllAnnotationAttributes(name));
        }
        return environment.containsProperty("url");
    }
}
