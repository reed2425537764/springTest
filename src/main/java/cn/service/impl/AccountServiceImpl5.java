package cn.service.impl;

import cn.dao.AccountDao;
import org.springframework.stereotype.Service;
import cn.service.AccountService;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


//@Scope("prototype")
@Service  //默认value是类名(首字母小写)
public class AccountServiceImpl5 implements AccountService {

    @Resource(name = "accountDaoImpl")
    //@Autowired
    private AccountDao accountDao = null;

    @PostConstruct
    public void init() {
        System.out.println("AccountDaoImpl初始化了");
    }

    @PreDestroy
    public void destory() {
        System.out.println("AccountDaoImpl销毁了");
    }

    public void findAll() {
        accountDao.findAll();
    }

}
