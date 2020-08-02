package cn.case2.service.impl;

import cn.case2.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public int findAll() {
        try {
            System.out.println("findAll...");
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            System.out.println("finally");
            //After
        }
        //AfterReturning
    }
}
