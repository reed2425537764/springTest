package cn.service.impl;

import cn.dao.AccountDao;
import cn.service.AccountService;

import java.util.Date;
import java.util.List;


public class AccountServiceImpl6 implements AccountService {

    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void findAll() {
        accountDao.findAll();
    }


}
