package cn.service.impl;

import cn.service.AccountService;

import java.util.Date;


public class AccountServiceImpl implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //private AccountDao cn.dao = new AccountDaoImpl();
    public void findAll() {
        //cn.dao.findAll();
        System.out.println(name+'\t'+age+'\t'+birthday);
    }
}
