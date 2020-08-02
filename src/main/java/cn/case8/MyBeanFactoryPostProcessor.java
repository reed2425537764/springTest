package cn.case8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 17:23
 */
//spring容器后置处理器 在spring容器初始化之后触发
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    //在spring容器初始化后执行
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("====postProcessBeanFactory"+"\t\t"+this+"====");
        System.out.println(beanFactory.getBeanDefinitionCount());
        System.out.println(beanFactory.getSingletonCount());
        System.out.println(beanFactory.getBeanPostProcessorCount());
    }
}
