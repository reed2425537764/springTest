package cn.case3.dao.impl;

import cn.case3.dao.AccountDao;
import cn.case3.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void findAll() {
        String sql = "select * from account";
        List<Account> list = null;
        try {
            list = super.getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Account>(Account.class));
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
            super.getJdbcTemplate().update(sql, account.getMoney(), account.getId());
        } catch (Exception e) {
            System.out.println("更新账户失败");
        }
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id=?";
        try {
            List<Account> list = super.getJdbcTemplate().query(sql,
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
