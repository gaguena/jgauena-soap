package com.gaguena.soa.api.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.gaguena.soa.api.exception.InvalidConnectionException;
import com.gaguena.soa.api.util.EnvironmentUtil;

public class FactoryConnection {

    private static Connection CONNECTION;

    private static Connection initConnection() {
        try {
            final String dataBaseUserName = EnvironmentUtil.properties("database.user");
            final String dataBasePassword = EnvironmentUtil.properties("database.password");
            return CONNECTION = DriverManager.getConnection(databaseUrl(), dataBaseUserName, dataBasePassword);
        } catch (SQLException ex) {
            throw new InvalidConnectionException(ex);
        }
    }

    public static Connection getConnection() {
        return Optional.ofNullable(CONNECTION).orElse(initConnection());
    }

    private static String databaseUrl() {
        return new StringBuilder("jdbc:mysql://")
                .append(EnvironmentUtil.properties("database.hostName"))
                .append(":3306/products_api")
                .toString();
    }
}
