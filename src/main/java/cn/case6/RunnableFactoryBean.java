package cn.case6;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/1 14:48
 */
public class RunnableFactoryBean implements FactoryBean<Jeep> {
    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    @Override
    public Class<?> getObjectType() {
        return Jeep.class;
    }
}
