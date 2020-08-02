package cn.case3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class TransactionConfig {

    @Bean("transactionManager")
    public PlatformTransactionManager getTransation(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
