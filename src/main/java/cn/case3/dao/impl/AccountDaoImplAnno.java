package cn.case3.dao.impl;

import cn.case3.dao.AccountDao;
import cn.case3.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("accountDao")
public class AccountDaoImplAnno implements AccountDao {

    @Autowired
    private JdbcTemplate template;


    @Override
    public void findAll() {
        String sql = "select * from account";
        List<Account> list = null;
        try {
            list = template.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Account account : list) {
            System.out.println(account);
        }
    }


    @Override
    public void updateAccount(Account account) {
        String sql = "update account set money=? where id=?";
        try {
            template.update(sql, account.getMoney(), account.getId());
        } catch (Exception e) {
            System.out.println("更新账户失败");
        }
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id=?";
        try {
            List<Account> list = template.query(sql,
                    new BeanPropertyRowMapper<Account>(Account.class), id);
            if (list.size() == 0) {
                return null;
            }
            if (list.size() > 1) {
                throw new RuntimeException("账户多于1");
            }
            return list.get(0);
        } catch (Exception e) {
            System.out.println("查询账户失败");
        }
        return null;
    }


}
