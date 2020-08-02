package cn.dao.impl;

import cn.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    public void findAll() {
        System.out.println("12321");
    }

    public void init() {
        System.out.println("AccountDaoImpl初始化了");
    }

    public void destory() {
        System.out.println("AccountDaoImpl销毁了");
    }
}
