package cn.case5.service;

import cn.case5.domain.Account;

public interface AccountService {
    public abstract void findAll();

    public abstract void updateAccount(Account account);

    public abstract void transfer(int sourceId, int targetId, double money);

    public abstract void transferProxy(int sourceId, int targetId, double money);

}
