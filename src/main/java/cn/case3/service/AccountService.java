package cn.case3.service;

import cn.case3.domain.Account;

public interface AccountService {
    public abstract void findAll();

    public abstract void updateAccount(Account account);

    public abstract void transfer(int sourceId, int targetId, double money);


}
