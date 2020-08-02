package cn.case5.factory;

import cn.case5.service.AccountService;
import cn.case5.service.impl.AccountServiceImpl;
import cn.case5.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


//事务控制与业务层分离
public class BeanFactory {
    private AccountServiceImpl as;
    private TransactionManager transactionManager;

    public void setAs(AccountServiceImpl as) {
        this.as = as;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public AccountService getAccountServiceProxy() {
        AccountService accountServiceProxy = (AccountService) Proxy.newProxyInstance(as.getClass().getClassLoader(), as.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("transferProxy".equals(method.getName())) {
                    transactionManager.beginTransaction();
                    try {
                        Object o = method.invoke(as, args);
                        transactionManager.commit();
                        return o;
                    }catch (Exception e){
                        transactionManager.rollback();
                        throw new RuntimeException("转账出错");
                    }finally {
                        transactionManager.release();
                    }
                }else {
                    return method.invoke(as, args);
                }
            }
        });
        return accountServiceProxy;
    }
}
