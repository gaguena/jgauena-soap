package com.gaguena.soa.api.dal;

import org.junit.jupiter.api.BeforeAll;

public abstract class DataBaseSupportTest {

    @BeforeAll
    static void initConfigDataBase() {
        System.setProperty("database.user", "root");
        System.setProperty("database.password", "Brasil04");
        System.setProperty("database.hostName", "localhost");
    }
}
