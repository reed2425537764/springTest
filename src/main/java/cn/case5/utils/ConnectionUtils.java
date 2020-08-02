package cn.case5.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getThreadConnection() {
        Connection conn = tl.get();
        if (conn == null) {
            try {
                tl.set(dataSource.getConnection());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return tl.get();
    }

    public void removeConnection() {
        tl.remove();
    }
}
