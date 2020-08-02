package cn.case7;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 14:00
 */
@Component
public class User implements InitializingBean, DisposableBean {

    private Phone phone;
    private String property01;
    @Autowired
    ApplicationContext applicationContext;

    public User(Phone phone) {
        this.phone = phone;
        System.out.println("设置属性(依赖装配)完成");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===afterPropertiesSet"+"\t\t"+this+"====");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===destroy"+"\t\t"+this+"====");
    }

    public String getProperty01() {
        return property01;
    }

    public void setProperty01(String property01) {
        this.property01 = property01;
    }
}
