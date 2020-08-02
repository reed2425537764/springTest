package cn.case7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 14:00
 */
//BeanPostProcessor(bean的后置处理器) 会在每个bean初始化的时候都调用

@Component
public class EchoBeanPostProcess implements BeanPostProcessor {

    //设置属性(依赖装配)之后触发
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            User user = (User) bean;
            user.setProperty01("set property in postProcessBeforeInitialization");
            System.out.println("===postProcessBeforeInitialization"+"\t\t"+this+"====");
        }
        return bean;
    }

    //bean init之后就触发
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof User) {
            System.out.println("===postProcessAfterInitialization"+"\t\t"+this+"====");
        }
        return bean;
    }

}
