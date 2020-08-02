package cn.dao.impl;

import cn.dao.AccountDao;
import cn.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class AccountDaoImpl1 implements AccountDao {

    private QueryRunner runner;

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


}
