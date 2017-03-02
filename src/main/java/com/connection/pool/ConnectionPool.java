package com.connection.pool;

import java.sql.Connection;
import java.sql.SQLException;


public interface ConnectionPool {
    public Connection getConnection() throws SQLException, InterruptedException;
}
