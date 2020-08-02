package cn.case5.service.impl;

import cn.case5.dao.AccountDao;
import cn.case5.domain.Account;
import cn.case5.service.AccountService;
import cn.case5.utils.TransactionManager;


public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void findAll() {
        accountDao.findAll();
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void transfer(int sourceId, int targetId, double money) {
        try {
            transactionManager.beginTransaction();
            Account source = accountDao.findAccountById(sourceId);
            Account target = accountDao.findAccountById(targetId);
            if (source != null && target != null) {
                if (source.getMoney() - money >= 0) {
                    source.setMoney(source.getMoney() - money);
                    target.setMoney(target.getMoney() + money);
                    accountDao.updateAccount(source);
                    int i = 1/0;
                    accountDao.updateAccount(target);
                }else {
                    System.out.println("账户余额不足");
                }
            }else{
                System.out.println("账户输入有误");
            }
            transactionManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback();
        }finally {
            transactionManager.release();
        }
    }

    @Override
    public void transferProxy(int sourceId, int targetId, double money) {
        Account source = accountDao.findAccountById(sourceId);
        Account target = accountDao.findAccountById(targetId);
        if (source != null && target != null) {
            if (source.getMoney() - money >= 0) {
                source.setMoney(source.getMoney() - money);
                target.setMoney(target.getMoney() + money);
                accountDao.updateAccount(source);
                int i = 1/0;
                accountDao.updateAccount(target);
            }else {
                System.out.println("账户余额不足");
            }
        }else{
            System.out.println("账户输入有误");
        }
    }


}
