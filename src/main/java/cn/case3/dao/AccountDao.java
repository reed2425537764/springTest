package cn.case3.dao;

import cn.case3.domain.Account;

public interface AccountDao {
    public abstract void findAll();

    public abstract void updateAccount(Account account);

    public abstract Account findAccountById(int id);
}
