package cn.case5.dao.impl;

import cn.case5.dao.AccountDao;
import cn.case5.domain.Account;
import cn.case5.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    private QueryRunner runner;

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public QueryRunner getRunner() {
        return runner;
    }

    @Override
    public void findAll() {
        String sql = "select * from account";
        List list = null;
        try {
            list = runner.query(sql, new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Object o : list) {
            System.out.println((Account) o);
        }
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set money=? where id=?";
        try {
            runner.update(connectionUtils.getThreadConnection(),sql, account.getMoney(), account.getId());
        } catch (SQLException e) {
            System.out.println("更新账户失败");
        }
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id=?";
        try {
            List<Account> list = runner.query(connectionUtils.getThreadConnection(),sql, new BeanListHandler<Account>(Account.class), id);
            if (list.size() == 0) {
                return null;
            }
            if (list.size() > 1) {
                throw new RuntimeException("账户多于1");
            }
            return list.get(0);
        } catch (SQLException e) {
            System.out.println("查询账户失败");
        }
        return null;
    }


}
