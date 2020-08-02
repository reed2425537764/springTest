package cn.case7;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 14:33
 */
@Component
//Spring利用BeanPostProcessor的postProcessBeforeInitialization方法，
// 判断是否实现ApplicationContextAware，如果实现则调用setApplicationContext把ApplicationContext传入该方法
// 处理类为ApplicationContextAwareProcessor
public class Phone implements ApplicationContextAware {
    static ApplicationContext APPLICATION_CONTEXT;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        APPLICATION_CONTEXT = applicationContext;
    }
}
