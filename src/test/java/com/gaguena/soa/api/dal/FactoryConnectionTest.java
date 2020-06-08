package com.gaguena.soa.api.dal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryConnectionTest extends DataBaseSupportTest {

    @Test
    void openConnectionSuccess() throws SQLException {
        Connection connection = FactoryConnection.getConnection();
        assertNotNull(connection);
        assertFalse(connection.isClosed());
        System.out.println(System.getProperty("database.user"));
    }

    @Test
    void openConnectionassertThrowsNotEnvironmentKeyUserName() throws SQLException {
        System.getProperties().remove("database.user");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FactoryConnection.getConnection();
        });
    }

}
