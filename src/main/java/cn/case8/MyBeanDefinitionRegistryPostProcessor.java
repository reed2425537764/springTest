package cn.case8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 18:14
 */
/*
* 此处理器 既能拿到beanFactory对象(同spring容器后置处理器) 也可以拿到BeanDefinitionRegistry
* BeanDefinitionRegistry可以动态注入bean对象
* */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        for (int i = 0; i < 10; i++) {
            BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
            beanDefinitionBuilder.addPropertyValue("name", i);
            registry.registerBeanDefinition("person"+i, beanDefinitionBuilder.getBeanDefinition());
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("====postProcessBeanDefinitionRegistry"+"\t\t"+this+"====");
    }
}
