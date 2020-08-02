package cn.case6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/1 14:27
 */
//在bean创建前初始化，生命周期结束后销毁
/*
* 方法一：实现InitializingBean, DisposableBean接口
* 方法二：在@Bean指定方法 见Cat.java
* 方法三：@Po
* */
public class MyBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====afterPropertiesSet"+this+"====");
    }

    @Override   //不会生效 因为多例模式下bean的生命周期不归spring管理
    public void destroy() throws Exception {
        System.out.println("====destroy"+this+"====");
    }


}
