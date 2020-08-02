package cn.service.impl;

import cn.service.AccountService;

import java.util.Date;

public class AccountServiceImpl3 implements AccountService {

    private String name;
    private Integer age;
    private Date birthday;

    /*set方法注入只要set方法*/
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //private AccountDao cn.dao = new AccountDaoImpl();
    public void findAll() {
        //cn.dao.findAll();
        System.out.println(name+'\t'+age+'\t'+birthday);
    }
}
