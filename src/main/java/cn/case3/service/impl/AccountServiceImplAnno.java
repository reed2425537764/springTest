package cn.case3.service.impl;

import cn.case3.dao.AccountDao;
import cn.case3.domain.Account;
import cn.case3.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountServiceAnno")
public class AccountServiceImplAnno implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void findAll() {
        accountDao.findAll();
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @Override
    public void transfer(int sourceId, int targetId, double money) {
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
