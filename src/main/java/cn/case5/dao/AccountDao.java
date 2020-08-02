package cn.case5.dao;

import cn.case5.domain.Account;

public interface AccountDao {
    public abstract void findAll();

    public abstract void updateAccount(Account account);

    public abstract Account findAccountById(int id);
}
